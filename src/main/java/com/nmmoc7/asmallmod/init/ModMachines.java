package com.nmmoc7.asmallmod.init;

import com.nmmoc7.asmallmod.blocks.machines.MachinesBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModMachines {
    public static final List<MachinesBase> MACHINES_LIST = new ArrayList<MachinesBase>();
    public static final List<Item> MACHINES_LIST_ITEM = new ArrayList<Item>();

    public static final MachinesBase NEW_MACHINES = new MachinesBase("new_machines", 1, 3.5f);
}
