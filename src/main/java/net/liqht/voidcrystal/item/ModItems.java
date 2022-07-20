package net.liqht.voidcrystal.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liqht.voidcrystal.Main;
import net.liqht.voidcrystal.item.custom.VoidPearlItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Void Pearl
    public static final Item VOID_PEARL = registerItems("void_pearl",
            new VoidPearlItem(new FabricItemSettings().group(ModItemGroup.VOID_ITEMS).maxCount(16)));

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Main.LOGGER.debug("Registering Mod Items for " + Main.MOD_ID);
    }


}
