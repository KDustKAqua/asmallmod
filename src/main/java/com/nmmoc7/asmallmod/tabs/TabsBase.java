package com.nmmoc7.asmallmod.tabs;

import com.nmmoc7.asmallmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabsBase {
    private String label;
    private ItemStack icon;
    public CreativeTabs creativeTabs;
    public TabsBase(String label, ItemStack icon){
        this.label = label;
        this.icon = icon;
        creativeTabs = new TabsInit();
    }
    public class TabsInit extends CreativeTabs{
        public TabsInit() {
            super(TabsBase.this.label);
        }

        @Override
        public ItemStack createIcon() {
            return TabsBase.this.icon;
        }
    }
}
