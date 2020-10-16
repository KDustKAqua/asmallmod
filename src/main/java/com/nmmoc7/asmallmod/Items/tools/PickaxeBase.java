package com.nmmoc7.asmallmod.items.tools;

import com.nmmoc7.asmallmod.init.ModItems;
import net.minecraft.item.ItemPickaxe;

import static com.nmmoc7.asmallmod.tabs.ModTabs.TOOLS_TAB;

public class PickaxeBase extends ItemPickaxe {
    public PickaxeBase(ToolMaterial material, String name) {
        super(material);
        this.setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(TOOLS_TAB);

        ModItems.ITEMS.add(this);
    }
}
