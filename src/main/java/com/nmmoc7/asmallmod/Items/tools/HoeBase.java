package com.nmmoc7.asmallmod.items.tools;

import com.nmmoc7.asmallmod.init.ModItems;
import net.minecraft.item.ItemHoe;

import static com.nmmoc7.asmallmod.tabs.ModTabs.TOOLS_TAB;

public class HoeBase extends ItemHoe {
    public HoeBase(ToolMaterial material, String name) {
        super(material);
        this.setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(TOOLS_TAB);

        ModItems.ITEMS.add(this);
    }
}
