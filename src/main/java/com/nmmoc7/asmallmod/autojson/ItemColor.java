package com.nmmoc7.asmallmod.autojson;

import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.ItemStack;

public class ItemColor implements IItemColor {
    @Override
    public int colorMultiplier(ItemStack stack, int tintIndex) { return 1; }
}
