package net.liqht.voidcrystal.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.liqht.voidcrystal.Main;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup VOID_ITEMS = FabricItemGroupBuilder.build(
            new Identifier(Main.MOD_ID, "void_items"), () -> new ItemStack(ModItems.VOID_PEARL));
}
