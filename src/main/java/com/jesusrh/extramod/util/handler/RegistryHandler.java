package com.jesusrh.extramod.util.handler;

import com.jesusrh.extramod.init.ModBlocks;
import com.jesusrh.extramod.init.ModItems;
import com.jesusrh.extramod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
		
		ItemBlock item = new ItemSlab(ModBlocks.RUBY_REFINED_SLAB, (BlockSlab)ModBlocks.RUBY_REFINED_SLAB, (BlockSlab)ModBlocks.RUBY_REFINED_SLAB_DOUBLE);
		item.setRegistryName(ModBlocks.RUBY_REFINED_SLAB.getRegistryName());
		event.getRegistry().register(item);
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.Blocks.toArray(new Block[0]));
		
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.Blocks)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}

	}
}
