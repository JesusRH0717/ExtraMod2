package com.jesusrh.extramod.blocks;

import com.jesusrh.extramod.Main;
import com.jesusrh.extramod.init.ModBlocks;
import com.jesusrh.extramod.init.ModItems;
import com.jesusrh.extramod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;

public class RubyRefinedStairs extends BlockStairs implements IHasModel
{
	public RubyRefinedStairs(String name, IBlockState modelState) {
		
		
		super(modelState);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		useNeighborBrightness = true;
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
		//setLihtLevel();
		//setLightOpacity();
		//setBlockUnbreakable();
		
		ModBlocks.Blocks.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}
	

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

	
	}


