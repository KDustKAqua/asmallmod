package com.nmmoc7.asmallmod.auto;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class AutoTextures {
    String sourceDir = "../src/main/java/com/nmmoc7/asmallmod/auto/types/";
    String destDir;
    File typesPath;

    public AutoTextures(String sourceTypes, String destTypes, String name){
        typesPath = new File(sourceDir + sourceTypes + ".png");
        destDir = "../src/main/resources/assets/" + MOD_ID + "/textures/" + destTypes + "/" + name + ".png";
        try {
            copyTextures(typesPath, new File(destDir));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyTextures(File source, File dest) throws IOException {
        FileUtils.copyFile(source, dest);
    }
}
