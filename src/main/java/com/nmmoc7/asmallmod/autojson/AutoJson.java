package com.nmmoc7.asmallmod.autojson;

import com.google.gson.Gson;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class AutoJson {
    Gson itemJsonCreator = new Gson();
    String dir;
    String jsonContent;
    File itemJson;

    public AutoJson(String name, String itemOrBlock, String types){
        dir = "../src/main/resources/assets/" + MOD_ID + "/models/"+ itemOrBlock + "/";
        String wdnmd = System.getProperty("user.dir");
        jsonContent = itemJsonCreator.toJson(new ItemJson(types, name));
        itemJson = new File(dir + name + ".json");
    }

    public AutoJson createItemJson(){
        if(!itemJson.exists()){
            try {
                itemJson.createNewFile();
                FileWriter resultFile = new FileWriter(itemJson);
                resultFile.write(jsonContent);
                resultFile.flush();
                resultFile.close();
            } catch (IOException e) {
                System.out.println("新建文件操作出错");
                e.printStackTrace();
            }
        }

        return this;
    }

    private class ItemJson{
        String parent;
        Textures textures;

        private ItemJson(String types, String name){
            parent = "item/" + types;
            textures = new Textures(name);
        }
    }

    private class Textures{
        String layer0;

        private Textures(String name) {
            layer0 = MOD_ID + ":items/" + name;
        }
    }
}
// {
//     "parent": "item/generated",
//     "textures": {
//     "layer0": "asmallmod:items/iron_ingot_one"
//     }
// }