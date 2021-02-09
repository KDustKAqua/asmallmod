package com.nmmoc7.asmallmod.fluid;

import com.nmmoc7.asmallmod.auto.AutoTextures;
import com.nmmoc7.asmallmod.init.ModFluid;
import com.nmmoc7.asmallmod.util.IHasTextures;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;

/**
 * setDensity       default : 1000(water)  方法用于设置这个流体的密度，单位为千克每立方米
 * setViscosity     default : 1000(water)  方法用于设置这个流体的粘度，单位为千分之一平方米每秒，使用运动粘度
 * setLuminosity    default : 0(water)     方法用于设置这个流体的亮度，也就是在Minecraft中的亮度
 * setTemperature   default : 300(室温)     方法用于设置这个流体的温度，使用热力学温标，也就是开尔文
 * setGaseous       default : false(water) 方法用于标注这个流体是否为气体，默认不是
 *
 * new FluidBase("", 1000, 1000, 0, 300, false);
 */
public class FluidBase extends Fluid implements IHasTextures {
    int color;

    public FluidBase(String name, int density, int viscosity, int luminosity, int temperature, boolean gaseous, int color) {
        super(name, new ResourceLocation(MOD_ID + ":fluid/" + name + "_still"),
                new ResourceLocation(MOD_ID + ":" + "fluid/"+ name +"_flow"),
                new ResourceLocation(MOD_ID + ":" + "fluid/"+ name +"_overlay"), color | 0xFF000000);

        this.color = color | 0xFF000000;

        this.setUnlocalizedName(MOD_ID + "." + name);
        this.setDensity(density);
        this.setViscosity(viscosity);
        this.setLuminosity(luminosity);
        this.setTemperature(temperature);
        this.setGaseous(gaseous);

        createTextures("fluid", "fluid", name);

        ModFluid.FLUIDS.add(this);
    }

    @Override
    public void createTextures(String sourceTypes, String destTypes, String name) {
        new AutoTextures(sourceTypes,destTypes,name);
    }
}
