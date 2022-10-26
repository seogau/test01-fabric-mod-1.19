package net.gaun.test01mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gaun.test01mod.Test01_Mod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Test01_Mod.MOD_ID, name), item);
    }

    public static void registerModItem(){
        Test01_Mod.LOGGER.debug("Registering Mod Items for " + Test01_Mod.MOD_ID);
    }
}
