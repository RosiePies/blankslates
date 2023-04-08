package com.rosiepies.blankslates;

import com.rosiepies.blankslates.registry.ModItems;
import com.rosiepies.blankslates.registry.SlateItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.SmithingTemplateItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlankSlates implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("blankslates");
    public static final String MOD_ID = "blankslates";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        LOGGER.info("Hello Fabric world!");
    }
}
