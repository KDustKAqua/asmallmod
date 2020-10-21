package com.nmmoc7.asmallmod.proxy;

import com.nmmoc7.asmallmod.fluid.BlockFluidModBase;
import com.nmmoc7.asmallmod.init.ModRecipes;
import com.nmmoc7.asmallmod.util.handlers.RegistryHandler;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
    }

    public void preInit(FMLPreInitializationEvent event) {
        RegistryHandler.preInitRegistries();
    }

    public void postInit(FMLPostInitializationEvent event) {}

    public void registerItemRender(Item item, int meta, String id){}

    public void registerFluidRender(BlockFluidModBase block, String blockStateName) {}
}
