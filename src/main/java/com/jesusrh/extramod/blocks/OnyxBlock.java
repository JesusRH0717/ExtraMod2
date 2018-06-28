package com.jesusrh.extramod.blocks;

import com.jesusrh.extramod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class OnyxBlock extends BlockBase
{
	public OnyxBlock(String name, Material material) 
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

