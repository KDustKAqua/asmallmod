package com.nmmoc7.asmallmod.food;

import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EffectFoodBase extends FoodBase implements IHasModel {
    PotionEffect effect;

    public  EffectFoodBase(String name, int amout, float saturation, boolean isWolfFood, PotionEffect effect){
        super(name, amout, saturation, isWolfFood);
        setAlwaysEdible();
        this.effect = effect;
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(
                    effect.getPotion(),
                    effect.getDuration(),
                    effect.getAmplifier(),
                    effect.getIsAmbient(),
                    effect.doesShowParticles()));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack){
        return true;
    }
}
