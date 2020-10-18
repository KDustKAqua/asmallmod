package com.nmmoc7.asmallmod.items.normal;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.autojson.AutoJson;
import com.nmmoc7.asmallmod.items.interfaces.IHasJson;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.item.Item;

public class PartsBase implements IHasJson, IHasModel {
    public PartsBase(int amount, String name){
        String realName;
        for(int i = 0; i < amount; i++){
            realName = name + "_mk_" + i;
            AsmallMod.proxy.registerItemRender(new ItemBase(realName), 0, "inventory");
            createJson(realName, "item", "generated");
        }
    }

    @Override
    public void createJson(String name, String itemOrBlock, String types) {
        new AutoJson(name, itemOrBlock, types);
    }

    /**
     * default : AsmallMod.proxy.registerItemRender(this, 0, "inventory");
     * 注册模型
     */
    @Override
    public void registerModels() {

    }
}
