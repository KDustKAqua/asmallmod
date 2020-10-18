package com.nmmoc7.asmallmod.items.tools;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class AllToolsBase {
    private String name;
    private Item.ToolMaterial material;

    public AllToolsBase(String name, int level, int maxUses, float efficiency, float damage, int enchantAbility) {
        this.name = name;
        material = EnumHelper.addToolMaterial(name.toUpperCase(), level, maxUses, efficiency, damage, enchantAbility);
    }

    public AllToolsBase init(){

        new SwordBase(material, name + "_sword");
        new PickaxeBase(material, name + "_pickaxe");
        new SpadeBase(material, name + "_spade");
        new AxeBase(material, name + "_axe", material.getAttackDamage() + 4.0F, 0.9F);
        new HoeBase(material, name + "_hoe");

        return this;
    }
}
