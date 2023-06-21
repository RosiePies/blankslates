package com.rosiepies.blankslates.item;

import com.rosiepies.blankslates.BlankSlates;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SlateItem extends Item {
    private static final Formatting TITLE_FORMATTING;
    private static final Formatting DESCRIPTION_FORMATTING;
    private static final String TRANSLATION_KEY;
    private static final Text INGREDIENTS_TEXT;
    private static final Text APPLIES_TO_TEXT;
    private static final Text ANCIENT_BLANK_SLATE_TEXT;
    private static final Text ANCIENT_BLANK_SLATE_APPLIES_TO_TEXT;
    private static final Text ANCIENT_BLANK_SLATE_INGREDIENTS_TEXT;
    private static final Text ANCIENT_BLANK_SLATE_BASE_SLOT_DESCRIPTION_TEXT;
    private static final Text ANCIENT_BLANK_SLATE_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    private static final Text BLANK_SLATE_TEXT;
    private static final Text BLANK_SLATE_APPLIES_TO_TEXT;
    private static final Text BLANK_SLATE_INGREDIENTS_TEXT;
    private static final Text BLANK_SLATE_BASE_SLOT_DESCRIPTION_TEXT;
    private static final Text BLANK_SLATE_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    private static final Identifier EMPTY_SLOT_NETHERITE_SCRAP_TEXTURE;
    private static final Identifier EMPTY_SLOT_DIAMOND_TEXTURE;
    private static final Identifier EMPTY_SLOT_SMITHING_TEMPLATE_UPGRADE_TEXTURE;
    private static final Identifier EMPTY_SLOT_SMITHING_TEMPLATE_TRIM_TEXTURE;
    private final Text appliesToText;
    private final Text ingredientsText;
    private final Text titleText;
    private final Text baseSlotDescriptionText;
    private final Text additionsSlotDescriptionText;
    private final List<Identifier> emptyBaseSlotTextures;
    private final List<Identifier> emptyAdditionsSlotTextures;

    public SlateItem(Text appliesToText, Text ingredientsText, Text titleText, Text baseSlotDescriptionText, Text additionsSlotDescriptionText, List<Identifier> emptyBaseSlotTextures, List<Identifier> emptyAdditionsSlotTextures) {
        super(new Settings());
        this.appliesToText = appliesToText;
        this.ingredientsText = ingredientsText;
        this.titleText = titleText;
        this.baseSlotDescriptionText = baseSlotDescriptionText;
        this.additionsSlotDescriptionText = additionsSlotDescriptionText;
        this.emptyBaseSlotTextures = emptyBaseSlotTextures;
        this.emptyAdditionsSlotTextures = emptyAdditionsSlotTextures;
    }

    public static SlateItem createAncientBlankSlate() {
        return new SlateItem(ANCIENT_BLANK_SLATE_APPLIES_TO_TEXT, ANCIENT_BLANK_SLATE_INGREDIENTS_TEXT, ANCIENT_BLANK_SLATE_TEXT, ANCIENT_BLANK_SLATE_BASE_SLOT_DESCRIPTION_TEXT, ANCIENT_BLANK_SLATE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getAncientBlankSlateUpgradeEmptyBaseSlotTextures(), getAncientBlankSlateUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<Identifier> getAncientBlankSlateUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_SLOT_SMITHING_TEMPLATE_UPGRADE_TEXTURE);
    }

    private static List<Identifier> getAncientBlankSlateUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_NETHERITE_SCRAP_TEXTURE);
    }

    public static SlateItem createBlankSlate() {
        return new SlateItem(BLANK_SLATE_APPLIES_TO_TEXT, BLANK_SLATE_INGREDIENTS_TEXT, BLANK_SLATE_TEXT, BLANK_SLATE_BASE_SLOT_DESCRIPTION_TEXT, BLANK_SLATE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getBlankSlateUpgradeEmptyBaseSlotTextures(), getBlankSlateUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<Identifier> getBlankSlateUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_SLOT_SMITHING_TEMPLATE_TRIM_TEXTURE);
    }

    private static List<Identifier> getBlankSlateUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_DIAMOND_TEXTURE);
    }

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(this.titleText);
        tooltip.add(ScreenTexts.EMPTY);
        tooltip.add(APPLIES_TO_TEXT);
        tooltip.add(ScreenTexts.space().append(this.appliesToText));
        tooltip.add(INGREDIENTS_TEXT);
        tooltip.add(ScreenTexts.space().append(this.ingredientsText));
    }

    public Text getBaseSlotDescription() {
        return this.baseSlotDescriptionText;
    }

    public Text getAdditionsSlotDescription() {
        return this.additionsSlotDescriptionText;
    }

    public List<Identifier> getEmptyBaseSlotTextures() {
        return this.emptyBaseSlotTextures;
    }

    public List<Identifier> getEmptyAdditionsSlotTextures() {
        return this.emptyAdditionsSlotTextures;
    }

    public String getTranslationKey() {
        return TRANSLATION_KEY;
    }

    static {
        TITLE_FORMATTING = Formatting.GRAY;
        DESCRIPTION_FORMATTING = Formatting.BLUE;
        TRANSLATION_KEY = Util.createTranslationKey("item", new Identifier("smithing_template"));
        INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.ingredients"))).formatted(TITLE_FORMATTING);
        APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.applies_to"))).formatted(TITLE_FORMATTING);
        ANCIENT_BLANK_SLATE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier(BlankSlates.MOD_ID, "ancient_blank_slate"))).formatted(TITLE_FORMATTING);
        ANCIENT_BLANK_SLATE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(BlankSlates.MOD_ID, "ancient_blank_slate_smithing_template.applies_to"))).formatted(DESCRIPTION_FORMATTING);
        ANCIENT_BLANK_SLATE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(BlankSlates.MOD_ID, "ancient_blank_slate_smithing_template.ingredients"))).formatted(DESCRIPTION_FORMATTING);
        ANCIENT_BLANK_SLATE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(BlankSlates.MOD_ID, "ancient_blank_slate_smithing_template.base_slot_description")));
        ANCIENT_BLANK_SLATE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(BlankSlates.MOD_ID, "ancient_blank_slate_smithing_template.additions_slot_description")));
        BLANK_SLATE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier(BlankSlates.MOD_ID, "blank_slate"))).formatted(TITLE_FORMATTING);
        BLANK_SLATE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(BlankSlates.MOD_ID, "blank_slate_smithing_template.applies_to"))).formatted(DESCRIPTION_FORMATTING);
        BLANK_SLATE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(BlankSlates.MOD_ID, "blank_slate_smithing_template.ingredients"))).formatted(DESCRIPTION_FORMATTING);
        BLANK_SLATE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(BlankSlates.MOD_ID, "blank_slate_smithing_template.base_slot_description")));
        BLANK_SLATE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(BlankSlates.MOD_ID, "blank_slate_smithing_template.additions_slot_description")));
        EMPTY_SLOT_NETHERITE_SCRAP_TEXTURE = new Identifier(BlankSlates.MOD_ID, "item/empty_slot_netherite_scrap");
        EMPTY_SLOT_DIAMOND_TEXTURE = new Identifier("item/empty_slot_diamond");
        EMPTY_SLOT_SMITHING_TEMPLATE_TRIM_TEXTURE = new Identifier("item/empty_slot_smithing_template_netherite_upgrade");
        EMPTY_SLOT_SMITHING_TEMPLATE_UPGRADE_TEXTURE = new Identifier("item/empty_slot_smithing_template_armor_trim");
    }
}
