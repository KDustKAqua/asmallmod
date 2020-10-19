package com.nmmoc7.asmallmod.fluid;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.auto.AutoJson;
import com.nmmoc7.asmallmod.init.ModBlocks;
import com.nmmoc7.asmallmod.init.ModTabs;
import com.nmmoc7.asmallmod.util.IHasJson;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class BlockFluidModBase extends BlockFluidClassic implements IHasModel, IHasJson {
    String name;

    public BlockFluidModBase(String name, Fluid fluid) {
        super(fluid, Material.WATER);
        this.setTranslationKey(MOD_ID + "." + name);
        this.setCreativeTab(ModTabs.BLOCKS_TAB);

        ModBlocks.BLOCKS.add(this);

        createJson(name, "blockFluid", "?");
    }

    /**
     * default : AsmallMod.proxy.registerItemRender(this, 0, "inventory");
     * 注册模型
     */
    @Override
    public void registerModels() {
        AsmallMod.proxy.registerFluidRender(this, name);
    }

    /**
     * default : new AutoJson(name, itemOrBlock, types);
     * types list :
     * 普通物品,盔甲 "generated"
     * 工具 "handheld"
     * 方块 "cube_all“
     * itemOrBlock list :
     * 物品 "item"
     * 方块 "block"
     * 流体方块 "fluidBlock"
     *
     * @param name
     * @param itemOrBlock
     * @param types
     */
    @Override
    public void createJson(String name, String itemOrBlock, String types) {
        new AutoJson(name, itemOrBlock, types);
    }
}
