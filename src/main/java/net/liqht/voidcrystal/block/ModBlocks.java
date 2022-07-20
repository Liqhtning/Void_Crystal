package net.liqht.voidcrystal.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.liqht.voidcrystal.Main;
import net.liqht.voidcrystal.block.custom.VoidCrystalBlock;
import net.liqht.voidcrystal.block.custom.VoidCrystalEntryBlock;
import net.liqht.voidcrystal.block.custom.VoidCrystalExitBlock;
import net.liqht.voidcrystal.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    // VoidCrystalBlock
    public static final Block VOIDCRYSTALBLOCK = registerBlock("voidcrystalblock",
            new VoidCrystalBlock(FabricBlockSettings.of(Material.METAL).breakInstantly()), ModItemGroup.VOID_ITEMS);

    // VoidCrystalEntryBlock
    public static final Block VOIDCRYSTALENTRYBLOCK = registerBlock("voidcrystalentryblock",
            new VoidCrystalEntryBlock(FabricBlockSettings.of(Material.METAL).breakInstantly()), ModItemGroup.VOID_ITEMS);

    // VoidCrystalExitBlock
    public static final Block VOIDCRYSTALEXITBLOCK = registerBlock("voidcrystalexitblock",
            new VoidCrystalExitBlock(FabricBlockSettings.of(Material.METAL).breakInstantly()), ModItemGroup.VOID_ITEMS);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        Main.LOGGER.debug("Registering ModBlocks for " + Main.MOD_ID);
    }
}
