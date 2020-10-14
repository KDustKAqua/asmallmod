package com.nmmoc7.asmallmod.init;

import com.nmmoc7.asmallmod.food.EffectFoodBase;
import com.nmmoc7.asmallmod.items.ItemBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();

    //items

    public static final Item IRON_INGOT_ONE = new ItemBase("iron_ingot_one");
    public static final Item IRON_INGOT_ONE_1 = new ItemBase("iron_ingot_one_1");

    //foods

    public static final ItemFood IRON_APPLE_ONE = new EffectFoodBase("iron_apple_one", 3, 7.0f, false, new PotionEffect(MobEffects.RESISTANCE, 30*20, 2, false, true));
}
