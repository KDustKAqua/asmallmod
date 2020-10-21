package com.nmmoc7.asmallmod.items.food;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.auto.AutoJson;
import com.nmmoc7.asmallmod.auto.AutoTextures;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.util.IAmItem;
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

    @Override
    public void createJson(String name, String itemOrBlock, String types) {
        new AutoJson(name, itemOrBlock, types);
    }

    @Override
    public void createTextures(String sourceTypes, String destTypes, String name) {
        new AutoTextures(sourceTypes,destTypes,name);
    }
}
