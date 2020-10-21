package com.nmmoc7.asmallmod.proxy;

import com.nmmoc7.asmallmod.fluid.BlockFluidModBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.jetbrains.annotations.NotNull;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class ClientProxy extends CommonProxy{
    @Override
    public void registerItemRender(Item item, int meta, String id){ ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id)); }

    @Override
    public void registerFluidRender(BlockFluidModBase blockFluid, String blockStateName) {
        final String location = MOD_ID + ":" + blockStateName;
        final Item itemFluid = Item.getItemFromBlock(blockFluid);
        ModelLoader.setCustomMeshDefinition(itemFluid, new ItemMeshDefinition()
        {
            @Override
            public @NotNull ModelResourceLocation getModelLocation(@NotNull ItemStack stack)
            {
                return new ModelResourceLocation(location, "fluid");
            }
        });
        ModelLoader.setCustomStateMapper(blockFluid, new StateMapperBase()
        {
            @Override
            protected @NotNull ModelResourceLocation getModelResourceLocation(@NotNull IBlockState state)
            {
                return new ModelResourceLocation(blockStateName, "fluid");
            }
        });
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
