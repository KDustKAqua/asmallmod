package com.nmmoc7.asmallmod.items.tools;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class AllToolsBase {
    private String name;
    private Item.ToolMaterial material;
    private int color;

    public AllToolsBase(String name, int level, int maxUses, float efficiency, float damage, int enchantAbility, int color) {
        this.name = name;
        this.color = color;
        material = EnumHelper.addToolMaterial(name.toUpperCase(), level, maxUses, efficiency, damage, enchantAbility);
    }

    public AllToolsBase init(){

        new SwordBase(material, name + "_sword", color);
        new PickaxeBase(material, name + "_pickaxe", color);
        new SpadeBase(material, name + "_spade", color);
        new AxeBase(material, name + "_axe", color);
        new HoeBase(material, name + "_hoe", color);

        return this;
    }
}
