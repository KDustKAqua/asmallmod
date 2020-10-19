package com.nmmoc7.asmallmod.util;

public interface IHasJson {
    /**
     * default : new AutoJson(name, itemOrBlock, types);
     * types list :
     * 普通物品,盔甲 "generated"
     * 工具 "handheld"
     * 方块 "cube_all“
     * itemOrBlock list :
     * 物品 "item"
     * 方块 "block"
     * 流体方块 "blockFluid"
     * @param name
     * @param itemOrBlock
     * @param types
     */
    void createJson(String name, String itemOrBlock, String types);
}
