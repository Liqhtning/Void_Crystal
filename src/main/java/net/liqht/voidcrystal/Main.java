package net.liqht.voidcrystal;

import net.fabricmc.api.ModInitializer;
import net.liqht.voidcrystal.block.ModBlocks;
import net.liqht.voidcrystal.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "voidcrystal";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
