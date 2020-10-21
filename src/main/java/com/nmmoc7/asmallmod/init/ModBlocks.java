package com.nmmoc7.asmallmod.init;

import com.nmmoc7.asmallmod.blocks.BlockBase;
import com.nmmoc7.asmallmod.fluid.BlockFluidModBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModBlocks {
    public static final Map<Block, Integer> BLOCKS = new HashMap<Block, Integer>();

    public static final Block IRON_BLOCK_ONE = new BlockBase("iron_block_one", Material.IRON, 0x535340);
    public static final Block IRON_BLOCK_ONE_1 = new BlockBase("iron_block_one_1", Material.IRON, 0x535340);

    public static final BlockFluidModBase RAINBOW_FLUID_BLOCK = new BlockFluidModBase("rainbow_fluid_block", ModFluid.RAINBOW_FLUID);
}
