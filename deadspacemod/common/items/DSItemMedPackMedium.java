package deadspacemod.common.items;

import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;
import deadspacemod.common.DeadSpaceCore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class DSItemMedPackMedium extends Item 
{

	public DSItemMedPackMedium(int par1) 
	{
		super(par1); //Returns super constructor: par1 is ID
		maxStackSize = 1;
		setCreativeTab(DeadSpaceCore.tabDeadSpace); //Tells the game what creative mode tab it goes in
	}
	
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("deadspacemod:Medium Med Pack");
	}
}