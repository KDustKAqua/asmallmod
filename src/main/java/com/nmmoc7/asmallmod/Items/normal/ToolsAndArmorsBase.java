package com.nmmoc7.asmallmod.items.normal;

import com.nmmoc7.asmallmod.items.armors.AllArmorBase;
import com.nmmoc7.asmallmod.items.tools.AllToolsBase;

public class ToolsAndArmorsBase {
    private final String name;

    public ToolsAndArmorsBase(String name, int maxUses, int[] armorNum, int enchantAbility, float toughness, int level, int efficiency, float damage){
        this.name = name;
        (new AllArmorBase(name + "_armor", maxUses / 5, armorNum, enchantAbility, toughness)).init();
        (new AllToolsBase(name + "_tool", level, maxUses, efficiency, damage, enchantAbility)).init();
    }

}
