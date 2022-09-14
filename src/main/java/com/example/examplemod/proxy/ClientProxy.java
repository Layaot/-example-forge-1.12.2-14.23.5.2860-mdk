package com.example.examplemod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends ServerProxy {
	@Override
	public void preLoad(FMLPreInitializationEvent event) {
		super.preLoad(event);
	}
	
	@Override
	public void load(FMLInitializationEvent event) {
		super.load(event);
	}
}
