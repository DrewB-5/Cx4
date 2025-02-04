package net.jawa.cx4;

import net.fabricmc.api.ModInitializer;

import net.jawa.cx4.blocks.ModBlocks;
import net.jawa.cx4.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cx4 implements ModInitializer {
	public static final String MOD_ID = "cx4";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}