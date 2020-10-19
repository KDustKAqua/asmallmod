package com.nmmoc7.asmallmod.init;

import com.nmmoc7.asmallmod.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block IRON_BLOCK_ONE = new BlockBase("iron_block_one", Material.IRON, 0x535340);
    public static final Block IRON_BLOCK_ONE_1 = new BlockBase("iron_block_one_1",Material.IRON, 0x535340);
}
