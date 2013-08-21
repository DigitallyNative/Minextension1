package Ruby_Stuff.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemRubyGem extends Item {

	public ItemRubyGem(int par1) {
		super(par1);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1RegisterIcon) {
		this.itemIcon = par1RegisterIcon.registerIcon("RubyStuff:rubyGem");
	}
	

}
