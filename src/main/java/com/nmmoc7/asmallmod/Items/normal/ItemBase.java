package com.nmmoc7.asmallmod.items.normal;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.autojson.AutoJson;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.item.Item;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;
import static com.nmmoc7.asmallmod.init.ModTabs.ITEMS_TAB;


public class ItemBase extends Item implements IHasModel {
    String name;
    public ItemBase(String name){
        this.name = name;
        setTranslationKey( MOD_ID + "." + name);
        setRegistryName(name);
        setCreativeTab(ITEMS_TAB);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        AsmallMod.proxy.registerItemRender(this, 0, "inventory");
    }

    public ItemBase json(){
        new AutoJson(name, "item", "generated");
        return this;
    }
}
