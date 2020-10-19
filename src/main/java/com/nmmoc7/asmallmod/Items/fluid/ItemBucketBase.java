package com.nmmoc7.asmallmod.items.fluid;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.auto.AutoJson;
import com.nmmoc7.asmallmod.auto.AutoTextures;
import com.nmmoc7.asmallmod.fluid.BlockFluidModBase;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.init.ModTabs;
import com.nmmoc7.asmallmod.util.IAmItem;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class ItemBucketBase extends ItemBucket implements IAmItem {
    public ItemBucketBase(String name, BlockFluidModBase blockFluid, int color)
    {
        super(blockFluid);
        this.setContainerItem(Items.BUCKET);
        this.setTranslationKey(MOD_ID + "." + name);
        this.setCreativeTab(ModTabs.FLUID_BUCKET_TAB);

        createJson(name, "item", "generated");
        createTextures("bucket", "items", name);

        ModItems.ITEMS_MAP.put(this, color);
    }

    /**
     * default : new AutoJson(name, itemOrBlock, types);
     * types list :
     * 普通物品,盔甲 "generated"
     * 工具 "handheld"
     * 方块 "cube_all“
     * itemOrBlock list :
     * 物品 "item"
     * 方块 "block"
     * 流体方块 "blockFluid"
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

    /**
     * default : new AutoTextures(sourceTypes,destTypes,name);
     * types list:
     * block_iron :    铁块纹理
     * block_ore  :    铁矿纹理
     * helmet     :    头盔
     * chest      :    胸甲
     * legs       :    腿
     * boots      :    靴子
     * sword      :    剑
     * axe        :    斧子
     * pickaxe    :    镐子
     * shovel     :    铲子
     * hoe        :    锄头
     * ingot      :    铁锭
     * nugget     :    铁粒
     * dust       :    火药
     * fluid      :    流体
     * <p>
     * types list:
     * items       物品
     * blocks      方块
     *
     * @param sourceTypes
     * @param destTypes
     * @param name
     */
    @Override
    public void createTextures(String sourceTypes, String destTypes, String name) {
        new AutoTextures(sourceTypes,destTypes,name);
    }
}
