package com.nmmoc7.asmallmod.configs;

import com.nmmoc7.asmallmod.AsmallMod;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = AsmallMod.MOD_ID)
@Config.LangKey("config.asmallmod.general")
public final class ConfigA {

    public static boolean think = false;

    @Config.Comment("Hey I am foo")
    @Config.LangKey("config.asmallmod.general.foo")
    @Config.RangeInt(min = 1, max = 10000)
    @Config.RequiresWorldRestart
    @Config.RequiresMcRestart
    public static int foo = 0;

    @Config.Comment("Hey I am bar")
    @Config.LangKey("config.asmallmod.general.bar")
    @Config.RangeDouble(min = 1.0, max = 10000.0)
    @Config.RequiresWorldRestart
    @Config.RequiresMcRestart
    public static double bar = 0;

    public static String[] strArr = new String[] { "test" };

    @Mod.EventBusSubscriber(modid = AsmallMod.MOD_ID)
    public static class ConfigSyncHandler {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(AsmallMod.MOD_ID)) {
                ConfigManager.sync(AsmallMod.MOD_ID, Config.Type.INSTANCE);
            }
        }
    }
}