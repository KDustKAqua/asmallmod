package com.nmmoc7.asmallmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void init() {
        GameRegistry.addSmelting(ModItems.IRON_INGOT_ONE, new ItemStack(ModItems.IRON_INGOT_ONE_1, 1), 0.65f);
    }
}
