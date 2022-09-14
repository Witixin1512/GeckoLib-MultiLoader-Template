package com.example.examplemod;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Constants {

	public static final String MOD_ID = "multiloader";
	public static final String MOD_NAME = "Multi Loader Template";
	public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

	public static ResourceLocation rl(String name){
		return new ResourceLocation(MOD_ID, name);
	}
}