package Ruby_Stuff.tool;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolRubyAxe extends ItemAxe{

	public ToolRubyAxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);

	}
	
	    @SideOnly(Side.CLIENT)public void registerIcons(IconRegister register) {
		    this.itemIcon = register.registerIcon("RubyStuff:ruby_Axe");
	}
}
