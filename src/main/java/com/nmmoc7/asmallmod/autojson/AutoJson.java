package com.nmmoc7.asmallmod.autojson;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class AutoJson {
    Gson itemJsonCreator = new Gson();
    String dir;
    String jsonContent;
    File jsonPath;

    public AutoJson(String name, String itemOrBlock, String types){
        switch (itemOrBlock){
            case "block":
                dir = "../src/main/resources/assets/" + MOD_ID + "/models/block/";
                jsonContent = itemJsonCreator.toJson(new BlockJson(types, name));
                jsonPath = new File(dir + name + ".json");

                createJson();
            case "item":
                dir = "../src/main/resources/assets/" + MOD_ID + "/models/item/";
                switch (itemOrBlock){
                    case "item":
                        jsonContent = itemJsonCreator.toJson(new ItemJson(types, name));
                        break;
                    case "block":
                        jsonContent = itemJsonCreator.toJson(new BlockItemJson(name));
                        break;
                    default:
                        break;
                }
                jsonPath = new File(dir + name + ".json");

                createJson();
                break;
            default:
                break;
        }
    }

    public AutoJson createJson() {
        if (!jsonPath.exists()) {
            try {
                jsonPath.createNewFile();
                FileWriter resultFile = new FileWriter(jsonPath);
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
        ItemTextures textures;

        private ItemJson(String types, String name){
            parent = "item/" + types;
            textures = new ItemTextures(name);
        }
    }

    private class ItemTextures {
        String layer0;

        private ItemTextures(String name) {
            layer0 = MOD_ID + ":items/" + name;
        }
    }

    private class BlockJson{
        String parent;
        BlockTextures textures;

        private BlockJson(String types, String name){
            parent = "block/" + types;
            textures = new BlockTextures(name);
        }
    }

    private class BlockTextures{
        String all;

        private BlockTextures(String name) {
            all = MOD_ID + ":blocks/" + name;
        }
    }

    private class BlockItemJson {
        String parent;

        private BlockItemJson(String name){
            parent = MOD_ID + ":block/" + name;
        }
    }
}