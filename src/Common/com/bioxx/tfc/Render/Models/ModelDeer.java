// Date: 09/07/2012 2:01:52 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package com.bioxx.tfc.Render.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.Entities.Mobs.EntityDeer;
import com.bioxx.tfc.api.Entities.IAnimal;
import com.bioxx.tfc.api.Entities.IAnimal.GenderEnum;
public class ModelDeer extends ModelBase
{
	//fields
	ModelRenderer Antler24;
	ModelRenderer Antler23;
	ModelRenderer Antler22;
	ModelRenderer Antler21;
	ModelRenderer Antler14;
	ModelRenderer Antler13;
	ModelRenderer Antler12;
	ModelRenderer Antler11;
	ModelRenderer hoof2;
	ModelRenderer Toes3;
	ModelRenderer Thigh1;
	ModelRenderer Ear2;
	ModelRenderer Ear1;
	ModelRenderer Calf2;
	ModelRenderer Tail;
	ModelRenderer Collar;
	ModelRenderer UpperLeg4;
	ModelRenderer Neck;
	ModelRenderer Rump;
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer snout;
	ModelRenderer Torso;
	ModelRenderer UpperLeg3;
	ModelRenderer Calf1;
	ModelRenderer lowerleg3;
	ModelRenderer lowerleg4;
	ModelRenderer Thigh2;
	ModelRenderer Toes4;
	ModelRenderer Toes2;
	ModelRenderer Toes1;
	ModelRenderer hoof1;
	ModelRenderer hoof3;
	ModelRenderer hoof4;
	boolean running= false;

