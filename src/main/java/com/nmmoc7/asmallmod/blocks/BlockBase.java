package com.nmmoc7.asmallmod.blocks;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.autojson.AutoJson;
import com.nmmoc7.asmallmod.init.ModBlocks;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.items.interfaces.IHasJson;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;
import static com.nmmoc7.asmallmod.init.ModTabs.BLOCKS_TAB;


public class BlockBase extends Block implements IHasModel, IHasJson {

    public BlockBase(String name, Material material) {
        super(material);

        setTranslationKey(MOD_ID + "." + name);
        setRegistryName(name);
        setCreativeTab(BLOCKS_TAB);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        createJson(name, "block", "cube_all");
    }

    @Override
    public void registerModels(){
        AsmallMod.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
    }

    /**
     * default : new AutoJson(name, itemOrBlock, types);
     * 普通物品,盔甲 "generated"
     * 工具 "handheld"
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
