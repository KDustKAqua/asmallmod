package com.nmmoc7.asmallmod.items.food;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.auto.AutoJson;
import com.nmmoc7.asmallmod.auto.AutoTextures;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.util.IAmItem;
import com.nmmoc7.asmallmod.util.IHasJson;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.item.ItemFood;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;
import static com.nmmoc7.asmallmod.init.ModTabs.FOOD_TAB;


public class FoodBase extends ItemFood implements IAmItem {
    public FoodBase(String name, int amount, float saturation, boolean isWolfFood, int color){
        super(amount, saturation, isWolfFood);
        setTranslationKey(MOD_ID + "." + name);
        setRegistryName(name);
        setCreativeTab(FOOD_TAB);

        createJson(name, "item", "generated");
        createTextures("food", "items", name);

        ModItems.ITEMS_MAP.put(this, color);
    }

    @Override
    public void registerModels(){
        AsmallMod.proxy.registerItemRender(this, 0, "inventory");
    }

    /**
     * default : new AutoJson(name, itemOrBlock, types);
     * 普通物品,盔甲 "generated"
     * 工具 "handheld"
     *
     * @param name
     * @param itemOrBlock
     * @param types
     */
    @Override
    public void createJson(String name, String itemOrBlock, String types) {
        new AutoJson(name, itemOrBlock, types);
    }

    /**
     * default : new AutoTextures(sourceTypes,destTypes,name);
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
        new AutoTextures(sourceTypes,destTypes,name);
    }
}
