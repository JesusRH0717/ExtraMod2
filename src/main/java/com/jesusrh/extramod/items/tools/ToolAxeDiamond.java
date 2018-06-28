package com.jesusrh.extramod.items.tools;

import com.jesusrh.extramod.Main;
import com.jesusrh.extramod.init.ModItems;
import com.jesusrh.extramod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxeDiamond extends ItemAxe implements IHasModel {
	
	public ToolAxeDiamond(String name, ToolMaterial material)
	{
		super(material, 8.0F, -3.0F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}


