package com.nmmoc7.asmallmod.items.tools;

import net.minecraft.item.Item;

public class AllToolsBase {
    public AllToolsBase() { }

    public AllToolsBase init(Item.ToolMaterial material, String name){
        new SwordBase(material, name + "_sword");
        new PickaxeBase(material, name + "_pickaxe");
        new SpadeBase(material, name + "_spade");
        new AxeBase(material, name + "_axe");
        new HoeBase(material, name + "_hoe");

        return this;
    }
}
