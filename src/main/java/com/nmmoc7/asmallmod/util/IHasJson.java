package com.nmmoc7.asmallmod.util;

public interface IHasJson {
    /**
     * default : new AutoJson(name, itemOrBlock, types);
     * 普通物品,盔甲 "generated"
     * 工具 "handheld"
     *
     * 方块 "cube_all“
     * @param name
     * @param itemOrBlock
     * @param types
     */
    void createJson(String name, String itemOrBlock, String types);
}
