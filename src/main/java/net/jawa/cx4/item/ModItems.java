package net.jawa.cx4.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jawa.cx4.Cx4;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TEST_ITEM = registerItem("test_item", new Item(new Item.Settings()));
    public static final Item TEST_ITEM_2 = registerItem("test_item_2", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Cx4.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Cx4.LOGGER.info("Registering Mod Items for" + Cx4.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(TEST_ITEM);
           entries.add(TEST_ITEM_2);
        });
    }
}
