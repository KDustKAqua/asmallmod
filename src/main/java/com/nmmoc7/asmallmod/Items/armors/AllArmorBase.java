package com.nmmoc7.asmallmod.items.armors;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class AllArmorBase {
    private String name;
    private ItemArmor.ArmorMaterial ARMOR_MATERIAL;
    private int color;

    public AllArmorBase(String name, int maxUses, int[] armorNum, int enchantAbility, float toughness, int color){
        this.name = name;
        this.color = color;
        ARMOR_MATERIAL = EnumHelper.addArmorMaterial(name, name, maxUses, armorNum, enchantAbility, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, toughness);
    }

    public AllArmorBase init(){
        new ArmorBase(name + "_head", ARMOR_MATERIAL, EntityEquipmentSlot.HEAD, color);
        new ArmorBase(name + "_chest", ARMOR_MATERIAL, EntityEquipmentSlot.CHEST, color);
        new ArmorBase(name + "_legs", ARMOR_MATERIAL, EntityEquipmentSlot.LEGS, color);
        new ArmorBase(name + "_feet", ARMOR_MATERIAL, EntityEquipmentSlot.FEET, color);

        return this;
    }
}
