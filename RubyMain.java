package Ruby_Stuff;
import Ruby_Stuff.armor.ItemRubyBoots;
import Ruby_Stuff.armor.ItemRubyChestPlate;
import Ruby_Stuff.armor.ItemRubyHelmet;
import Ruby_Stuff.armor.ItemRubyLeggings;
import Ruby_Stuff.block.BlockRubyGemOre;
import Ruby_Stuff.item.ItemRubyGem;
import Ruby_Stuff.tool.ToolRubyAxe;
import Ruby_Stuff.tool.ToolRubyHoe;
import Ruby_Stuff.tool.ToolRubyPickaxe;
import Ruby_Stuff.tool.ToolRubyShovel;
import Ruby_Stuff.tool.ToolRubySword;
import Ruby_Stuff.worldGen.RubyWorldGeneration;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

//Written solely by SharkyGAMER www.minecraftforum.net/user/1393046-sharkygamer/

//Define basic information for mod
@Mod(modid = "MinextensionWIP", name = "Minextention 1: Ruby Items", version = "BETA (DEV & TEST) 1.1.0")

//Define client and server side requirements
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class RubyMain {
	
	//Define tools
	public static Item rubySword;
	public static Item rubyPickaxe;
	public static Item rubyAxe;
	public static Item rubyShovel;
	public static Item rubyHoe;
	
	public static Item emeraldSword;
	public static Item emeraldPickaxe;
	public static Item emeraldAxe;
	public static Item emeraldShovel;
	public static Item emeraldHoe;
	
	public static Item greenSapphireSword;
	public static Item greenSapphirePickaxe;
	public static Item greenSapphireAxe;
	public static Item greenSapphireShovel;
	public static Item greenSapphireHoe;
	
	public static Item blueSapphireSword;
	public static Item blueSapphirePickaxe;
	public static Item blueSapphireAxe;
	public static Item blueSapphireShovel;
	public static Item blueSapphireHoe;
	
	
	
	//Define blocks/ores
	public static Block rubyGemOre;
	
	//Define misc. items
	public static Item rubyGem;
	public static Item greenSapphire;
	public static Item blueSaphire;
	
	//Define armor
	public static Item rubyHelmet;
	public static Item rubyChestplate;
	public static Item rubyLeggings;
	public static Item rubyBoots;
	
	//Define world generation
	public static RubyWorldGeneration RSG_genWorld = new RubyWorldGeneration();
	
	
	
	//Define material:
	
	//1: Tools
	public static EnumToolMaterial RubyGem = EnumHelper.addToolMaterial("RubyGem", 3, 1000, 8.0f, 3.0f, 10); 
	public static EnumToolMaterial EmeraldGem = EnumHelper.addToolMaterial("EmeraldGem", 3, 866, 7.5f, 2.5f, 10);
	public static EnumToolMaterial GreenSapphire = EnumHelper.addToolMaterial("GreenSapphire", 4, 1600, 9.0f, 5.0f, 12);
	
	//2: Armor
	public static EnumArmorMaterial RubyGemArmor = EnumHelper.addArmorMaterial("RubyGem", 66, new int[] {3, 7, 5, 3}, 30);
	
	
	
	@EventHandler
	public void Load(FMLPreInitializationEvent Event) {
		
		//Settings for tools
		//1: Ruby
		rubySword = new ToolRubySword(1000, RubyGem).setUnlocalizedName("RubyStuff:ruby_Sword");
		rubyAxe = new ToolRubyAxe(1001, RubyGem).setUnlocalizedName("RubyStuff:ruby_Axe");
		rubyHoe = new ToolRubyHoe(1002, RubyGem).setUnlocalizedName("RubyStuff:ruby_Hoe");
		rubyShovel = new ToolRubyShovel(1003, RubyGem).setUnlocalizedName("RubyStuff:ruby_Shovel");
		rubyPickaxe = new ToolRubyPickaxe(1004, RubyGem).setUnlocalizedName("RubyStuff:ruby_Pickaxe");
		
		//2: Emerald
		emeraldSword = new ToolEmeraldSword(1012, EmeraldGem).setUnlocalizedName("RubyStuff:emerald_Pickaxe");
		
		//3: Green Sapphire
		greenSapphireSword = new ToolGreenSapphireSword(1020, GreenSapphire).setUnlocalizedName("RubyStuff:greenSapphire_Sword");
		
		//4: Blue Sapphire
	
		//Settings for armor
		rubyHelmet = new ItemRubyHelmet(1008, RubyGemArmor, ModLoader.addArmor("ruby"), 0).setUnlocalizedName("rubyHelmet").setCreativeTab(CreativeTabs.tabCombat);
		rubyChestplate = new ItemRubyChestPlate(1009, RubyGemArmor, ModLoader.addArmor("ruby"), 1).setUnlocalizedName("rubyChestPlate").setCreativeTab(CreativeTabs.tabCombat);
		rubyLeggings = new ItemRubyLeggings(10010, RubyGemArmor, ModLoader.addArmor("ruby"), 2).setUnlocalizedName("rubyLeggings").setCreativeTab(CreativeTabs.tabCombat);
		rubyBoots = new ItemRubyBoots(10011, RubyGemArmor, ModLoader.addArmor("ruby"), 3).setUnlocalizedName("rubyBoots").setCreativeTab(CreativeTabs.tabCombat);
		
		//Settings for blocks/ores
		rubyGemOre = new BlockRubyGemOre(1006, Material.rock).setUnlocalizedName("RubyStuff:rubyGem_Ore");
		
		//Settings for misc items
		rubyGem = new ItemRubyGem(1007).setUnlocalizedName("RubyStuff:ruby_gem");
		
		
		
		//Register tools
		GameRegistry.registerItem(rubySword, "rubySword");
		LanguageRegistry.addName(rubySword, "Ruby Sword");
		
		GameRegistry.registerItem(rubyAxe, "rubyAxe");
		LanguageRegistry.addName(rubyAxe, "Ruby Axe");
		
		GameRegistry.registerItem(rubyHoe, "rubyHoe");
		LanguageRegistry.addName(rubyHoe, "Ruby Hoe");
		
		GameRegistry.registerItem(rubyShovel, "rubyShovel");
		LanguageRegistry.addName(rubyShovel, "Ruby Shovel");
		
		GameRegistry.registerItem(rubyPickaxe, "rubyPickaxe");
		LanguageRegistry.addName(rubyPickaxe, "Ruby Pickaxe");
		
		//Register armor
		GameRegistry.registerItem(rubyHelmet, "rubyHelmet");
		LanguageRegistry.addName(rubyHelmet, "Ruby Helmet");
		
		GameRegistry.registerItem(rubyChestplate, "rubyChestplate");
		LanguageRegistry.addName(rubyChestplate, "Ruby Chestplate");
		
		GameRegistry.registerItem(rubyLeggings, "rubyLeggings");
		LanguageRegistry.addName(rubyLeggings, "Ruby Leggings");
		
		GameRegistry.registerItem(rubyBoots, "rubyBoots");
		LanguageRegistry.addName(rubyBoots, "Ruby Boots");
		
		//Register blocks/ores
		GameRegistry.registerBlock(rubyGemOre, "rubyGemOre");
		LanguageRegistry.addName(rubyGemOre, "Ruby Ore");
		
		//Register misc items
		GameRegistry.registerItem(rubyGem, "rubyGem");
		LanguageRegistry.addName(rubyGem, "Ruby");
		
		//Register world generation
		GameRegistry.registerWorldGenerator(RSG_genWorld);
		MinecraftForge.setBlockHarvestLevel(rubyGemOre, "pickaxe", 2);
		
		
		
		//Define recipes for tools
		GameRegistry.addRecipe(new ItemStack(rubySword), new Object[] {" R "," R "," S ", 'R', rubyGem, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(rubyAxe), new Object[] {"RR ","RS "," S ", 'R', rubyGem, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(rubyHoe), new Object[] {"RR "," S "," S ", 'R', rubyGem, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(rubyShovel), new Object[] {" R "," S "," S ", 'R', rubyGem, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(rubyPickaxe), new Object[] {"RRR"," S "," S ", 'R', rubyGem, 'S', Item.stick });
		
		//Define recipes for armor
		GameRegistry.addRecipe(new ItemStack(rubyHelmet), new Object[] {"RRR","R R", 'R', rubyGem });
		GameRegistry.addRecipe(new ItemStack(rubyChestplate), new Object[] {"R R","RRR","RRR", 'R', rubyGem });
		GameRegistry.addRecipe(new ItemStack(rubyLeggings), new Object[] {"RRR","R R","R R", 'R', rubyGem });
		GameRegistry.addRecipe(new ItemStack(rubyBoots), new Object[] {"R R","R R", 'R', rubyGem });
		
		//Define recipes for misc items
		GameRegistry.addSmelting(rubyGemOre.blockID, new ItemStack(rubyGem), 2.55f);
		
		
		
		
	}

}
