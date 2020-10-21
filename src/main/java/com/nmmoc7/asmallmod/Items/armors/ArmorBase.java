package com.nmmoc7.asmallmod.items.armors;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.auto.AutoJson;
import com.nmmoc7.asmallmod.auto.AutoTextures;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.util.IAmItem;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;
import static com.nmmoc7.asmallmod.init.ModTabs.ARMOR_TAB;

public class ArmorBase extends ItemArmor implements IAmItem {
    public ArmorBase(String name, ArmorMaterial material,EntityEquipmentSlot slot, int color) {
        super(material, 0, slot);
        this.setTranslationKey(MOD_ID + "." + name);
        this.setRegistryName(name);
        setCreativeTab(ARMOR_TAB);

        createJson(name, "item", "generated");
        createTextures(slot.getName(), "items", name);

        ModItems.ITEMS_MAP.put(this, color);
    }

    @Override
    public void createJson(String name, String itemOrBlock, String types) {
        new AutoJson(name, itemOrBlock, types);
    }

    @Override
    public void registerModels() {
        AsmallMod.proxy.registerItemRender(this, 0, "inventory");
    }

    @Override
    public void createTextures(String sourceTypes, String destTypes, String name) {
        new AutoTextures(sourceTypes,destTypes,name);
    }
}
