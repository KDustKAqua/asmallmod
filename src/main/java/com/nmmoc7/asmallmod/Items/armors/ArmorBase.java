package com.nmmoc7.asmallmod.items.armors;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.autojson.AutoJson;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.items.interfaces.IHasJson;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;
import static com.nmmoc7.asmallmod.init.ModTabs.ARMOR_TAB;

public class ArmorBase extends ItemArmor implements IHasModel, IHasJson {
    public ArmorBase(String name, ArmorMaterial material,EntityEquipmentSlot slot) {
        super(material, 0, slot);
        this.setTranslationKey(MOD_ID + "." + name);
        this.setRegistryName(name);
        setCreativeTab(ARMOR_TAB);

        ModItems.ITEMS.add(this);
        createJson(name, "item", "generated");
    }


    /**
     * default : new AutoJson(name, itemOrBlock, types);
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
     * default : AsmallMod.proxy.registerItemRender(this, 0, "inventory");
     * 注册模型
     */
    @Override
    public void registerModels() {
        AsmallMod.proxy.registerItemRender(this, 0, "inventory");
    }
}
