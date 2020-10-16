package com.nmmoc7.asmallmod.items.normal;

import com.nmmoc7.asmallmod.init.ModItems;
import net.minecraft.item.Item;

import static com.nmmoc7.asmallmod.tabs.ModTabs.TEST_TAB;

public class ItemText extends ItemBase {
    public ItemText(String name){
        super(name);
        setCreativeTab(TEST_TAB.creativeTabs);

        ModItems.ITEMS.add(this);
    }
}
