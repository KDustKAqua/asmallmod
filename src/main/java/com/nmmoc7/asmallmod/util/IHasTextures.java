package com.nmmoc7.asmallmod.util;

import com.nmmoc7.asmallmod.auto.AutoTextures;

public interface IHasTextures {
    /**
     * default : new AutoTextures(sourceTypes,destTypes,name);
     * types list:
     *      block_iron :    铁块纹理
     *      block_ore  :    铁矿纹理
     *      helmet     :    头盔
     *      chest      :    胸甲
     *      legs       :    腿
     *      boots      :    靴子
     *      sword      :    剑
     *      axe        :    斧子
     *      pickaxe    :    镐子
     *      shovel     :    铲子
     *      hoe        :    锄头
     *      ingot      :    铁锭
     *      nugget     :    铁粒
     *      dust       :    火药
     *
     * types list:
     *      items       物品
     *      blocks      方块
     */
    void createTextures(String sourceTypes, String destTypes, String name);
}
