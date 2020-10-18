package com.nmmoc7.asmallmod.items.tools;

import com.nmmoc7.asmallmod.init.ModItems;
import net.minecraft.item.ItemSword;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;
import static com.nmmoc7.asmallmod.init.ModTabs.SWORD_TAB;


public class SwordBase extends ItemSword {
    public SwordBase(ToolMaterial material, String name) {
        super(material);
        this.setTranslationKey(MOD_ID + "." + name);
        setRegistryName(name);
        setCreativeTab(SWORD_TAB);

        ModItems.ITEMS.add(this);
    }
}
