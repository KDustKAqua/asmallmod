package com.nmmoc7.asmallmod.fluid;

import com.nmmoc7.asmallmod.auto.AutoTextures;
import com.nmmoc7.asmallmod.init.ModFluid;
import com.nmmoc7.asmallmod.util.IHasTextures;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

public class FluidBase extends Fluid implements IHasTextures {
    public FluidBase(String name) {
        super(name, new ResourceLocation(MOD_ID + ":fluid/" + name + "_still"), new ResourceLocation(MOD_ID + ":" + "fluid/"+ name +"_flow"));
        this.setUnlocalizedName(MOD_ID + "." + name);
        this.setDensity(1000);
        this.setViscosity(750);
        this.setLuminosity(0);
        this.setTemperature(300);

        createTextures("fluid", "fluid", name);

        ModFluid.FLUIDS.add(this);
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
