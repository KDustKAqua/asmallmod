package com.nmmoc7.asmallmod.items.armors;

import com.nmmoc7.asmallmod.init.ModItems;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;
import static com.nmmoc7.asmallmod.init.ModTabs.ARMOR_TAB;

public class ArmorBase extends ItemArmor {
    public ArmorBase(String name, ArmorMaterial material,EntityEquipmentSlot slot) {
        super(material, 0, slot);
        this.setTranslationKey(MOD_ID + "." +name);
        this.setRegistryName(name);
        setCreativeTab(ARMOR_TAB);

        ModItems.ITEMS.add(this);
    }
}
