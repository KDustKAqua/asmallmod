package com.nmmoc7.asmallmod.util.handlers;

import com.nmmoc7.asmallmod.entity.list.EntityIronSlime;
import com.nmmoc7.asmallmod.entity.render.RenderIronSlime;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
    public static void registerEntityRenders(){
        RenderingRegistry.registerEntityRenderingHandler(EntityIronSlime.class, renderManager -> new RenderIronSlime(renderManager)
        );
    }
}
