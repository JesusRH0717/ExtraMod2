package com.jesusrh.extramod.blocks;

import java.util.Random;

import com.jesusrh.extramod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ZafiroOre extends BlockBase
{
	public ZafiroOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
		//setLihtLevel();
		//setLightOpacity();
		//setBlockUnbreakable();
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return new ItemStack(ModItems.ZAFIRO).getItem();

	}
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0)
        {
            int j = random.nextInt(fortune + 3) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return quantityDropped(random) * (j + 1);
        }
        else
        {
            return quantityDropped(random);
        }
        
    }
        public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
    		Random rand = world instanceof World ? ((World)world).rand : new Random();
    		return MathHelper.getInt(rand, 2, 5);
    }

}
