package com.rosiepies.blankslates.registry;

import net.minecraft.client.gui.screen.ingame.SmithingScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.SmithingScreenHandler;
import net.minecraft.text.Text;

public class SmithingScreenNew extends SmithingScreen {
    public SmithingScreenNew(SmithingScreenHandler handler, PlayerInventory playerInventory, Text title) {
        super(handler, playerInventory, title);
    }
}
