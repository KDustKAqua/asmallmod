package com.nmmoc7.asmallmod.items;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.item.Item;

import static com.nmmoc7.asmallmod.tabs.ModTabs.ITEMS_TAB;

public final class ItemBase extends Item implements IHasModel {
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
