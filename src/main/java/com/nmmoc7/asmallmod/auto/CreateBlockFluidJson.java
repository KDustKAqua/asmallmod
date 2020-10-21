package com.nmmoc7.asmallmod.auto;

public class CreateBlockFluidJson {
    static class BlockFluid {
        int forge_marker;
        Variants variants;

        BlockFluid(String name) {
            forge_marker = 1;
            variants = new Variants(name);
        }
    }

    private static class Variants {
        Fluid fluid;

        private Variants(String name) {
            fluid = new Fluid(name);
        }
    }

    private static class Fluid {
        String model;
        Custom custom;

        private Fluid(String name) {
            model = "forge:fluid";
            custom = new Custom(name);
        }
    }

    private static class Custom {
        String fluid;

        private Custom(String name) {
            fluid = name;
        }
    }
}
