package com.nmmoc7.asmallmod.fluid;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.auto.AutoJson;
import com.nmmoc7.asmallmod.auto.AutoTextures;
import com.nmmoc7.asmallmod.init.ModBlocks;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.init.ModTabs;
import com.nmmoc7.asmallmod.util.IHasJson;
import com.nmmoc7.asmallmod.util.IHasModel;
import com.nmmoc7.asmallmod.util.IHasTextures;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

import java.util.Objects;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class BlockFluidModBase extends BlockFluidClassic implements IHasModel, IHasJson, IHasTextures {
    String name;

    public BlockFluidModBase(String name, Fluid fluid) {
        super(fluid, Material.WATER);
        this.setTranslationKey(MOD_ID + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(ModTabs.FLUID_BLOCK_TAB);

        createJson(name, "blockFluid", "null");
        createJson(name, "block", "cube_all");
        createTextures("fluid_block", "blocks", name);

        int color = fluid.getColor();

        ModBlocks.BLOCKS.put(this, color);
        ModItems.ITEMS_MAP.put(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())), color);
    }

    @Override
    public void registerModels() {
        AsmallMod.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
        AsmallMod.proxy.registerFluidRender(this, String.valueOf(this.getRegistryName()));
    }

    @Override
    public void createJson(String name, String itemOrBlock, String types) {
        new AutoJson(name, itemOrBlock, types);
    }

    @Override
    public void createTextures(String sourceTypes, String destTypes, String name) {
        new AutoTextures(sourceTypes,destTypes,name);
    }
}
