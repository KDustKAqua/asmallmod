package com.nmmoc7.asmallmod.init;

import com.nmmoc7.asmallmod.fluid.BlockFluidModBase;
import com.nmmoc7.asmallmod.fluid.FluidBase;
import com.nmmoc7.asmallmod.items.fluid.ItemBucketBase;

import java.util.ArrayList;
import java.util.List;

public class ModFluid {
    public static final List<FluidBase> FLUIDS = new ArrayList<>();

    // fluid

    public static final FluidBase RAINBOW_FLUID = new FluidBase("rainbow_fluid");

    public static final BlockFluidModBase RAINBOW_FLUID_BLOCK = new BlockFluidModBase("rainbow_fluid_block", RAINBOW_FLUID);
    // bucket

    public static final ItemBucketBase RAINBOW_FLUID_BUCKET = new ItemBucketBase("rainbow_fluid_bucket", RAINBOW_FLUID_BLOCK, 0x114514);
}
