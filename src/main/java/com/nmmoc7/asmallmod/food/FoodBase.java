package com.nmmoc7.asmallmod.food;

import com.nmmoc7.asmallmod.asmallmod;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class FoodBase extends ItemFood implements IHasModel {
    public static final CreativeTabs FOOD_TAB = new CreativeTabs("food_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.IRON_APPLE_ONE);
        }
    };

    public FoodBase(String name, int amount, float saturation, boolean isWolfFood){
        super(amount, saturation, isWolfFood);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(FOOD_TAB);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        asmallmod.proxy.registerItemRender(this, 0, "inventory");
    }
}
