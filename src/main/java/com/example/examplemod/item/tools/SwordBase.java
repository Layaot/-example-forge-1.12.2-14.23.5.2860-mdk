package com.example.examplemod.item.tools;

import com.example.examplemod.init.ModItems;
import com.example.examplemod.utils.IHasModel;
import com.example.examplemod.utils.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;

import java.util.Objects;

public class SwordBase extends ItemSword implements IHasModel {
    public SwordBase(String name, CreativeTabs tab, ToolMaterial material) {
        super(material);
        setRegistryName(Reference.MOD_ID, name);
        setUnlocalizedName(Reference.MOD_ID + "." + name);
        setCreativeTab(tab);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(Objects.requireNonNull(this.getRegistryName()), "inventory"));
    }
}
