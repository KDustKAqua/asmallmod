package com.nmmoc7.asmallmod.auto;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class AutoTextures {
    String sourceDir = "../src/main/java/com/nmmoc7/asmallmod/auto/types/";
    String destDir;
    File typesPath;
    File destPath;
    Random randomTypes = new Random(114514);

    public AutoTextures(String sourceTypes, String destTypes, String name){
        int typesPlus = randomTypes.nextInt(3);
        if("item".equals(sourceTypes)) {
            switch (typesPlus) {
                case 2:
                    sourceTypes += "2";
                    break;
                default:
                    sourceTypes += "1";
            }
        }

        typesPath = new File(sourceDir + sourceTypes + ".png");
        destDir = "../src/main/resources/assets/" + MOD_ID + "/textures/" + destTypes;
        destPath = new File(destDir + "/" + name + ".png");
        if(!destPath.exists() && (new File(destDir)).exists()) {
            try {
                copyTextures(typesPath, destPath, destDir, sourceTypes, name);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void copyTextures(File source, File destFile, String dest, String types, String name) throws IOException {
        switch (types){
            case "fluid":
                FileUtils.copyFile(new File(sourceDir + "fluid_flow.png"),
                        new File(dest + "/" + name + "_flow.png"));
                FileUtils.copyFile(new File(sourceDir + "fluid_flow.png.mcmeta"),
                        new File(dest + "/" + name + "_flow.png.mcmeta"));
                FileUtils.copyFile(new File(sourceDir + "fluid_still.png"),
                        new File(dest + "/" + name + "_still.png"));
                FileUtils.copyFile(new File(sourceDir + "fluid_still.png.mcmeta"),
                        new File(dest + "/" + name + "_still.png.mcmeta"));
                break;
            default:
                FileUtils.copyFile(source, destFile);
        }
    }
}
