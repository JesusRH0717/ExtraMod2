package com.jesusrh.extramod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyRefined extends BlockBase 
{
	public RubyRefined(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
		//setLihtLevel();
		//setLightOpacity();
		//setBlockUnbreakable();
	}
}
