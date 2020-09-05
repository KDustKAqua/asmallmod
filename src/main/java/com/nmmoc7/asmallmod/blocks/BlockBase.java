package com.nmmoc7.asmallmod.blocks;

import com.nmmoc7.asmallmod.asmallmod;
import com.nmmoc7.asmallmod.init.ModBlocks;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BlockBase extends Block implements IHasModel {
    public static final CreativeTabs BLOCK_TAB = new CreativeTabs("block_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.IRON_BLOCK_ONE);
        }
    };

    public BlockBase(String name, Material material) {
        super(material);

        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(BLOCK_TAB);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels(){
        asmallmod.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
    }
}
