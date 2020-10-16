package com.nmmoc7.asmallmod.init;

import com.nmmoc7.asmallmod.items.food.EffectFoodBase;
import com.nmmoc7.asmallmod.items.material.MaterialToolBase;
import com.nmmoc7.asmallmod.items.normal.ItemBase;
import com.nmmoc7.asmallmod.items.normal.ItemText;
import com.nmmoc7.asmallmod.items.tools.AllToolsBase;
import com.nmmoc7.asmallmod.items.tools.PickaxeBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<>();

    //test

    public static final Item TEST_ITEM = new ItemText("test_item");

    // items

    public static final Item IRON_INGOT_ONE = new ItemBase("iron_ingot_one");
    public static final Item IRON_INGOT_ONE_1 = new ItemBase("iron_ingot_one_1");

    // foods

    public static final ItemFood IRON_APPLE_ONE = new EffectFoodBase("iron_apple_one", 3, 7.0f, false, new PotionEffect(MobEffects.RESISTANCE, 30*20, 2, false, true));

    // tools material

    public static final MaterialToolBase IRON_INGOT_ONE_TOOL = new MaterialToolBase("iron_ingot_one_tool", 3, 1145, 10, 14, 30);

    // tools

    public static final Item IRON_INGOT_ONE_PICKAXE = new PickaxeBase(IRON_INGOT_ONE_TOOL.MATERIAL, "iron_ingot_one_pickaxe");
    // public static final AllToolsBase ALL_TOOLS_IRON_INGOT_ONE_TOOL = new AllToolsBase().init(IRON_INGOT_ONE_TOOL.MATERIAL, "iron_ingot");

}
