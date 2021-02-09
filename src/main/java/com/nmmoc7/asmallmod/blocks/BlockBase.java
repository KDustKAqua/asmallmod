package com.nmmoc7.asmallmod.blocks;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.auto.AutoJson;
import com.nmmoc7.asmallmod.init.ModBlocks;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.util.IHasJson;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Objects;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;
import static com.nmmoc7.asmallmod.init.ModTabs.BLOCKS_TAB;


public class BlockBase extends Block implements IHasModel, IHasJson {

    public BlockBase(String name, Material material, int color) {
        super(material);
        this.setTranslationKey(MOD_ID + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(BLOCKS_TAB);
        this.setHardness(100);
        this.setHarvestLevel("pickaxe", 2);

        createJson(name, "block", "cube_all");

        ModBlocks.BLOCKS.put(this, color);
        ModItems.ITEMS_MAP.put(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())), color);
    }

    @Override
    public void registerModels(){
        AsmallMod.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
    }

    @Override
    public void createJson(String name, String itemOrBlock, String types) {
        new AutoJson(name, itemOrBlock, types);
    }
}
