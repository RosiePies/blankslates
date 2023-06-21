package com.rosiepies.blankslates.other;

import io.wispforest.owo.itemgroup.OwoItemGroup;
import io.wispforest.owo.itemgroup.OwoItemSettings;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonSerializer;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import com.rosiepies.blankslates.BlankSlates;

/**
 * A helper class containing methods for registering various blocks and items.
 * @author  Noaaan
 */
public class RegistryHelper {

    public static Identifier id(String path) {
        return new Identifier(BlankSlates.MOD_ID, path);
    }

    public static void item(String path, Item item) {
        Registry.register(Registries.ITEM, id(path), item);
    }

}