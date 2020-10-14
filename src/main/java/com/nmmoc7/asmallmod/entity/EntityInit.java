package com.nmmoc7.asmallmod.entity;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.entity.list.EntityIronSlime;
import com.nmmoc7.asmallmod.init.ModEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
    public static void registerEntities(){
        registerEntity("entity_iron_slime", EntityIronSlime.class, ModEntity.ENTITY_IRON_SLIME, 32, 14680058, 0);
    }

    public static void registerEntity(String name, Class<? extends Entity> entity, int id, int rage, int primaryColor, int secpmdaryColor){
        EntityRegistry.registerModEntity(
                new ResourceLocation(AsmallMod.MOD_ID + ":" +name),
                entity,
                name,
                id,
                AsmallMod.INSTANCE,
                rage,
                1,
                true,
                primaryColor,
                secpmdaryColor
        );
    }
}
