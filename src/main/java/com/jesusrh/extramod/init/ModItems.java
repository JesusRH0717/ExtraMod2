package com.jesusrh.extramod.init;

import java.util.ArrayList;
import java.util.List;

import com.jesusrh.extramod.items.ItemBase;
import com.jesusrh.extramod.items.armor.ArmorBase;
import com.jesusrh.extramod.items.tools.ToolAxeEmerald;
import com.jesusrh.extramod.items.tools.ToolAxeDiamond;
import com.jesusrh.extramod.items.tools.ToolAxeObsidian;
import com.jesusrh.extramod.items.tools.ToolHoe;
import com.jesusrh.extramod.items.tools.ToolPickaxe;
import com.jesusrh.extramod.items.tools.ToolSpade;
import com.jesusrh.extramod.items.tools.ToolSword;
import com.jesusrh.extramod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 4, 2500, 10.0F, 4.0F, 10);
	public static final ToolMaterial MATERIAL_ZAFIRO = EnumHelper.addToolMaterial("material_zafiro", 4, 2500, 10.0F, 4.0F, 10);
	public static final ToolMaterial MATERIAL_EMERALD = EnumHelper.addToolMaterial("material_emerald", 4, 2500, 10.0F, 4.0F, 10);
	public static final ToolMaterial MATERIAL_PERLA = EnumHelper.addToolMaterial("material_perla", 3, 1561, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_ONYX = EnumHelper.addToolMaterial("material_onyx", 3, 1000, 7.0F, 2.5F, 10);
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("material_obsidian", 5, 10000, 20.0F, 10.0F, 30);
	
	//ArmorMaterial
	public static final ArmorMaterial ARMOR_MATERIAL_OBSIDIAN = EnumHelper.addArmorMaterial("armor_material_obsidian", Reference.MOD_ID + ":obsidian", 66, 
			new int[] {6, 12, 16, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 40, 
			new int[] {4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_EMERALD = EnumHelper.addArmorMaterial("armor_material_emerald", Reference.MOD_ID + ":emerald", 40, 
			new int[] {4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ZAFIRO = EnumHelper.addArmorMaterial("armor_material_zafiro", Reference.MOD_ID + ":zafiro", 40, 
			new int[] {4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_PERLA = EnumHelper.addArmorMaterial("armor_material_perla", Reference.MOD_ID + ":perla", 33, 
			new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_ONYX = EnumHelper.addArmorMaterial("armor_material_onyx", Reference.MOD_ID + ":onyx", 25, 
			new int[] {3, 6, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

	
	//Items
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	public static final Item OBSIDIAN_NUGGET = new ItemBase("obsidian_nugget");
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item ZAFIRO = new ItemBase("zafiro");
	public static final Item ONYX = new ItemBase("onyx");
	public static final Item PERLA = new ItemBase("perla");
	
	//Tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxeEmerald("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	public static final ItemSword ZAFIRO_SWORD = new ToolSword("zafiro_sword", MATERIAL_ZAFIRO);
	public static final ItemSpade ZAFIRO_SHOVEL = new ToolSpade("zafiro_shovel", MATERIAL_ZAFIRO);
	public static final ItemPickaxe ZAFIRO_PICKAXE = new ToolPickaxe("zafiro_pickaxe", MATERIAL_ZAFIRO);
	public static final ItemAxe ZAFIRO_AXE = new ToolAxeEmerald("zafiro_axe", MATERIAL_ZAFIRO);
	public static final ItemHoe ZAFIRO_HOE = new ToolHoe("zafiro_hoe", MATERIAL_ZAFIRO);
	
	public static final ItemSword EMERALD_SWORD = new ToolSword("emerald_sword", MATERIAL_EMERALD);
	public static final ItemSpade EMERALD_SHOVEL = new ToolSpade("emerald_shovel", MATERIAL_EMERALD);
	public static final ItemPickaxe EMERALD_PICKAXE = new ToolPickaxe("emerald_pickaxe", MATERIAL_EMERALD);
	public static final ItemAxe EMERALD_AXE = new ToolAxeEmerald("emerald_axe", MATERIAL_EMERALD);
	public static final ItemHoe EMERALD_HOE = new ToolHoe("emerald_hoe", MATERIAL_EMERALD);
	
	public static final ItemSword PERLA_SWORD = new ToolSword("perla_sword", MATERIAL_PERLA);
	public static final ItemSpade PERLA_SHOVEL = new ToolSpade("perla_shovel", MATERIAL_PERLA);
	public static final ItemPickaxe PERLA_PICKAXE = new ToolPickaxe("perla_pickaxe", MATERIAL_PERLA);
	public static final ItemAxe PERLA_AXE = new ToolAxeDiamond("perla_axe", MATERIAL_PERLA);
	public static final ItemHoe PERLA_HOE = new ToolHoe("perla_hoe", MATERIAL_PERLA);
	
	public static final ItemSword ONYX_SWORD = new ToolSword("onyx_sword", MATERIAL_ONYX);
	public static final ItemSpade ONYX_SHOVEL = new ToolSpade("onyx_shovel", MATERIAL_ONYX);
	public static final ItemPickaxe ONYX_PICKAXE = new ToolPickaxe("onyx_pickaxe", MATERIAL_ONYX);
	public static final ItemAxe ONYX_AXE = new ToolAxeDiamond("onyx_axe", MATERIAL_ONYX);
	public static final ItemHoe ONYX_HOE = new ToolHoe("onyx_hoe", MATERIAL_ONYX);
	
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN);
	public static final ItemSpade OBSIDIAN_SHOVEL = new ToolSpade("obsidian_shovel", MATERIAL_OBSIDIAN);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxeObsidian("obsidian_axe", MATERIAL_OBSIDIAN);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", MATERIAL_OBSIDIAN);
	
	//ArmorItems
	public static final Item OBSIDIAN_HELMET = new ArmorBase("obsidian_helmet", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
	public static final Item OBSIDIAN_CHESTPLATE = new ArmorBase("obsidian_chestplate", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
	public static final Item OBSIDIAN_LEGGINGS = new ArmorBase("obsidian_leggings", ARMOR_MATERIAL_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
	public static final Item OBSIDIAN_BOOTS = new ArmorBase("obsidian_boots", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.FEET);
	
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	
	public static final Item EMERALD_HELMET = new ArmorBase("emerald_helmet", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE = new ArmorBase("emerald_chestplate", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGS = new ArmorBase("emerald_leggings", ARMOR_MATERIAL_EMERALD, 2, EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS = new ArmorBase("emerald_boots", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ZAFIRO_HELMET = new ArmorBase("zafiro_helmet", ARMOR_MATERIAL_ZAFIRO, 1, EntityEquipmentSlot.HEAD);
	public static final Item ZAFIRO_CHESTPLATE = new ArmorBase("zafiro_chestplate", ARMOR_MATERIAL_ZAFIRO, 1, EntityEquipmentSlot.CHEST);
	public static final Item ZAFIRO_LEGGINGS = new ArmorBase("zafiro_leggings", ARMOR_MATERIAL_ZAFIRO, 2, EntityEquipmentSlot.LEGS);
	public static final Item ZAFIRO_BOOTS = new ArmorBase("zafiro_boots", ARMOR_MATERIAL_ZAFIRO, 1, EntityEquipmentSlot.FEET);
	
	public static final Item PERLA_HELMET = new ArmorBase("perla_helmet", ARMOR_MATERIAL_PERLA, 1, EntityEquipmentSlot.HEAD);
	public static final Item PERLA_CHESTPLATE = new ArmorBase("perla_chestplate", ARMOR_MATERIAL_PERLA, 1, EntityEquipmentSlot.CHEST);
	public static final Item PERLA_LEGGINGS = new ArmorBase("perla_leggings", ARMOR_MATERIAL_PERLA, 2, EntityEquipmentSlot.LEGS);
	public static final Item PERLA_BOOTS = new ArmorBase("perla_boots", ARMOR_MATERIAL_PERLA, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ONYX_HELMET = new ArmorBase("onyx_helmet", ARMOR_MATERIAL_ONYX, 1, EntityEquipmentSlot.HEAD);
	public static final Item ONYX_CHESTPLATE = new ArmorBase("onyx_chestplate", ARMOR_MATERIAL_ONYX, 1, EntityEquipmentSlot.CHEST);
	public static final Item ONYX_LEGGINGS = new ArmorBase("onyx_leggings", ARMOR_MATERIAL_ONYX, 2, EntityEquipmentSlot.LEGS);
	public static final Item ONYX_BOOTS = new ArmorBase("onyx_boots", ARMOR_MATERIAL_ONYX, 1, EntityEquipmentSlot.FEET);

}
