package com.nmmoc7.asmallmod.tabs;

import com.nmmoc7.asmallmod.init.ModBlocks;
import com.nmmoc7.asmallmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTabs {
    public static final CreativeTabs FOOD_TAB = new CreativeTabs("food_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.IRON_APPLE_ONE);
        }

        @Override
        public boolean hasSearchBar(){
            return true;
        }
    }.setBackgroundImageName("item_search.png");

    public static final CreativeTabs ITEMS_TAB = new CreativeTabs("items_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.IRON_INGOT_ONE);
        }
    };

    public static final CreativeTabs BLOCKS_TAB = new CreativeTabs("blocks_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.IRON_BLOCK_ONE);
        }
    };

    public static final CreativeTabs TOOLS_TAB = new CreativeTabs("tools_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.IRON_INGOT_ONE);
        }
    };

    public static final TabsBase TEST_TAB = new TabsBase("test_tab", new ItemStack(ModItems.IRON_INGOT_ONE));
}
