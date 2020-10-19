package com.nmmoc7.asmallmod.items.normal;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.auto.AutoJson;
import com.nmmoc7.asmallmod.auto.AutoTextures;
import com.nmmoc7.asmallmod.util.IAmItem;
import com.nmmoc7.asmallmod.util.IHasJson;
import com.nmmoc7.asmallmod.util.IHasModel;
import com.nmmoc7.asmallmod.util.IHasTextures;

public class PartsBase implements IAmItem {
    public PartsBase(int amount, String name, int color){
        String realName;
        int modulus;
        for(int i = 0; i < amount; i++){
            realName = name + "_mk_" + i;
            modulus = (678 - i) * (367 - i);
            if (modulus < 0) {
                modulus = -modulus;
            }
            AsmallMod.proxy.registerItemRender(new ItemBase(realName, color + (i * modulus)), 0, "inventory");
            createJson(realName, "item", "generated");
            createTextures("ingot", "items", realName);
        }
    }

    @Override
    public void createJson(String name, String itemOrBlock, String types) {
        new AutoJson(name, itemOrBlock, types);
    }

    /**
     * default : AsmallMod.proxy.registerItemRender(this, 0, "inventory");
     * 注册模型
     */
    @Override
    public void registerModels() {

    }


    /**
     * default : new AutoTextures(String sourceTypes, String destTypes, String name);
     * types list:
     * block_iron :    铁块纹理
     * block_ore  :    铁矿纹理
     * helmet     :    头盔
     * chest      :    胸甲
     * legs       :    腿
     * boots      :    靴子
     * sword      :    剑
     * axe        :    斧子
     * pickaxe    :    镐子
     * shovel     :    铲子
     * hoe        :    锄头
     * ingot      :    铁锭
     * nugget     :    铁粒
     * dust       :    火药
     * <p>
     * types list:
     * items       物品
     * blocks      方块
     *
     * @param sourceTypes
     * @param destTypes
     * @param name
     */
    @Override
    public void createTextures(String sourceTypes, String destTypes, String name) {
        new AutoTextures(sourceTypes, destTypes, name);
    }
}
