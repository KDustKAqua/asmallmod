package com.nmmoc7.asmallmod.items.food;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.autojson.AutoJson;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.items.interfaces.IHasJson;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.item.ItemFood;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;
import static com.nmmoc7.asmallmod.init.ModTabs.FOOD_TAB;


public class FoodBase extends ItemFood implements IHasModel, IHasJson {
    public FoodBase(String name, int amount, float saturation, boolean isWolfFood){
        super(amount, saturation, isWolfFood);
        setTranslationKey(MOD_ID + "." + name);
        setRegistryName(name);
        setCreativeTab(FOOD_TAB);

        ModItems.ITEMS.add(this);
        createJson(name, "item", "generated");
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
}
