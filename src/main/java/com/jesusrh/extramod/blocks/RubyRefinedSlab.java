package com.jesusrh.extramod.blocks;

import java.util.Random;

import com.jesusrh.extramod.Main;
import com.jesusrh.extramod.init.ModBlocks;
import com.jesusrh.extramod.util.IHasModel;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class RubyRefinedSlab extends BlockSlab implements IHasModel
{
public static final PropertyEnum<Variant> VARIANT = PropertyEnum.<Variant>create("variant", Variant.class);
	
	public RubyRefinedSlab(String name, Material material) {
		super(material);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setSoundType(SoundType.METAL);
		this.setHardness(5.0F);
		this.setResistance(30.0F);
		this.setHarvestLevel("pickaxe", 2);
		//this.setLihtLevel();
		//this.setLightOpacity();
		//this.setBlockUnbreakable();
		
		ModBlocks.Blocks.add(this);
		
		IBlockState iblockstate = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);
		
		if(!this.isDouble()) {
			iblockstate.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
		}
		
		this.setDefaultState(iblockstate);
		this.useNeighborBrightness = true;
	}

	@Override
	public String getUnlocalizedName(int meta) {
		return super.getUnlocalizedName();
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return VARIANT;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return Variant.DEFAULT;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.RUBY_REFINED_SLAB);
	}
	
	
	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(ModBlocks.RUBY_REFINED_SLAB);
	}
	
	@Override
	public final IBlockState getStateFromMeta(final int meta) {
		IBlockState blockstate = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);
		
		if(!this.isDouble()) {
			blockstate = blockstate.withProperty(HALF, ((meta&8)!=0)?EnumBlockHalf.TOP:EnumBlockHalf.BOTTOM);
		}
		
		return blockstate;
	}
	
	@Override
	public final int getMetaFromState(final IBlockState state) {
		int meta = 0;
		
		if(!this.isDouble()&& state.getValue(HALF)==EnumBlockHalf.TOP) {
			meta |= 8;
		}
		
		return meta;
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		if(!this.isDouble()){
			return new BlockStateContainer(this, new IProperty[] {VARIANT, HALF});
		}
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	
	public static class Double extends RubyRefinedSlab
	{

		public Double(String name, Material material) {
			super(name, material);
		}

		@Override
		public boolean isDouble() {
			return true;
		}

		@Override
		public void registerModels() {
			
			
		}

	}

	public static class Half extends RubyRefinedSlab
	{

		public Half(String name, Material material) {
			super(name, material);
		}

		@Override
		public boolean isDouble() {
			return false;
		}

		@Override
		public void registerModels() 
		{
			Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
			
		}

	}
	
	public static enum Variant implements IStringSerializable
	{
		DEFAULT;

		@Override
		public String getName() {
			return "default";
		}
	
	}
}
