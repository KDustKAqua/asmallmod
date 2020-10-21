package com.nmmoc7.asmallmod.items.tools;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.auto.AutoJson;
import com.nmmoc7.asmallmod.auto.AutoTextures;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.util.IAmItem;
import net.minecraft.item.ItemAxe;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;
import static com.nmmoc7.asmallmod.init.ModTabs.TOOLS_TAB;

public class AxeBase extends ItemAxe implements IAmItem {
    public AxeBase(ToolMaterial material, String name, int color) {
        super(material, material.getAttackDamage() + 4.0F, 0.9f);
        this.setTranslationKey(MOD_ID + "." + name);
        setRegistryName(name);
        setCreativeTab(TOOLS_TAB);

        createJson(name, "item", "handheld");
        createTextures("axe", "items", name);

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
