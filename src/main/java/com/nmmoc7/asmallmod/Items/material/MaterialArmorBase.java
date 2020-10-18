package com.nmmoc7.asmallmod.items.material;

import com.nmmoc7.asmallmod.items.normal.ItemBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialArmorBase extends ItemBase {
    public final ItemArmor.ArmorMaterial ARMOR_MATERIAL;

    public MaterialArmorBase(String name, int maxUses, int[] armorNum, int enchantAbility, SoundEvent sound, float toughness){
        super(name);
        ARMOR_MATERIAL = EnumHelper.addArmorMaterial(name, name, maxUses, armorNum, enchantAbility, sound, toughness);
    }
}