package com.nmmoc7.asmallmod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class ModTabs {
    public static final CreativeTabs ITEMS_TAB = new CreativeTabs(MOD_ID + "." + "items_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.IRON_INGOT_ONE);
        }

        @Override
        public boolean hasSearchBar(){
            return true;
        }
    }.setBackgroundImageName("item_search.png");

    public static final CreativeTabs FOOD_TAB = new CreativeTabs(MOD_ID + "." + "food_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.IRON_APPLE_ONE);
        }
    };

    public static final CreativeTabs BLOCKS_TAB = new CreativeTabs(MOD_ID + "." + "blocks_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.IRON_BLOCK_ONE);
        }
    };

    public static final CreativeTabs TOOLS_TAB = new CreativeTabs(MOD_ID + "." + "tools_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.INFINITE_RAINBOW_PICKAXE);
        }
    };

    public static final CreativeTabs SWORD_TAB = new CreativeTabs(MOD_ID + "." + "sword_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.INFINITE_RAINBOW_SWORD);
        }
    };

    public static final CreativeTabs ARMOR_TAB = new CreativeTabs(MOD_ID + "." + "armor_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.INFINITE_RAINBOW_CHEST);
        }
    };

    public static final CreativeTabs FLUID_BUCKET_TAB = new CreativeTabs(MOD_ID + "." + "fluid_bucket_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModFluid.RAINBOW_FLUID_BUCKET);
        }
    };
}
