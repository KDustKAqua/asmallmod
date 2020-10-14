package com.nmmoc7.asmallmod.items;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class ItemBase extends Item implements IHasModel {
    public static final CreativeTabs ITEMS_TAB = new CreativeTabs("items_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.IRON_INGOT_ONE);
        }
    };

    public ItemBase(String name){
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ITEMS_TAB);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        AsmallMod.proxy.registerItemRender(this, 0, "inventory");
    }
}