	public ModelDeer()
	{
		textureWidth = 128;
		textureHeight = 64;

		Antler24 = new ModelRenderer(this, 44, 0);
		Antler24.addBox(-6.8F, -15.4F, -1.8F, 1, 2, 1);
		Antler24.setRotationPoint(0F, 0F, 0F);
		Antler24.setTextureSize(128, 64);
		Antler24.mirror = true;
		setRotation(Antler24, 0F, 0F, 0.2792527F);
		Antler23 = new ModelRenderer(this, 44, 0);
		Antler23.addBox(-2.8F, -11F, 8F, 1, 2, 1);
		//Antler23.addBox(0F,0F,0F,1,2,1);
		Antler23.setRotationPoint(0F, 0F, 0F);
		Antler23.setTextureSize(128, 64);
		Antler23.mirror = true;
		setRotation(Antler23, 0.8726646F, -0.4363323F, 0F);
		Antler22 = new ModelRenderer(this, 44, 0);
		Antler22.addBox(2.3F, -14.3F, -5.1F, 1, 3, 1);
		Antler22.setRotationPoint(0F, 0F, 0F);
		Antler22.setTextureSize(128, 64);
		Antler22.mirror = true;
		setRotation(Antler22, -0.2268928F, 0F, -0.3490659F);
		Antler21 = new ModelRenderer(this, 44, 0);
		Antler21.addBox(-2F, -13F, -2.5F, 1, 3, 1);
		Antler21.setRotationPoint(0F, -1F, -8F);
		Antler21.setTextureSize(128, 64);
		Antler21.mirror = true;
		setRotation(Antler21, 0F, 0F, 0F);
		//Antler21.addChild(Antler22);
		//Antler21.addChild(Antler23);
		//Antler21.addChild(Antler24);
		Antler14 = new ModelRenderer(this, 44, 0);
		Antler14.addBox(5.8F, -15.4F, -1.8F, 1, 2, 1);
		Antler14.setRotationPoint(0F, 0F, 0F);
		Antler14.setTextureSize(128, 64);
		Antler14.mirror = true;
		setRotation(Antler14, 0F, 0F, -0.2792527F);
		Antler13 = new ModelRenderer(this, 44, 0);
		Antler13.addBox(1.8F, -11F, 8F, 1, 2, 1);
		Antler13.setRotationPoint(0F, 0F, 0F);
		Antler13.setTextureSize(128, 64);
		Antler13.mirror = true;
		setRotation(Antler13, 0.8726646F, 0.4363323F, 0F);
		Antler12 = new ModelRenderer(this, 44, 0);
		Antler12.addBox(-3.3F, -14.3F, -5.1F, 1, 3, 1);
		Antler12.setRotationPoint(0F, 0F, 0F);
		Antler12.setTextureSize(128, 64);
		Antler12.mirror = true;
		setRotation(Antler12, -0.2268928F, 0F, 0.3490659F);
		Antler11 = new ModelRenderer(this, 44, 0);
		Antler11.addBox(1F, -13F, -2.5F, 1, 3, 1);
		Antler11.setRotationPoint(0F, -1F, -8F);
		Antler11.setTextureSize(128, 64);
		Antler11.mirror = true;
		setRotation(Antler11, 0F, 0F, 0F);
		//Antler11.addChild(Antler12);
		//Antler11.addChild(Antler13);
		//Antler11.addChild(Antler14);
		//hoof2.mirror = true;		
		Toes3 = new ModelRenderer(this, 18, 22);
		Toes3.addBox(-0.5F, 0.4F, -3F, 2, 1, 4);
		Toes3.setRotationPoint(0F, 5F, 0F);
		Toes3.setTextureSize(128, 64);
		setRotation(Toes3, 1.134464F, 0F, 0F);
		Thigh1 = new ModelRenderer(this, 40, 22);
		Thigh1.addBox(-1F, -2.3F, -2F, 2, 9, 5);
		Thigh1.setRotationPoint(-3F, 2F, 7F);
		Thigh1.setTextureSize(128, 64);
		setRotation(Thigh1, -0.1745329F, 0F, 0.1745329F);
		//Ear2.mirror = true;
		Ear2 = new ModelRenderer(this, 54, 16);
		Ear2.mirror = true;
		Ear2.addBox(-9F, -10F, -2F, 5, 3, 0);
		Ear2.setRotationPoint(0F, 0F, 0F);
		Ear2.setTextureSize(128, 64);
		setRotation(Ear2, 0F, 0.3490659F, 0.34906585F);
		Ear1 = new ModelRenderer(this, 54, 16);
		Ear1.addBox(4F, -10F, -2F, 5, 3, 0);
		Ear1.setRotationPoint(0F, 0F, 0F);
		Ear1.setTextureSize(128, 64);
		setRotation(Ear1, 0F, -0.3490659F, -0.34906585F);
		//Calf2.mirror = true;
		Calf2 = new ModelRenderer(this, 54, 7);
		Calf2.mirror = true;
		Calf2.addBox(-1F, -1F, 0F, 2, 6, 3);
		Calf2.setRotationPoint(0F, 6F, 0F);
		Calf2.setTextureSize(128, 64);
		setRotation(Calf2, 0.5585054F, 0F, 0F);
		Tail = new ModelRenderer(this, 24, 52);
		Tail.addBox(-1.5F, -0.5F, 0F, 3, 2, 9);
		Tail.setRotationPoint(0F, -1.5F, 10F);
		Tail.setTextureSize(128, 64);
		Tail.mirror = true;
		setRotation(Tail, -1.308997F, 0F, 0F);
		Collar = new ModelRenderer(this, 30, 38);
		Collar.addBox(0F, -2F, -4F, 4, 6, 7);
		Collar.setRotationPoint(-2F, -1F, -8F);
		Collar.setTextureSize(128, 64);
		Collar.mirror = true;
		setRotation(Collar, 1.151917F, 0F, 0F);
		//UpperLeg4.mirror = true;
		UpperLeg4 = new ModelRenderer(this, 30, 22);
		UpperLeg4.mirror = true;
		UpperLeg4.addBox(-1.25F, -1F, -1.5F, 2, 5, 3);
		UpperLeg4.setRotationPoint(4F, 5F, -7F);
		UpperLeg4.setTextureSize(128, 64);

		setRotation(UpperLeg4, 0.3490659F, 0F, 0.0349066F);
		Neck = new ModelRenderer(this, 57, 22);
		Neck.addBox(-2F, -4F, -2F, 4, 5, 8);
		Neck.setRotationPoint(0F, -1F, -8F);
		Neck.setTextureSize(128, 64);
		Neck.mirror = true;
		setRotation(Neck, 1.815142F, 0F, 0F);
		Rump = new ModelRenderer(this, 0, 47);
		Rump.addBox(-3F, -4F, 3F, 6, 10, 6);
		Rump.setRotationPoint(0F, 1.5F, 1F);
		Rump.setTextureSize(128, 64);
		Rump.mirror = true;
		setRotation(Rump, -0.0872665F, 0F, 0F);
		head = new ModelRenderer(this, 54, 35);
		head.addBox(-2.5F, -11F, -5F, 5, 6, 6);
		head.setRotationPoint(0F, -1F, -8F);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, 0.1570796F, 0F, 0F);
		head.addChild(Ear1);
		head.addChild(Ear2);
		body = new ModelRenderer(this, 18, 4);
		body.addBox(-4F, -11F, -8F, 8, 8, 10);
		body.setRotationPoint(0F, 1F, 2F);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, 1.43117F, 0F, 0F);
		leg1 = new ModelRenderer(this, 0, 16);
		leg1.addBox(-0F, -1F, 0F, 2, 9, 2);
		leg1.setRotationPoint(0F, 5F, 0F);
		leg1.setTextureSize(128, 64);
		setRotation(leg1, 0F, 0F, 0F);
		//leg2.mirror = true;
		leg2 = new ModelRenderer(this, 0, 16);
		leg2.mirror = true;
		leg2.addBox(-1F, -1F, 0F, 2, 9, 2);
		leg2.setRotationPoint(0F, 5F, 0F);
		leg2.setTextureSize(128, 64);

		setRotation(leg2, 0F, 0F, 0F);
		leg3 = new ModelRenderer(this, 8, 16);
		leg3.addBox(-0.5F,0F,0F,/*-0.5F, 3F, 0F,*/ 2, 7, 2);
		leg3.setRotationPoint(0F, 3F, -1F);
		leg3.setTextureSize(128, 64);
		setRotation(leg3, 0F, 0F, 0F);
		//leg4.mirror = true;
		leg4 = new ModelRenderer(this, 8, 16);
		leg4.mirror = true;
		leg4.addBox(-1.5F, 0F, 0F, 2, 7, 2);
		leg4.setRotationPoint(0F, 3F, -1F);
		leg4.setTextureSize(128, 64);

		setRotation(leg4,  -0.3490659F, 0F, -0.0349066F);
		snout = new ModelRenderer(this, 54, 0);
		snout.addBox(-1.5F, -9.3F, -9F, 3, 3, 4);
		snout.setRotationPoint(0F, 0F, 0F);
		snout.setTextureSize(128, 64);
		snout.mirror = true;
		//setRotation(snout, 0.1570796F, 0F, 0F);
		head.addChild(snout);
		Torso = new ModelRenderer(this, 0, 29);
		Torso.addBox(-3.5F, -3F, -5F, 7, 10, 8);
		Torso.setRotationPoint(0F, 1F, 2F);
		Torso.setTextureSize(128, 64);
		Torso.mirror = true;
		setRotation(Torso, 0.122173F, 0F, 0F);
		UpperLeg3 = new ModelRenderer(this, 30, 22);
		UpperLeg3.addBox(-0.7F, -1F, -1.5F, 2, 5, 3);
		UpperLeg3.setRotationPoint(-4F, 5F, -7F);
		UpperLeg3.setTextureSize(128, 64);
		setRotation(UpperLeg3, 0.3490659F, 0F, -0.0349066F);
		Calf1 = new ModelRenderer(this, 54, 7);
		Calf1.addBox(0F, -1F, 0F, 2, 6, 3);
		Calf1.setRotationPoint(0F, 7F, 0F);
		Calf1.setTextureSize(128, 64);
		setRotation(Calf1, 0.5585054F, 0F, 0F);
		lowerleg3 = new ModelRenderer(this, 30, 30);
		lowerleg3.addBox(-0.5F, 0F, 0F, 2, 6, 2);
		lowerleg3.setRotationPoint(0F, 7F, 0F);
		lowerleg3.setTextureSize(128, 64);
		setRotation(lowerleg3, 0F, 0F, 0F);
		//lowerleg4.mirror = true;
		lowerleg4 = new ModelRenderer(this, 30, 30);
		lowerleg4.mirror = true;
		lowerleg4.addBox(-1.5F, 0F, 0F, 2, 6, 2);
		lowerleg4.setRotationPoint(0F, 7F, 0F);
		lowerleg4.setTextureSize(128, 64);

		setRotation(lowerleg4, 0F, 0F, 0F);
		//Thigh2.mirror = true;
		Thigh2 = new ModelRenderer(this, 40, 22);
		Thigh2.mirror = true;
		Thigh2.addBox(-1F, -2.3F, -2F, 2, 9, 5);
		Thigh2.setRotationPoint(3F, 2F, 7F);
		Thigh2.setTextureSize(128, 64);

		setRotation(Thigh2, -0.1745329F, 0F, -0.1745329F);
		//Toes4.mirror = true;
		Toes4 = new ModelRenderer(this, 18, 22);
		Toes4.mirror = true;
		Toes4.addBox(-1.5F, 0.4F, -3F, 2, 1, 4);
		Toes4.setRotationPoint(0F, 5F, 0F);
		Toes4.setTextureSize(128, 64);

		setRotation(Toes4, 1.134464F, 0F, 0F);
		//Toes2.mirror = true;
		Toes2 = new ModelRenderer(this, 18, 22);
		Toes2.mirror = true;
		Toes2.addBox(-1.0F, 0.4F, -3F, 2, 1, 4);
		Toes2.setRotationPoint(0F, 8F, 0F);
		Toes2.setTextureSize(128, 64);

		setRotation(Toes2, 1.134464F, 0F, 0F);
		Toes1 = new ModelRenderer(this, 18, 22);
		Toes1.addBox(-0F, 0.4F, -3F, 2, 1, 4);
		Toes1.setRotationPoint(0F, 8F, 0F);
		Toes1.setTextureSize(128, 64);
		setRotation(Toes1, 1.134464F, 0F, 0F);
		hoof1 = new ModelRenderer(this, 30, 0);
		hoof1.addBox(-0F, 0F, -6.3F, 2, 1, 2);
		hoof1.setRotationPoint(0F, 5F, 0.5F);
		hoof1.setTextureSize(128, 64);
		setRotation(hoof1, 0F, 0F, 0F);
		hoof2 = new ModelRenderer(this, 30, 0);
		hoof2.mirror = true;
		hoof2.addBox(-0.5F, 0F, -6.3F, 2, 1, 2);
		hoof2.setRotationPoint(0F, 5F, -0.5F);
		hoof2.setTextureSize(128, 64);

		setRotation(hoof2, 0F, 0F, 0F);
		hoof3 = new ModelRenderer(this, 30, 0);
		hoof3.addBox(-0.5F, 0F, -6.3F, 2, 1, 2);
		hoof3.setRotationPoint(0F, 5F, -0.5F);
		hoof3.setTextureSize(128, 64);
		setRotation(hoof3, 0F, 0F, 0F);
		//hoof4.mirror = true;
		hoof4 = new ModelRenderer(this, 30, 0);
		hoof4.mirror = true;
		hoof4.addBox(-1.5F, 0F, -6.3F, 2, 1, 2);
		hoof4.setRotationPoint(0F, 5F, -0.5F);
		hoof4.setTextureSize(128, 64);

		setRotation(hoof4, 0F, 0F, 0F);

		UpperLeg4.addChild(leg4);
		leg4.addChild(lowerleg4);
		lowerleg4.addChild(Toes4);
		Toes4.addChild(hoof4);

		UpperLeg3.addChild(leg3);
		leg3.addChild(lowerleg3);
		lowerleg3.addChild(Toes3);
		Toes3.addChild(hoof3);

		Thigh1.addChild(Calf1);
		Calf1.addChild(leg1);
		leg1.addChild(Toes1);
		Toes1.addChild(hoof1);

		Thigh2.addChild(Calf2);
		Calf2.addChild(leg2);
		leg2.addChild(Toes2);
		Toes2.addChild(hoof2);

		Antler11.addChild(Antler12);
		Antler21.addChild(Antler22);
		Antler11.addChild(Antler13);
		Antler21.addChild(Antler23);
		Antler11.addChild(Antler14);
		Antler21.addChild(Antler24);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		running = false;
		running = ((EntityDeer)entity).getRunning();
		//int sex = 0;
		//long tempAge = 0;
		float age = 1f - TFC_Core.getPercentGrown((IAnimal)entity);
		/*if (entity instanceof EntityAnimalTFC){
			tempAge = Math.min(TFC_Time.getTotalTicks()-((EntityAnimalTFC)entity).adultTime,0);
			if(tempAge < 0) {
				age = (-1F)*tempAge / (((EntityAnimalTFC)entity).adultAge * TFC_Settings.dayLength);
			}
			sex = ((EntityAnimalTFC)entity).sex;
		}*/

		float aa =  2F - (1.0F - age);
		GL11.glTranslatef (0.0F, -6F * f5 * age/(float)Math.pow(aa,0.4),0);
		GL11.glPushMatrix ();
		float ab = (float)Math.sqrt(1.0F / aa);
		GL11.glScalef(ab, ab, ab);
		GL11.glTranslatef (0.0F, 22F * f5 * age/(float)Math.pow(aa,0.4),2F*f5*age/ab);
		if(((IAnimal)entity).getGender() == GenderEnum.MALE){
			if(aa <=1.75){
				Antler11.isHidden = false;
				Antler21.isHidden = false;
				if(aa <=1.5){
					Antler12.isHidden = false;
					Antler22.isHidden = false;
					if(aa <= 1.3){
						Antler13.isHidden = false;
						Antler23.isHidden = false;
						if(aa <= 1.1){
							Antler14.isHidden = false;
							Antler24.isHidden = false;
						}
					}
				}
			}
		}
		Antler11.render(f5);
		Antler21.render(f5);
		head.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glScalef(1.0F / aa, ab, 1.0F / aa);
		GL11.glTranslatef(0.0F, 22F * f5 * age/(float)Math.pow(aa,0.4), 0.0F);
		Thigh1.render(f5);
		UpperLeg4.render(f5);
		UpperLeg3.render(f5);
		Thigh2.render(f5);

		//snout.render(f5);
		//Ear2.render(f5);
		//Ear1.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glScalef(1.0F / aa, 1.0F / aa, 1.0F / aa);
		GL11.glTranslatef(0.0F, 22F * f5 * age, 0.0F);
		//hoof2.render(f5);
		//Toes3.render(f5);
		///Thigh1.render(f5);
		//Calf2.render(f5);
		Tail.render(f5);
		Collar.render(f5);
		///UpperLeg4.render(f5);
		Neck.render(f5);
		Rump.render(f5);
		body.render(f5);
		//leg1.render(f5);
		//leg2.render(f5);
		//leg3.render(f5);
		//leg4.render(f5);
		Torso.render(f5);
		///UpperLeg3.render(f5);
		//Calf1.render(f5);
		//lowerleg3.render(f5);
		//lowerleg4.render(f5);
		///Thigh2.render(f5);
		//Toes4.render(f5);
		//Toes2.render(f5);
		//Toes1.render(f5);
		//hoof1.render(f5);
		//hoof3.render(f5);
		//hoof4.render(f5);
		GL11.glPopMatrix();

		/*else
		{
			if (sex == 0)
			{
				Antler12.showModel = true;
				Antler22.showModel = true;
				Antler13.showModel = true;
				Antler23.showModel = true;
				Antler14.showModel = true;
				Antler24.showModel = true;
				Antler11.render(f5);
				Antler21.render(f5);
			}
			//hoof2.render(f5);
			//Toes3.render(f5);
			Thigh1.render(f5);
			//Ear2.render(f5);
			//Ear1.render(f5);
			//Calf2.render(f5);
			Tail.render(f5);
			Collar.render(f5);
			UpperLeg4.render(f5);
			Neck.render(f5);
			Rump.render(f5);
			head.render(f5);
			body.render(f5);
			//leg1.render(f5);
			//leg2.render(f5);
			//leg3.render(f5);
			//leg4.render(f5);
			//snout.render(f5);
			Torso.render(f5);
			UpperLeg3.render(f5);
			//Calf1.render(f5);
			//lowerleg3.render(f5);
			//lowerleg4.render(f5);
			Thigh2.render(f5);
			//Toes4.render(f5);
			//Toes2.render(f5);
			//Toes1.render(f5);
			//hoof1.render(f5);
			//hoof3.render(f5);
			//hoof4.render(f5);
		}    */
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles (float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles (f, f1, f2, f3, f4, f5, entity);

		//TerraFirmaCraft.log.info("f: "+f+"; f1: "+f1+"; f2: "+f2+"; f3: "+f3+"; f4: "+f4+"; f5: "+f5);
		f1 = Math.min(f1*7.5f, 0.75f);
		f*=0.95f;

		Antler11.isHidden = true;
		Antler12.isHidden = true;
		Antler13.isHidden = true;
		Antler14.isHidden = true;
		Antler21.isHidden = true;
		Antler22.isHidden = true;
		Antler23.isHidden = true;
		Antler24.isHidden = true;
		setRotation(Antler21,f4 / (180F / (float)Math.PI), f3 / (180F / (float)Math.PI), 0F);
		setRotation(head,f4 / (180F / (float)Math.PI)+ 0.1570796F, f3 / (180F / (float)Math.PI), 0F);
		setRotation(Antler11,f4 / (180F / (float)Math.PI), f3 / (180F / (float)Math.PI), 0F);
		setRotation(Torso, 0.122173F, 0F, 0F);
		setRotation(Collar,f4 / (3*(180F / (float)Math.PI))+ 1.151917F,f3 / (3*(180F / (float)Math.PI)), 0F);
		setRotation(Neck,f4 / (1.5F*(180F / (float)Math.PI))+ 1.815142F,f3 / (1.5F*(180F / (float)Math.PI)), 0F);
		setRotation(Rump, -0.0872665F, 0F, 0F);
		setRotation(body, 1.43117F, 0F, 0F);
		setRotation(Calf1, 0.5585054F, 0F, - 0.1745329F);
		setRotation(Calf2,0.5585054F, 0F, 0.1745329F);
		setRotation(Toes3,1.134464F,0,0);
		setRotation(hoof1,-1.134464F, 0F, 0F);
		setRotation(hoof2,-1.134464F, 0F, 0F);
		setRotation(hoof3,-1.134464F, 0F, 0F);
		setRotation(hoof4, -1.134464F, 0F, 0F);

		setRotation(Tail, -1.308997F, 0F, 0F);		

		setRotation(leg1, -22F/180F * (float)Math.PI, 0F, 0F);
		setRotation(leg2, -22F/180F * (float)Math.PI, 0F, 0F);
		setRotation(leg3, -0.3490659F, 0F,0.0349066F);
		setRotation(leg4, -0.3490659F, 0F,-0.0349066F);

		setRotation(UpperLeg4, 0.3490659F, 0F, 0.0349066F);
		setRotation(UpperLeg3, 0.3490659F, 0F, -0.0349066F);
		setRotation(Thigh1, -0.1745329F, 0F, 0.1745329F);
		setRotation(Thigh2,  -0.1745329F, 0F, -0.1745329F);

		if(!running){
			setRotation(UpperLeg4,MathHelper.cos(f/1.5F + 3F*(float)Math.PI/2F) * 0.7F * f1+ 0.3490659F, 0F, 0.0349066F);
			setRotation(UpperLeg3,MathHelper.cos(f/1.5F + (float)Math.PI/2F) * 0.7F * f1+ 0.3490659F, 0F, -0.0349066F);
			setRotation(Thigh1,MathHelper.cos(f/1.5F  + (float)Math.PI*7F/4F) * 0.7F * f1 -0.1745329F, 0F, 0.1745329F);
			setRotation(Thigh2, MathHelper.cos(f/1.5F + 3f*(float)Math.PI/4F) * 0.7F * f1 -0.1745329F, 0F, -0.1745329F);
			if (MathHelper.sin(f/1.5F + (float)Math.PI/2F) * 0.7F * f1 > 0){
				setRotation(lowerleg3,MathHelper.sin(f/1.5F + (float)Math.PI/2F) * 1.4F * f1, 0F, 0F);
				setRotation(leg3,-MathHelper.sin(f/1.5F + (float)Math.PI/2F) * 0.7F * f1  -0.3490659F, 0F,0.0349066F);
				setRotation(Toes3,MathHelper.sin(f/1.5F + (float)Math.PI/2F) * 2.1F * f1 + 1.134464F,0,0);
			}
			if (MathHelper.sin(f/1.5F + 1F*(float)Math.PI/2F)*0.7F * f1 < 0){
				setRotation(lowerleg4,MathHelper.sin(f/1.5F + 3F*(float)Math.PI/2F) * 1.4F * f1, 0F, 0F);
				setRotation(leg4,-MathHelper.sin(f/1.5F + 3F*(float)Math.PI/2F) * 0.7F * f1  -0.3490659F, 0F,-0.0349066F);
				setRotation(Toes4,MathHelper.sin(f/1.5F + 3F*(float)Math.PI/2F) * 2.1F * f1 + 1.134464F,0,0);
			}
			if(MathHelper.sin(f/1.5F  + (float)Math.PI*7F/4F) * 0.7F * f1 > 0){
				setRotation(Calf1,MathHelper.sin(f/1.5F  + (float)Math.PI*7F/4F) * 1.4F * f1 + 0.5585054F, 0F, - 0.1745329F);
				setRotation(leg1,-MathHelper.sin(f/1.5F  + (float)Math.PI*7F/4F) * 1.4F * f1 -22F/180F * (float)Math.PI, 0F, 0F);
				setRotation(Toes1,MathHelper.sin(f/1.5F  + (float)Math.PI*7F/4F) * 2.1F * f1 + 1.134464F, 0F, 0F);
			}			
			if (MathHelper.sin(f/1.5F + 3f*(float)Math.PI/4F) * 0.7F * f1 > 0){
				setRotation(Calf2,MathHelper.sin(f/1.5F + 3f*(float)Math.PI/4F) * 1.4F * f1 + 0.5585054F, 0F, 0.1745329F);
				setRotation(leg2,-MathHelper.sin(f/1.5F + 3f*(float)Math.PI/4F) * 1.4F * f1 -22F/180F * (float)Math.PI, 0F, 0F);
				setRotation(Toes2,MathHelper.sin(f/1.5F + 3f*(float)Math.PI/4F) * 2.1F * f1 + 1.134464F, 0F, 0F);
			}

		}
		else{
			if (MathHelper.cos(f/1.5F + 5*(float)Math.PI/4F) > -Math.sqrt(0.5) && MathHelper.cos(f/1.5F +5*(float)Math.PI/4F) < Math.sqrt(0.5)){
				setRotation(UpperLeg4,MathHelper.cos(f/1.5F + 5F*(float)Math.PI/4F) * 2.8F * f1+ 0.3490659F, 0F, 0.0349066F);
			}
			if (MathHelper.sin(f/1.5F + 5F*(float)Math.PI/4F - 3F*(float)Math.PI/8)> 0){
				setRotation(lowerleg4,MathHelper.sin(f/1.5F + 5F*(float)Math.PI/4F - 3F*(float)Math.PI/8) * 3.5F * f1, 0F, 0F);
				setRotation(leg4,-MathHelper.sin(f/1.5F + 5F*(float)Math.PI/4F - 3F*(float)Math.PI/8) * 3.5F * f1  -0.3490659F, 0F,-0.0349066F);
				setRotation(Toes4,MathHelper.sin(f/1.5F + 5F*(float)Math.PI/4F - 3F*(float)Math.PI/8) * 2.1F * f1 + 1.134464F,0,0);
			}


			if (MathHelper.cos(f/1.5F + (float)Math.PI/2F) > -Math.sqrt(0.5) && MathHelper.cos(f/1.5F + (float)Math.PI/2F) < Math.sqrt(0.5)){
				setRotation(UpperLeg3,MathHelper.cos(f/1.5F + (float)Math.PI/2F) * 2.8F * f1+ 0.3490659F, 0F, -0.0349066F);
			}
			if (MathHelper.sin(f/1.5F + (float)Math.PI/2F - 3F*(float)Math.PI/8) > 0){
				setRotation(lowerleg3,MathHelper.sin(f/1.5F + (float)Math.PI/2F - 3F*(float)Math.PI/8) * 3.5F * f1, 0F, 0F);
				setRotation(leg3,-MathHelper.sin(f/1.5F + (float)Math.PI/2F - 3F*(float)Math.PI/8)* 3.5F * f1  -0.3490659F, 0F,0.0349066F);
				setRotation(Toes3,MathHelper.sin(f/1.5F + (float)Math.PI/2F - 3F*(float)Math.PI/8) * 2.1F * f1 + 1.134464F,0,0);
			}

			setRotation(Thigh1,MathHelper.cos(f/1.5F  + (float)Math.PI*7F/4F) * 2.8F * f1 -0.1745329F, 0F, 0.1745329F);
			setRotation(Thigh2, MathHelper.cos(f/1.5F + 3f*(float)Math.PI/4F) * 2.8F * f1 -0.1745329F, 0F, -0.1745329F);
		}
	}

}
