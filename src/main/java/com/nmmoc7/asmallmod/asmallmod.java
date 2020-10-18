package com.nmmoc7.asmallmod;

import com.nmmoc7.asmallmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@SuppressWarnings("ALL")
@Mod(
        modid = AsmallMod.MOD_ID,
        name = AsmallMod.MOD_NAME,
        version = AsmallMod.VERSION
)
public class AsmallMod {

    public static final String MOD_ID = "asmallmod";
    public static final String MOD_NAME = "A Small Mod";
    public static final String VERSION = "1.0-SNAPSHOT";
    public static final String ACCEPTED_VERSION = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASS = "com.nmmoc7.asmallmod.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.nmmoc7.asmallmod.proxy.CommonProxy";

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static AsmallMod INSTANCE;

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) { proxy.preInit(event); }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) { proxy.init(event); }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) { proxy.postInit(event); }
}
