package com.nmmoc7.asmallmod.tabs;

import com.nmmoc7.asmallmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTabs {
    public static final CreativeTabs FOOD_TAB = new CreativeTabs("food_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.IRON_APPLE_ONE);
        }
    };

    public static final CreativeTabs ITEMS_TAB = new CreativeTabs("items_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.IRON_APPLE_ONE);
        }
    };

    public static final CreativeTabs BLOCKS_TAB = new CreativeTabs("blocks_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.IRON_APPLE_ONE);
        }
    };
}
