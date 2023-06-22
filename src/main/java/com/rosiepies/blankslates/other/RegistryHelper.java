package com.rosiepies.blankslates.other;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import com.rosiepies.blankslates.BlankSlates;

public class RegistryHelper {

    public static Identifier id(String path) {
        return new Identifier(BlankSlates.MOD_ID, path);
    }

    public static void item(String path, Item item) {
        Registry.register(Registries.ITEM, id(path), item);
    }

}