package com.example.examplemod;

import com.example.examplemod.proxy.ServerProxy;
import com.example.examplemod.utils.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public enum ExampleMod {
    INSTANCE;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY, modId = Reference.MOD_ID)
    public static ServerProxy proxy;
    @Mod.InstanceFactory
    public static ExampleMod getInstance(){
        return INSTANCE;
    }
    @Mod.EventHandler
    public static void preLoad(FMLPreInitializationEvent event){
        proxy.preLoad(event);
    }
    @Mod.EventHandler
    public static void load(FMLInitializationEvent event){
        proxy.load(event);
    }
}
