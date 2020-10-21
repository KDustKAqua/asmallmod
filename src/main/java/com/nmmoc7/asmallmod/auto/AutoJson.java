package com.nmmoc7.asmallmod.auto;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
                jsonContent = itemJsonCreator.toJson(new CreateBlockJson.BlockJson(types, name));
                jsonPath = new File(dir + name + ".json");

                createJson();

                dir = "../src/main/resources/assets/" + MOD_ID + "/blockstates/";
                jsonContent = itemJsonCreator.toJson(new CreateBlockStatesJson.BlockStates(name));
                jsonPath = new File(dir + name + ".json");

                createJson();
            case "item":
                dir = "../src/main/resources/assets/" + MOD_ID + "/models/item/";
                switch (itemOrBlock){
                    case "item":
                        jsonContent = itemJsonCreator.toJson(new CreateItemJson.ItemJson(types, name));
                        break;
                    case "block":
                        jsonContent = itemJsonCreator.toJson(new CreateItemJson.BlockItemJson(name));
                        break;
                    default:
                        break;
                }
                jsonPath = new File(dir + name + ".json");

                createJson();
                break;
            case "blockFluid":
                dir = "../src/main/resources/assets/" + MOD_ID + "/blockstates/";
                jsonContent = itemJsonCreator.toJson(new CreateBlockFluidJson.BlockFluid(name));
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
                e.printStackTrace();
            }
        }

        return this;
    }
}