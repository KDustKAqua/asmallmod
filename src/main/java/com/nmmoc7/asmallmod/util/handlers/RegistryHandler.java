package com.nmmoc7.asmallmod.util.handlers;

import com.nmmoc7.asmallmod.entity.EntityInit;
import com.nmmoc7.asmallmod.init.ModBlocks;
import com.nmmoc7.asmallmod.init.ModFluid;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Map;

import static com.nmmoc7.asmallmod.init.ModItems.ITEMS_MAP;

@Mod.EventBusSubscriber
public class RegistryHandler {
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
                public int colorMultiplier(ItemStack stack, int tintIndex) {
                    return entry.getValue();
                }
            }, entry.getKey());
        }
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for(Map.Entry<Item, Integer> entry : ITEMS_MAP.entrySet()) {
            if(entry.getKey() instanceof IHasModel) {
                ((IHasModel)entry.getKey()).registerModels();
            }
        }

        for(Block block : ModBlocks.BLOCKS) {
            if(block instanceof IHasModel) {
                ((IHasModel)block).registerModels();
            }
        }

        RenderHandler.registerEntityRenders();
    }

    public static void preInitRegistries(){
        EntityInit.registerEntities();
    }

}
