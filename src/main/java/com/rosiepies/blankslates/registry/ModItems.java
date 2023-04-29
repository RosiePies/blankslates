package com.rosiepies.blankslates.registry;

import com.rosiepies.blankslates.BlankSlates;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    //Items
    public static final Item BLANKSLATE = BlankSlate();
    public static final Item ANCIENTBLANKSLATE = AncientBlankSlate();

    public static Item BlankSlate() {
        return register(new Identifier(BlankSlates.MOD_ID, "blank_slate_smithing_template"), (Item)SlateItem.createBlankSlate());
    }
    public static Item AncientBlankSlate() {
        return register(new Identifier(BlankSlates.MOD_ID, "ancient_blank_slate_smithing_template"), (Item)SlateItem.createAncientBlankSlate());
    }
    public static void Combination() {
        return ;
    }
    public static void addToItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addBefore(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ANCIENTBLANKSLATE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addAfter(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, BLANKSLATE);
        });
    }

    //modid:itemName
    public static void registerItems() {
        addToItemGroup();
        Combination();
    }

    private static Item register(Identifier id, Item item) {
        return (Item)Registry.register(Registries.ITEM, id, item);
    }
}
