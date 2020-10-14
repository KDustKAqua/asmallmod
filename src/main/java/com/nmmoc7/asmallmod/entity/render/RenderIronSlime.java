package com.nmmoc7.asmallmod.entity.render;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.entity.list.EntityIronSlime;
import com.nmmoc7.asmallmod.entity.model.ModelIronSlime;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIronSlime extends RenderLiving<EntityIronSlime> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(AsmallMod.MOD_ID + ":textures/entity/entity_iron_slime.png");

    public RenderIronSlime(RenderManager renderManagerIn){
        super(renderManagerIn, new ModelIronSlime(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityIronSlime entity){
        return TEXTURE;
    }
}
