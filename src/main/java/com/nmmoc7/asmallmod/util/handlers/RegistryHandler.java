package com.nmmoc7.asmallmod.util.handlers;

import com.nmmoc7.asmallmod.entity.EntityInit;
import com.nmmoc7.asmallmod.init.ModBlocks;
import com.nmmoc7.asmallmod.init.ModFluid;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

import static com.nmmoc7.asmallmod.init.ModItems.ITEMS_MAP;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        for (Fluid fluid : ModFluid.FLUIDS) {
            FluidRegistry.registerFluid(fluid);
            FluidRegistry.addBucketForFluid(fluid);
        }

        for(Map.Entry<Block, Integer> entry : ModBlocks.BLOCKS.entrySet()){
            event.getRegistry().register(entry.getKey());
        }
    }

    @SubscribeEvent
    public static void regFluidSpirit(TextureStitchEvent.Pre event) {
        TextureMap textureMap = event.getMap();
        for(Fluid fluid : ModFluid.FLUIDS) {
            textureMap.registerSprite(fluid.getFlowing());
            textureMap.registerSprite(fluid.getStill());
        }
    }

    @SubscribeEvent
    public static void blockColors(ColorHandlerEvent.Block event) {
        for(Map.Entry<Block, Integer> entry : ModBlocks.BLOCKS.entrySet()){
            event.getBlockColors().registerBlockColorHandler(new IBlockColor(){
                @Override
                public int colorMultiplier(@NotNull IBlockState state, @Nullable IBlockAccess worldIn, @Nullable BlockPos pos, int tintIndex) {
                    return entry.getValue();
                }
            }, entry.getKey());
        }
    }

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        for(Map.Entry<Item, Integer> entry : ITEMS_MAP.entrySet()) {
            event.getRegistry().register(entry.getKey());
        }
    }

    @SubscribeEvent
    public static void itemColors(ColorHandlerEvent.Item event) {
        for(Map.Entry<Item, Integer> entry : ITEMS_MAP.entrySet()) {
            event.getItemColors().registerItemColorHandler(new IItemColor(){
                @Override
                public int colorMultiplier(@NotNull ItemStack stack, int tintIndex) {
                    return entry.getValue();
                }
            }, entry.getKey());
        }
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for(Map.Entry<Item, Integer> entry : ITEMS_MAP.entrySet()) {
            if(entry.getKey() instanceof IHasModel) {
                ((IHasModel)entry.getKey()).registerModels();
            }
        }

        for(Map.Entry<Block, Integer> entry : ModBlocks.BLOCKS.entrySet()) {
            if(entry.getKey() instanceof IHasModel) {
                ((IHasModel)entry.getKey()).registerModels();
            }
        }

        RenderHandler.registerEntityRenders();
    }

    public static void preInitRegistries(){
        EntityInit.registerEntities();
    }

}
