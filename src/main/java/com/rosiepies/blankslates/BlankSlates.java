package com.rosiepies.blankslates;

import com.rosiepies.blankslates.item.BlankSlatesItems;
import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlankSlates implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("blankslates");
    public static final String MOD_ID = "blankslates";

    @Override
    public void onInitialize() {
        BlankSlatesItems.init();
        LOGGER.info("Hello Fabric world!");
        FieldRegistrationHandler.register(BlankSlatesItems.class, MOD_ID, false);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((content) -> {
            content.addBefore(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, new ItemStack(BlankSlatesItems.ANCIENT_BLANK_SLATE_SMITHING_TEMPLATE));
            content.addAfter(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, new ItemStack(BlankSlatesItems.BLANK_SLATE_SMITHING_TEMPLATE));
            content.addAfter(Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE, new ItemStack(BlankSlatesItems.ANCIENT_CATALYST));
            content.addAfter(Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE, new ItemStack(BlankSlatesItems.CATALYST));
        });
    }
}
