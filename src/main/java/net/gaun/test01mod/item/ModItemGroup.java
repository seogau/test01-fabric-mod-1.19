package net.gaun.test01mod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.gaun.test01mod.Test01_Mod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TANZANITE = FabricItemGroupBuilder.build(
            new Identifier(Test01_Mod.MOD_ID, "tanzanite"), () -> new ItemStack(ModItems.TANZANITE));
}
