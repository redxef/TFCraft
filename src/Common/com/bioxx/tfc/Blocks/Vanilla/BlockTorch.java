package com.bioxx.tfc.Blocks.Vanilla;

import static net.minecraftforge.common.util.ForgeDirection.EAST;
import static net.minecraftforge.common.util.ForgeDirection.NORTH;
import static net.minecraftforge.common.util.ForgeDirection.SOUTH;
import static net.minecraftforge.common.util.ForgeDirection.WEST;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.bioxx.tfc.Reference;
import com.bioxx.tfc.TerraFirmaCraft;
import com.bioxx.tfc.Blocks.BlockTerraContainer;
import com.bioxx.tfc.Core.TFCTabs;
import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.Core.TFC_Time;
import com.bioxx.tfc.TileEntities.TELightEmitter;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;
import com.bioxx.tfc.api.TFCOptions;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTorch extends BlockTerraContainer
{
	IIcon offIcon;
	public BlockTorch()
	{
		super(Material.circuits);
		this.setTickRandomly(true);
		this.setCreativeTab(TFCTabs.TFCDecoration);
		setLightLevel(0.9375F);
	}

	@Override
	public int getLightValue(IBlockAccess world, int x, int y, int z)
	{
		int meta = world.getBlockMetadata(x, y, z);
		if(meta >= 8)
			return 0;
		return getLightValue();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		if(meta >= 8)
			return offIcon;
		return this.blockIcon;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register)
	{
		super.registerBlockIcons(register);
		this.offIcon = register.registerIcon(Reference.ModID + ":" + "torch_off");
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
	{
		if(!world.isRemote)
		{
			if(world.getBlockMetadata(x, y, z) < 8 && player.inventory.getCurrentItem() != null && 
					player.inventory.getCurrentItem().getItem() == TFCItems.Stick)
			{	
				player.inventory.consumeInventoryItem(TFCItems.Stick);
				TFC_Core.giveItemToPlayer(new ItemStack(TFCBlocks.Torch), player);
			}
			else if(player.inventory.getCurrentItem() != null && 
					player.inventory.getCurrentItem().getItem() == Item.getItemFromBlock(TFCBlocks.Torch))
			{
				TELightEmitter te = (TELightEmitter)world.getTileEntity(x, y, z);
				te.hourPlaced = (int)TFC_Time.getTotalHours();
				if (world.getBlockMetadata(x, y, z) >= 8)
				{
				    world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z)-8, 3);
				}
			}
			else if (world.getBlockMetadata(x, y, z) < 8)
			{
				world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z)+8, 3);
			}
		}
		else
		{
		    if(TFCOptions.enableDebugMode)
		    {
		        int metadata = world.getBlockMetadata(x, y, z);
				TerraFirmaCraft.log.info("Meta = " + (new StringBuilder()).append(getUnlocalizedName()).append(":").append(metadata).toString());
		    }
		}
		return true;
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	{
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();

		if(metadata >= 8)
			return ret;

		Item item = getItemDropped(metadata, world.rand, fortune);
		if (item != null)
		{
			ret.add(new ItemStack(item, 1, damageDropped(metadata)));
		}
		return ret;
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2)
	{
		return new TELightEmitter();
	}

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	 * cleared to be reused)
	 */
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
	{
		return null;
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	 * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	 */
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	 */
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	/**
	 * The type of render function that is called for this block
	 */
	@Override
	public int getRenderType()
	{
		return TFCBlocks.torchRenderId;
	}

	private boolean canSupportTorch(World world, int x, int y, int z)
	{
		if (World.doesBlockHaveSolidTopSurface(world, x, y, z))
		{
			return true;
		}
		else
		{
			Block block = world.getBlock(x, y, z);
			return block.canPlaceTorchOnTop(world, x, y, z);
		}
	}

	/**
	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	 */
	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z)
	{
		return world.isSideSolid(x - 1, y, z, EAST,  true) ||
				world.isSideSolid(x + 1, y, z, WEST,  true) ||
				world.isSideSolid(x, y, z - 1, SOUTH, true) ||
				world.isSideSolid(x, y, z + 1, NORTH, true) ||
				canSupportTorch(world, x, y - 1, z);
	}

	/**
	 * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
	 */
	@Override
	public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int meta)
	{
		int j1 = meta;

		if (side == 1 && this.canSupportTorch(world, x, y - 1, z))
		{
			j1 = 5;
		}

		if (side == 2 && world.isSideSolid(x, y, z + 1, NORTH, true))
		{
			j1 = 4;
		}

		if (side == 3 && world.isSideSolid(x, y, z - 1, SOUTH, true))
		{
			j1 = 3;
		}

		if (side == 4 && world.isSideSolid(x + 1, y, z, WEST, true))
		{
			j1 = 2;
		}

		if (side == 5 && world.isSideSolid(x - 1, y, z, EAST, true))
		{
			j1 = 1;
		}

		return j1;
	}

	/**
	 * Ticks the block if it's been scheduled
	 */
	@Override
	public void updateTick(World world, int x, int y, int z, Random rand)
	{
		super.updateTick(world, x, y, z, rand);

		if (world.getBlockMetadata(x, y, z) == 0)
		{
			this.onBlockAdded(world, x, y, z);
		}
		if(world.getBlockMetadata(x, y, z) < 8 && TFCOptions.torchBurnTime != 0)
		{
			TELightEmitter te = (TELightEmitter) world.getTileEntity(x, y, z);
			if ( (te != null && TFC_Time.getTotalHours() > te.hourPlaced + TFCOptions.torchBurnTime) || 
			        (world.isRaining() && world.canBlockSeeTheSky(x, y, z)) )
			{
				world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z)+8, 3);
			}
		}
	}

	/**
	 * Called whenever the block is added into the world. Args: world, x, y, z
	 */
	@Override
	public void onBlockAdded(World world, int x, int y, int z)
	{
		if (world.getBlockMetadata(x, y, z) == 0)
		{
			if (world.isSideSolid(x - 1, y, z, EAST, true))
			{
				world.setBlockMetadataWithNotify(x, y, z, 1, 3);
			}
			else if (world.isSideSolid(x + 1, y, z, WEST, true))
			{
				world.setBlockMetadataWithNotify(x, y, z, 2, 3);
			}
			else if (world.isSideSolid(x, y, z - 1, SOUTH, true))
			{
				world.setBlockMetadataWithNotify(x, y, z, 3, 3);
			}
			else if (world.isSideSolid(x, y, z + 1, NORTH, true))
			{
				world.setBlockMetadataWithNotify(x, y, z, 4, 3);
			}
			else if (this.canSupportTorch(world, x, y - 1, z))
			{
				world.setBlockMetadataWithNotify(x, y, z, 5, 3);
			}
		}

		((TELightEmitter) world.getTileEntity(x, y, z)).create();

		this.func_150109_e(world, x, y, z);
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	 * their own) Args: x, y, z, neighbor Block
	 */
	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block b)
	{
		this.checkValidity(world, x, y, z, b);
	}

	@Override
	public boolean isReplaceable(IBlockAccess world, int x, int y, int z)
	{
		return true;
	}

	protected boolean checkValidity(World world, int x, int y, int z, Block b)
	{
		if (this.func_150109_e(world, x, y, z))
		{
			int l = world.getBlockMetadata(x, y, z);
			boolean flag = false;

			if (!world.isSideSolid(x - 1, y, z, EAST, true) && l == 1)
			{
				flag = true;
			}

			if (!world.isSideSolid(x + 1, y, z, WEST, true) && l == 2)
			{
				flag = true;
			}

			if (!world.isSideSolid(x, y, z - 1, SOUTH, true) && l == 3)
			{
				flag = true;
			}

			if (!world.isSideSolid(x, y, z + 1, NORTH, true) && l == 4)
			{
				flag = true;
			}

			if (!this.canSupportTorch(world, x, y - 1, z) && l == 5)
			{
				flag = true;
			}

			if (flag)
			{
				this.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
				world.setBlockToAir(x, y, z);
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return true;
		}
	}

	protected boolean func_150109_e(World world, int x, int y, int z)
	{
		if (!this.canPlaceBlockAt(world, x, y, z))
		{
			if (world.getBlock(x, y, z) == this)
			{
				this.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
				world.setBlockToAir(x, y, z);
			}

			return false;
		}
		else
		{
			return true;
		}
	}

	/**
	 * Ray traces through the blocks collision from start vector to end vector returning a ray trace hit. Args: world,
	 * x, y, z, startVec, endVec
	 */
	@Override
	public MovingObjectPosition collisionRayTrace(World world, int x, int y, int z, Vec3 startVec, Vec3 endVec)
	{
		int l = world.getBlockMetadata(x, y, z) & 7;
		float f = 0.15F;

		if (l == 1)
		{
			this.setBlockBounds(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
		}
		else if (l == 2)
		{
			this.setBlockBounds(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
		}
		else if (l == 3)
		{
			this.setBlockBounds(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
		}
		else if (l == 4)
		{
			this.setBlockBounds(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
		}
		else
		{
			f = 0.1F;
			this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
		}

		return super.collisionRayTrace(world, x, y, z, startVec, endVec);
	}

	/**
	 * A randomly called display update to be able to add particles or other items for display
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random rand)
	{
		int meta = world.getBlockMetadata(x, y, z);
		if(meta >= 8)
			return;


		double centerX = x + 0.5F;
		double centerY = y + 0.7F;
		double centerZ = z + 0.5F;
		double d3 = 0.22;
		double d4 = 0.27;

		if ((meta & 7) == 1)
		{
			world.spawnParticle("smoke", centerX - d4, centerY + d3, centerZ, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("flame", centerX - d4, centerY + d3, centerZ, 0.0D, 0.0D, 0.0D);
		}
		else if ((meta & 7) == 2)
		{
			world.spawnParticle("smoke", centerX + d4, centerY + d3, centerZ, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("flame", centerX + d4, centerY + d3, centerZ, 0.0D, 0.0D, 0.0D);
		}
		else if ((meta & 7) == 3)
		{
			world.spawnParticle("smoke", centerX, centerY + d3, centerZ - d4, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("flame", centerX, centerY + d3, centerZ - d4, 0.0D, 0.0D, 0.0D);
		}
		else if ((meta & 7) == 4)
		{
			world.spawnParticle("smoke", centerX, centerY + d3, centerZ + d4, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("flame", centerX, centerY + d3, centerZ + d4, 0.0D, 0.0D, 0.0D);
		}
		else
		{
			world.spawnParticle("smoke", centerX, centerY, centerZ, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("flame", centerX, centerY, centerZ, 0.0D, 0.0D, 0.0D);
		}
	}

}
