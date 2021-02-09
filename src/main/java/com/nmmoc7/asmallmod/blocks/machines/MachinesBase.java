package com.nmmoc7.asmallmod.blocks.machines;

import com.nmmoc7.asmallmod.AsmallMod;
import com.nmmoc7.asmallmod.init.ModItems;
import com.nmmoc7.asmallmod.init.ModMachines;
import com.nmmoc7.asmallmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import static com.nmmoc7.asmallmod.AsmallMod.MOD_ID;
import static com.nmmoc7.asmallmod.init.ModTabs.MACHINES_TAB;

public class MachinesBase extends Block implements IHasModel {
    private static final IProperty<EnumFacing> FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    public MachinesBase(String name, int harvestLevel, float hardness) {
        super(Material.ROCK);

        this.setTranslationKey(MOD_ID + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(MACHINES_TAB);

        this.setHarvestLevel("pickaxe", harvestLevel);
        this.setHardness(hardness);
        this.setDefaultState(this.getBlockState().getBaseState().withProperty(FACING, EnumFacing.NORTH));

        ModMachines.MACHINES_LIST.add(this);
        ModMachines.MACHINES_LIST_ITEM.add(Item.getItemFromBlock(this));
    }

    @Override
    protected @NotNull BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACING).getHorizontalIndex();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.byHorizontalIndex(meta));
    }

    @Override
    public @NotNull IBlockState getStateForPlacement(@NotNull World world, @NotNull BlockPos pos,
                                                     @NotNull EnumFacing facing, float hitX, float hitY,
                                                     float hitZ, int meta, EntityLivingBase placer,
                                                     @NotNull EnumHand hand) {

        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    /**
     * default : AsmallMod.proxy.registerItemRender(this, 0, "inventory");
     * 注册模型
     */
    @Override
    public void registerModels() {
        AsmallMod.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
    }
}
