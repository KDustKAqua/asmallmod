package com.nmmoc7.asmallmod.auto;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class CreateItemJson {
    static class ItemJson{
        String parent;
        ItemTextures textures;

        ItemJson(String types, String name){
            parent = "item/" + types;
            textures = new ItemTextures(name);
        }
    }

    static class BlockItemJson {
        String parent;

        BlockItemJson(String name){
            parent = MOD_ID + ":block/" + name;
        }
    }

    private static class ItemTextures {
        String layer0;

        private ItemTextures(String name) {
            layer0 = MOD_ID + ":items/" + name;
        }
    }
}
