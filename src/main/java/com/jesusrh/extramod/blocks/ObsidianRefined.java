package com.jesusrh.extramod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ObsidianRefined extends BlockBase
{
	
	public ObsidianRefined(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(50.0F);
		setResistance(6000.0F);
		setHarvestLevel("pickaxe", 3);
		//setLihtLevel();
		//setLightOpacity();
		//setBlockUnbreakable();		
	}

}
