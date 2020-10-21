package com.nmmoc7.asmallmod.auto;

import java.util.Random;

public class RandomTextures {
    static Random randomTypes = new Random();

    static String getRandomTextures(String types) {
        int typesPlus = randomTypes.nextInt(8);
        switch (types) {
            case "ingot":
                switch (typesPlus) {
                    case 0:
                        types += "2";
                        break;
                    case 1:
                        types += "3";
                        break;
                    case 2:
                        types += "4";
                        break;
                    case 3:
                        types += "5";
                        break;
                    case 4:
                        types += "6";
                        break;
                    case 5:
                        types += "7";
                        break;
                    case 6:
                        types += "8";
                        break;
                    case 7:
                        types += "9";
                        break;
                    default:
                        types += "1";
                        break;
                    }
            default:
                break;
        }
        return types;
    }
}
