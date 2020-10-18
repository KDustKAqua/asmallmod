package com.nmmoc7.asmallmod.blocks;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.init.ModBlocks;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;
import static com.nmmoc7.asmallmod.init.ModTabs.BLOCKS_TAB;


public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material) {
        super(material);

        setTranslationKey(MOD_ID + "." + name);
        setRegistryName(name);
        setCreativeTab(BLOCKS_TAB);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels(){
        AsmallMod.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
    }
}
