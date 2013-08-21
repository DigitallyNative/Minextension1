package Ruby_Stuff.worldGen;

import java.util.Random;

import Ruby_Stuff.RubyMain;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class RubyWorldGeneration implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX*16, chunkZ*16);
			break;
		case 0:
			generateSurface(world, random, chunkX*16, chunkZ*16);
			break;
		case 1:
			generateEnd(world, random, chunkX*16, chunkZ*16);
			break;
		}
	}

	private void generateEnd(World world, Random random, int i, int j) {
	}

	private void generateSurface(World world, Random random, int chunkX,int chunkZ){
		for(int i = 0; i < 2; i++){
		int xCoord = chunkX + random.nextInt(16);
		int yCoord = random.nextInt(40);
		int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(RubyMain.rubyGemOre.blockID, 9)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

	private void generateNether(World world, Random random, int i, int j) {		
	}

}
