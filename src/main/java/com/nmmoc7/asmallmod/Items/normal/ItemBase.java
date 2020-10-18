package com.nmmoc7.asmallmod.items.normal;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.autojson.AutoJson;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.items.interfaces.IHasJson;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.item.Item;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;
import static com.nmmoc7.asmallmod.init.ModTabs.ITEMS_TAB;


public class ItemBase extends Item implements IHasModel, IHasJson {
    public ItemBase(String name){
        setTranslationKey( MOD_ID + "." + name);
        setRegistryName(name);
        setCreativeTab(ITEMS_TAB);

        ModItems.ITEMS.add(this);
        createJson(name, "item", "generated");
    }

    @Override
    public void registerModels(){
        AsmallMod.proxy.registerItemRender(this, 0, "inventory");
    }

    @Override
    public void createJson(String name, String itemOrBlock, String types) {
        new AutoJson(name, itemOrBlock, types);
    }
}
