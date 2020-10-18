package com.nmmoc7.asmallmod.items.tools;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.auto.AutoJson;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.util.IHasJson;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.item.ItemAxe;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;
import static com.nmmoc7.asmallmod.init.ModTabs.TOOLS_TAB;

public class AxeBase extends ItemAxe implements IHasJson, IHasModel {
    public AxeBase(ToolMaterial material, String name, float axeDamage, float axeSpeed) {
        super(material, axeDamage, axeSpeed);
        this.setTranslationKey(MOD_ID + "." + name);
        setRegistryName(name);
        setCreativeTab(TOOLS_TAB);

        ModItems.ITEMS.add(this);
        createJson(name, "item", "handheld");
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
     * default : AsmallMod.proxy.registerItemRender(this, 0, "inventory");
     * 注册模型
     */
    @Override
    public void registerModels() {
        AsmallMod.proxy.registerItemRender(this, 0, "inventory");
    }
}
