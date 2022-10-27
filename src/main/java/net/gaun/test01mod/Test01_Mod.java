package net.gaun.test01mod;

import net.fabricmc.api.ModInitializer;
import net.gaun.test01mod.block.ModBlocks;
import net.gaun.test01mod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test01_Mod implements ModInitializer {
	public static final String MOD_ID = "test01mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItem();
		ModBlocks.registerModBlocks();
	}
}
