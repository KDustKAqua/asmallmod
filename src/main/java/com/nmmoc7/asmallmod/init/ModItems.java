package com.nmmoc7.asmallmod.init;

import com.nmmoc7.asmallmod.items.armors.AllArmorBase;
import com.nmmoc7.asmallmod.items.armors.ArmorBase;
import com.nmmoc7.asmallmod.items.food.EffectFoodBase;
import com.nmmoc7.asmallmod.items.material.MaterialArmorBase;
import com.nmmoc7.asmallmod.items.material.MaterialToolBase;
import com.nmmoc7.asmallmod.items.normal.ItemBase;
import com.nmmoc7.asmallmod.items.normal.PartsBase;
import com.nmmoc7.asmallmod.items.normal.ToolsAndArmorsBase;
import com.nmmoc7.asmallmod.items.tools.AllToolsBase;
import com.nmmoc7.asmallmod.items.tools.PickaxeBase;
import com.nmmoc7.asmallmod.items.tools.SwordBase;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<>();
    //creative tab icons

    public static final MaterialToolBase INFINITE_RAINBOW_TOOL = new MaterialToolBase("infinite_rainbow_tool", 114514, 1919810, 20F, 1746129371, 30);
    public static final PickaxeBase INFINITE_RAINBOW_PICKAXE = new PickaxeBase(INFINITE_RAINBOW_TOOL.TOOL_MATERIAL, "infinite_rainbow_pickaxe");
    public static final SwordBase INFINITE_RAINBOW_SWORD = new SwordBase(INFINITE_RAINBOW_TOOL.TOOL_MATERIAL, "infinite_rainbow_sword");
    public static final MaterialArmorBase INFINITE_RAINBOW_ARMOR = new MaterialArmorBase("infinite_rainbow_armor", 1919810, new int[]{4, 9, 7, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5674745);
    public static final Item INFINITE_RAINBOW_CHEST = new ArmorBase("infinite_rainbow_chest", INFINITE_RAINBOW_ARMOR.ARMOR_MATERIAL, EntityEquipmentSlot.CHEST);
    // items

    public static final Item IRON_INGOT_ONE = new ItemBase("iron_ingot_one");
    public static final Item IRON_INGOT_ONE_1 = new ItemBase("iron_ingot_one_1");

    // foods

    public static final ItemFood IRON_APPLE_ONE = new EffectFoodBase("iron_apple_one", 3, 7.0f, false, new PotionEffect(MobEffects.RESISTANCE, 30*20, 0, false, true));

    // tools material

    // tools

    public static final AllToolsBase IRON_PLUS = new AllToolsBase("iron_plus", 3, 345, 7.0F, 3.0F, 15).init();
    // armors material

    // armor

    public static final AllArmorBase IRON_PLUS_PLUS = new AllArmorBase("iron_plus_plus", 114514, new int[]{1, 2, 2, 1}, 15, 0).init();
    // all

    public static final ToolsAndArmorsBase IRON_ALL_PLAN = new ToolsAndArmorsBase("iron_all_plan", 512, new int[]{1, 2, 2, 1}, 15, 0, 3, 7, 6);
    // parts

    public static final PartsBase IRON_PARTS = new PartsBase(123, "iron_parts");
}
