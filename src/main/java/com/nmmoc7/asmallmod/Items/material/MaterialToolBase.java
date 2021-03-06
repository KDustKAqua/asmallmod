package com.nmmoc7.asmallmod.items.material;

import com.nmmoc7.asmallmod.items.normal.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialToolBase extends ItemBase {
    public final Item.ToolMaterial TOOL_MATERIAL;

    public MaterialToolBase(String name, int level, int maxUses, float efficiency, float damge, int enchantability, int color){
        super(name, color);
        TOOL_MATERIAL = EnumHelper.addToolMaterial(name.toUpperCase(), level, maxUses, efficiency, damge, enchantability);
    }
}