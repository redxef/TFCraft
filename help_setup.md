# Help me set this up on macOS later on.

1. clone to machine
2. `cd TFCraft && ./gradlew setupDecompWorkspace && ./gradlew setupDevWorkspace ideaModule`
3. open the build.gradle file in intellij
4. let everything load and close intellij
5. `./gradlew genIntellijRuns`
6. edit configuration: "Use classpath of module": xxx_main.
7. add build configuration:
 - click on the plus->gradle and give it a name.
 - Select the Gradle Project
 - Task: build
8. when running/building and it asks for an mcp config directory, supply this one: /Users/redxef/.gradle/caches/minecraft/net/minecraftforge/forge/1.7.10-10.13.4.1558-1.7.10/unpacked/conf
9. profit