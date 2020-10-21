package com.nmmoc7.asmallmod.auto;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class CreateBlockStatesJson {
    static class BlockStates{
        BlockVariants variants;

        BlockStates(String name){
            variants = new BlockVariants(name);
        }
    }
    private static class BlockVariants{
        Normal normal;

        private BlockVariants(String name){
            normal = new Normal(name);
        }
    }
    private static class Normal{
        String model;

        private Normal(String name){
            model = MOD_ID + ":" + name;
        }
    }
}
