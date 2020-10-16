package com.nmmoc7.asmallmod.items.food;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.item.ItemFood;

import static com.nmmoc7.asmallmod.tabs.ModTabs.FOOD_TAB;

public class FoodBase extends ItemFood implements IHasModel {
    public FoodBase(String name, int amount, float saturation, boolean isWolfFood){
        super(amount, saturation, isWolfFood);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(FOOD_TAB);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        AsmallMod.proxy.registerItemRender(this, 0, "inventory");
    }
}
