package com.nmmoc7.asmallmod.items.normal;

import com.nmmoc7.asmallmod.autojson.AutoJson;
import net.minecraft.item.Item;

public class PartsBase {
    public PartsBase(int amount, String name){
        String realName;
        for(int i = 0; i < amount; i++){
            realName = name + "_mk_" + i;
            new ItemBase(realName);
            json(realName);
        }
    }

    public void json(String name){
        AutoJson autoJson = new AutoJson(name, "item", "generated");
        autoJson.createItemJson();
    }
}
