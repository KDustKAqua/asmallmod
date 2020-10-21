package com.nmmoc7.asmallmod.items.normal;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.auto.AutoJson;
import com.nmmoc7.asmallmod.auto.AutoTextures;
import com.nmmoc7.asmallmod.util.IAmItem;

public class PartsBase implements IAmItem {
    public PartsBase(int amount, String name, int color){
        String realName;
        int modulus;
        for(int i = 0; i < amount; i++){
            realName = name + "_mk_" + i;
            modulus = (678 - i) * (367 - i);
            if (modulus < 0) {
                modulus = -modulus;
            }
            AsmallMod.proxy.registerItemRender(new ItemBase(realName, color + (i * modulus)), 0, "inventory");
            createJson(realName, "item", "generated");
            createTextures("ingot", "items", realName);
        }
    }

    @Override
    public void createJson(String name, String itemOrBlock, String types) {
        new AutoJson(name, itemOrBlock, types);
    }

    @Override
    public void registerModels() {

    }

    @Override
    public void createTextures(String sourceTypes, String destTypes, String name) {
        new AutoTextures(sourceTypes, destTypes, name);
    }
}
