package com.example.examplemod.init;

import com.example.examplemod.item.tools.SwordBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();
    public static final Item BLACKSTONE_SWORD = new SwordBase("blackstone_sword", CreativeTabs.COMBAT, Item.ToolMaterial.STONE);
}
