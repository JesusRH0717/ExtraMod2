package com.jesusrh.extramod.init;

import java.util.ArrayList;
import java.util.List;

import com.jesusrh.extramod.blocks.BlockBase;
import com.jesusrh.extramod.blocks.EmeraldRefined;
import com.jesusrh.extramod.blocks.ObsidianRefined;
import com.jesusrh.extramod.blocks.OnyxBlock;
import com.jesusrh.extramod.blocks.OnyxOre;
import com.jesusrh.extramod.blocks.PerlaBlock;
import com.jesusrh.extramod.blocks.PerlaOre;
import com.jesusrh.extramod.blocks.RubyBlock;
import com.jesusrh.extramod.blocks.RubyOre;
import com.jesusrh.extramod.blocks.RubyRefined;

import com.jesusrh.extramod.blocks.RubyRefinedSlab;
import com.jesusrh.extramod.blocks.RubyRefinedStairs;
import com.jesusrh.extramod.blocks.ZafiroBlock;
import com.jesusrh.extramod.blocks.ZafiroOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class ModBlocks 
{
	public static final List<Block> Blocks = new ArrayList<Block>();
	
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block RUBY_REFINED = new RubyRefined("ruby_refined", Material.IRON);
	
	public static final Block OBSIDIAN_REFINED = new ObsidianRefined("obsidian_refined", Material.IRON);
	
	public static final Block EMERALD_REFINED = new EmeraldRefined("emerald_refined", Material.IRON);
	
	public static final Block ZAFIRO_ORE = new ZafiroOre("zafiro_ore", Material.ROCK);
	public static final Block ZAFIRO_BLOCK = new ZafiroBlock("zafiro_block", Material.IRON);
	public static final Block ZAFIRO_REFINED = new ZafiroBlock("zafiro_refined", Material.IRON);
	
	public static final Block ONYX_ORE = new OnyxOre("onyx_ore", Material.ROCK);
	public static final Block ONYX_BLOCK = new OnyxBlock("onyx_block", Material.IRON);
	public static final Block ONYX_REFINED = new OnyxBlock("onyx_refined", Material.IRON);
	
	public static final Block PERLA_ORE = new PerlaOre("perla_ore", Material.ROCK);
	public static final Block PERLA_BLOCK = new PerlaBlock("perla_block", Material.IRON);
	
	//Slab
	public static final Block RUBY_REFINED_SLAB = new RubyRefinedSlab.Half("ruby_refined_slab", Material.IRON);
	public static final Block RUBY_REFINED_SLAB_DOUBLE = new RubyRefinedSlab.Double("ruby_refined_slab_double", Material.IRON);
	
	//Stairs
	public static final Block RUBY_REFINED_STAIRS = new RubyRefinedStairs("ruby_refined_stairs", ModBlocks.RUBY_REFINED.getDefaultState());

}
