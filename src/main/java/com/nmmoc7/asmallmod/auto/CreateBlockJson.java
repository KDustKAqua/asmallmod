package com.nmmoc7.asmallmod.auto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class CreateBlockJson {
    static class BlockJson{
        String parent;
        BlockTextures textures;
        List<Object> elements;

        BlockJson(String types, String name){
            List<Integer> from = new ArrayList<>();
            List<Integer> to = new ArrayList<>();
            Map<String, Object> ele = new HashMap<String, Object>();
            Faces faces = new Faces();

            from.add(0);
            from.add(0);
            from.add(0);

            to.add(16);
            to.add(16);
            to.add(16);

            parent = "block/" + types;
            ele.put("from", from);
            ele.put("to", to);
            ele.put("faces", faces);

            elements = new ArrayList<>();
            elements.add(ele);

            textures = new BlockTextures(name);
        }
    }

    private static class BlockTextures{
        String all;

        private BlockTextures(String name) {
            all = MOD_ID + ":blocks/" + name;
        }
    }

    private static class Faces {
        Down down;
        Up up;
        North north;
        South south;
        West west;
        East east;

        private Faces() {
            down = new Down();
            up = new Up();
            north = new North();
            south = new South();
            west = new West();
            east = new East();
        }
    }

    private static class Down { String texture; int tintindex; String cullface;
        public Down() { texture = "#down"; tintindex = 0; cullface = "down"; }
    }

    private static class Up { String texture; int tintindex; String cullface;
        public Up() { texture = "#up"; tintindex = 0; cullface = "up"; }
    }

    private static class North { String texture; int tintindex; String cullface;
        public North() { texture = "#north"; tintindex = 0; cullface = "north"; }
    }

    private static class South { String texture; int tintindex; String cullface;
        public South() { texture = "#south"; tintindex = 0; cullface = "south"; }
    }

    private static class West { String texture; int tintindex; String cullface;
        public West() { texture = "#west"; tintindex = 0; cullface = "west"; }
    }

    private static class East { String texture; int tintindex; String cullface;
        public East() { texture = "#east"; tintindex = 0; cullface = "east"; }
    }
}
