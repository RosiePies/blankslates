package com.rosiepies.blankslates.item;

import com.rosiepies.blankslates.other.RegistryHelper;
import io.wispforest.owo.registration.reflect.ItemRegistryContainer;
import com.rosiepies.blankslates.BlankSlates;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public class BlankSlatesItems implements ItemRegistryContainer {
    public static final Item BLANK_SLATE_SMITHING_TEMPLATE = new SmithingTemplateItem(
            Text.translatable("smithing_template.blankslates.blank_slate.applies_to").formatted(Formatting.BLUE),
            Text.translatable("smithing_template.blankslates.blank_slate.ingredients").formatted(Formatting.BLUE),
            Text.translatable("smithing_template.blankslates.blank_slate").formatted(Formatting.GRAY),
            Text.translatable("smithing_template.blankslates.blank_slate.base_slot_description"),
            Text.translatable("smithing_template.blankslates.blank_slate.additions_slot_description"),
            List.of(new Identifier("item/empty_slot_smithing_template_armor_trim")),
            List.of(RegistryHelper.id("item/empty_slot_catalyst"))
    );
    public static final Item ANCIENT_BLANK_SLATE_SMITHING_TEMPLATE = new SmithingTemplateItem(
            Text.translatable("smithing_template.blankslates.ancient_blank_slate.applies_to").formatted(Formatting.BLUE),
            Text.translatable("smithing_template.blankslates.ancient_blank_slate.ingredients").formatted(Formatting.BLUE),
            Text.translatable("smithing_template.blankslates.ancient_blank_slate").formatted(Formatting.GRAY),
            Text.translatable("smithing_template.blankslates.ancient_blank_slate.base_slot_description"),
            Text.translatable("smithing_template.blankslates.ancient_blank_slate.additions_slot_description"),
            List.of(new Identifier("item/empty_slot_smithing_template_netherite_upgrade")),
            List.of(RegistryHelper.id("item/empty_slot_catalyst"))
    );

    public static final Item CATALYST = new Item(new FabricItemSettings());
    public static final Item ANCIENT_CATALYST = new Item(new FabricItemSettings());

    public static Identifier id(String path) {
        return new Identifier(BlankSlates.MOD_ID, path);
    }

    public static void init() {
    }
}
