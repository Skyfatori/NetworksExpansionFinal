package com.ytdd9527.networksexpansion.implementation;


import com.balugaq.netex.api.enums.Skins;
import com.ytdd9527.networksexpansion.utils.itemstacks.ItemStackUtil;
import io.github.sefiraat.networks.Networks;
import io.github.sefiraat.networks.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


/**
 * @author ytdd9527
 * @noinspection SpellCheckingInspection
 * @since 2.0
 */
public class ExpansionItemStacks {
    // Workbench
    public static final SlimefunItemStack NETWORKS_EXPANSION_WORKBENCH = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_WORKBENCH", Material.BAMBOO_BLOCK),
            Theme.MACHINE
    );

    public static final SlimefunItemStack NETWORKS_EXPANSION_WORKBENCH_6X6 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_WORKBENCH_6X6", Material.LAPIS_BLOCK),
            Theme.MACHINE
    );
    // Tools
    public static final SlimefunItemStack WORLDEDIT_AXE = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_WORLD_EDIT_AXE", Material.DIAMOND_AXE),
            Theme.TOOL
    );
    public static final SlimefunItemStack INFO_TOOL = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_INFO_TOOL", Material.FEATHER),
            Theme.TOOL
    );
    // Advanced Networks Machines
    public static final SlimefunItemStack ADVANCED_IMPORT = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_IMPORT", Enchanted(Material.RED_STAINED_GLASS)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_EXPORT = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_EXPORT", Enchanted(Material.BLUE_STAINED_GLASS)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_PURGER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_PURGER", Enchanted(Material.YELLOW_STAINED_GLASS)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_GREEDY_BLOCK = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_GREEDY_BLOCK", Enchanted(Material.GRAY_STAINED_GLASS)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_CAPACITOR_5 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CAPACITOR_5", Material.CYAN_GLAZED_TERRACOTTA),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_CAPACITOR_6 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CAPACITOR_6", Material.BLUE_GLAZED_TERRACOTTA),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_INPUT_ONLY_MONITOR = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_INPUT_ONLY_MONITOR", Material.LIGHT_GRAY_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_OUTPUT_ONLY_MONITOR = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_OUTPUT_ONLY_MONITOR", Material.GRAY_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_TRANSFER_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_TRANSFER_PUSHER", Material.OBSERVER),
            Theme.MACHINE
    );

    public static final SlimefunItemStack LINE_TRANSFER_MORE_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_TRANSFER_MORE_PUSHER", Material.LIME_GLAZED_TERRACOTTA),
            Theme.MACHINE
    );

    public static final SlimefunItemStack LINE_TRANSFER_BEST_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_TRANSFER_BEST_PUSHER", Material.LIME_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_TRANSFER_GRABBER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_TRANSFER_GRABBER", Material.HAY_BLOCK),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_TRANSFER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_TRANSFER", Material.PISTON),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_TRANSFER_PLUS_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_TRANSFER_PLUS_PUSHER", Material.LIME_GLAZED_TERRACOTTA),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_TRANSFER_PLUS_MORE_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_TRANSFER_PLUS_MORE_PUSHER", Material.LIME_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_TRANSFER_PLUS_BEST_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_TRANSFER_PLUS_BEST_PUSHER", Material.LIME_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_TRANSFER_PLUS_GRABBER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_TRANSFER_PLUS_GRABBER", Material.WAXED_COPPER_BLOCK),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_TRANSFER_PLUS = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_TRANSFER_PLUS", Material.STICKY_PISTON),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_TRANSFER_VANILLA_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_TRANSFER_VANILLA_PUSHER", Material.OBSERVER),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_TRANSFER_VANILLA_GRABBER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_TRANSFER_VANILLA_GRABBER", Material.HAY_BLOCK),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_LINE_TRANSFER_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_LINE_TRANSFER_PUSHER", Enchanted(Material.OBSERVER)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_LINE_TRANSFER_MORE_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_LINE_TRANSFER_MORE_PUSHER", Enchanted(Material.LIME_GLAZED_TERRACOTTA)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_LINE_TRANSFER_BEST_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_LINE_TRANSFER_BEST_PUSHER", Enchanted(Material.LIME_STAINED_GLASS)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_LINE_TRANSFER_GRABBER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_LINE_TRANSFER_GRABBER", Enchanted(Material.HAY_BLOCK)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_LINE_TRANSFER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_LINE_TRANSFER", Enchanted(Material.PISTON)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_LINE_TRANSFER_PLUS_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_LINE_TRANSFER_PLUS_PUSHER", Enchanted(Material.LIME_GLAZED_TERRACOTTA)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_LINE_TRANSFER_PLUS_MORE_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_LINE_TRANSFER_PLUS_MORE_PUSHER", Enchanted(Material.LIME_STAINED_GLASS)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_LINE_TRANSFER_PLUS_BEST_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_LINE_TRANSFER_PLUS_BEST_PUSHER", Enchanted(Material.LIME_STAINED_GLASS)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_LINE_TRANSFER_PLUS_GRABBER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_LINE_TRANSFER_PLUS_GRABBER", Enchanted(Material.WAXED_COPPER_BLOCK)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_LINE_TRANSFER_PLUS = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_LINE_TRANSFER_PLUS", Enchanted(Material.STICKY_PISTON)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack TRANSFER_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_TRANSFER_PUSHER", Material.OBSERVER),
            Theme.MACHINE
    );
    public static final SlimefunItemStack TRANSFER_MORE_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_TRANSFER_MORE_PUSHER", Material.LIME_GLAZED_TERRACOTTA),
            Theme.MACHINE
    );
    public static final SlimefunItemStack TRANSFER_BEST_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_TRANSFER_BEST_PUSHER", Material.LIME_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack TRANSFER_GRABBER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_TRANSFER_GRABBER", Material.HAY_BLOCK),
            Theme.MACHINE
    );
    public static final SlimefunItemStack TRANSFER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_TRANSFER", Material.PISTON),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_TRANSFER_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_TRANSFER_PUSHER", Material.OBSERVER),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_TRANSFER_MORE_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_TRANSFER_MORE_PUSHER", Material.LIME_GLAZED_TERRACOTTA),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_TRANSFER_BEST_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_TRANSFER_BEST_PUSHER", Material.LIME_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_TRANSFER_GRABBER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_TRANSFER_GRABBER", Material.HAY_BLOCK),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_TRANSFER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_TRANSFER", Material.STICKY_PISTON),
            Theme.MACHINE
    );
    public static final SlimefunItemStack SMART_GRABBER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_SMART_GRABBER", Material.END_ROD),
            Theme.MACHINE
    );
    public static final SlimefunItemStack SMART_PUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_SMART_PUSHER", Material.LIGHTNING_ROD),
            Theme.MACHINE
    );
    // Grid
    public static final SlimefunItemStack NETWORK_GRID_NEW_STYLE = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_GRID_NEW_STYLE", Material.NOTE_BLOCK),
            Theme.MACHINE
    );
    // Blueprints
    public static final SlimefunItemStack MAGIC_WORKBENCH_BLUEPRINT = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_MAGIC_WORKBENCH_BLUEPRINT", Material.RED_DYE),
            Theme.TOOL
    );
    public static final SlimefunItemStack ARMOR_FORGE_BLUEPRINT = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ARMOR_FORGE_BLUEPRINT", Material.ORANGE_DYE),
            Theme.TOOL
    );
    public static final SlimefunItemStack SMELTERY_BLUEPRINT = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_SMELTERY_BLUEPRINT", Material.YELLOW_DYE),
            Theme.TOOL
    );
    public static final SlimefunItemStack QUANTUM_WORKBENCH_BLUEPRINT = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_QUANTUM_WORKBENCH_BLUEPRINT", Material.LIME_DYE),
            Theme.TOOL
    );
    public static final SlimefunItemStack ANCIENT_ALTAR_BLUEPRINT = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ANCIENT_ALTAR_BLUEPRINT", Material.CYAN_DYE),
            Theme.TOOL
    );
    public static final SlimefunItemStack EXPANSION_WORKBENCH_BLUEPRINT = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_EXPANSION_WORKBENCH_BLUEPRINT", Material.BROWN_DYE),
            Theme.TOOL
    );
    public static final SlimefunItemStack COMPRESSOR_BLUEPRINT = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_COMPRESSOR_BLUEPRINT", Material.PINK_DYE),
            Theme.TOOL
    );
    public static final SlimefunItemStack GRIND_STONE_BLUEPRINT = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_GRIND_STONE_BLUEPRINT", Material.MAGENTA_DYE),
            Theme.TOOL
    );
    public static final SlimefunItemStack JUICER_BLUEPRINT = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_JUICER_BLUEPRINT", Material.LIGHT_BLUE_DYE),
            Theme.TOOL
    );
    public static final SlimefunItemStack ORE_CRUSHER_BLUEPRINT = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ORE_CRUSHER_BLUEPRINT", Material.GRAY_DYE),
            Theme.TOOL
    );
    public static final SlimefunItemStack PRESSURE_CHAMBER_BLUEPRINT = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_PRESSURE_CHAMBER_BLUEPRINT", Material.LIGHT_GRAY_DYE),
            Theme.TOOL
    );
    // Encoders
    public static final SlimefunItemStack MAGIC_WORKBENCH_RECIPE_ENCODER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_MAGIC_WORKBENCH_RECIPE_ENCODER", Material.LODESTONE),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ARMOR_FORGE_RECIPE_ENCODER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ARMOR_FORGE_RECIPE_ENCODER", Material.FLETCHING_TABLE),
            Theme.MACHINE
    );
    public static final SlimefunItemStack SMELTERY_RECIPE_ENCODER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_SMELTERY_RECIPE_ENCODER", Material.SHROOMLIGHT),
            Theme.MACHINE
    );
    public static final SlimefunItemStack QUANTUM_WORKBENCH_RECIPE_ENCODER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_QUANTUM_WORKBENCH_RECIPE_ENCODER", Material.WET_SPONGE),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ANCIENT_ALTAR_RECIPE_ENCODER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ANCIENT_ALTAR_RECIPE_ENCODER", Material.BEACON),
            Theme.MACHINE
    );
    public static final SlimefunItemStack EXPANSION_WORKBENCH_RECIPE_ENCODER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_EXPANSION_WORKBENCH_RECIPE_ENCODER", Material.SEA_LANTERN),
            Theme.MACHINE
    );
    public static final SlimefunItemStack COMPRESSOR_RECIPE_ENCODER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_COMPRESSOR_RECIPE_ENCODER", Material.PISTON),
            Theme.MACHINE
    );
    public static final SlimefunItemStack GRIND_STONE_RECIPE_ENCODER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_GRIND_STONE_RECIPE_ENCODER", Material.LOOM),
            Theme.MACHINE
    );
    public static final SlimefunItemStack JUICER_RECIPE_ENCODER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_JUICER_RECIPE_ENCODER", Material.VERDANT_FROGLIGHT),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ORE_CRUSHER_RECIPE_ENCODER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ORE_CRUSHER_RECIPE_ENCODER", Material.CAULDRON),
            Theme.MACHINE
    );
    public static final SlimefunItemStack PRESSURE_CHAMBER_RECIPE_ENCODER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_PRESSURE_CHAMBER_RECIPE_ENCODER", Material.STICKY_PISTON),
            Theme.MACHINE
    );
    // Auto Crafters
    public static final SlimefunItemStack AUTO_MAGIC_WORKBENCH = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_MAGIC_WORKBENCH", Material.BOOKSHELF),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_MAGIC_WORKBENCH_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_MAGIC_WORKBENCH_WITHHOLDING", Material.CHISELED_BOOKSHELF),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_ARMOR_FORGE = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_ARMOR_FORGE", Material.SMITHING_TABLE),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_ARMOR_FORGE_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_ARMOR_FORGE_WITHHOLDING", Material.CARTOGRAPHY_TABLE),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_SMELTERY = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_SMELTERY", Material.FURNACE),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_SMELTERY_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_SMELTERY_WITHHOLDING", Material.BLAST_FURNACE),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_QUANTUM_WORKBENCH = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_QUANTUM_WORKBENCH", Material.BRAIN_CORAL_BLOCK),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_QUANTUM_WORKBENCH_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_QUANTUM_WORKBENCH_WITHHOLDING", Material.DRIED_KELP_BLOCK),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_ANCIENT_ALTAR = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_ANCIENT_ALTAR", Material.ENCHANTING_TABLE),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_ANCIENT_ALTAR_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_ANCIENT_ALTAR_WITHHOLDING", Material.CALIBRATED_SCULK_SENSOR),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_EXPANSION_WORKBENCH = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_EXPANSION_WORKBENCH", Material.FIRE_CORAL_BLOCK),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_EXPANSION_WORKBENCH_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_EXPANSION_WORKBENCH_WITHHOLDING", Material.HORN_CORAL_BLOCK),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_COMPRESSOR = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_COMPRESSOR", Material.COMPOSTER),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_COMPRESSOR_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_COMPRESSOR_WITHHOLDING", Material.JUKEBOX),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_GRIND_STONE = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_GRIND_STONE", Material.DROPPER),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_GRIND_STONE_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_GRIND_STONE_WITHHOLDING", Material.DISPENSER),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_JUICER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_JUICER", Material.MOSS_BLOCK),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_JUICER_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_JUICER_WITHHOLDING", Material.MUD),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_ORE_CRUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_ORE_CRUSHER", Material.RAW_IRON_BLOCK),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_ORE_CRUSHER_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_ORE_CRUSHER_WITHHOLDING", Material.RAW_GOLD_BLOCK),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_PRESSURE_CHAMBER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_PRESSURE_CHAMBER", Material.SMOOTH_STONE),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTO_PRESSURE_CHAMBER_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTO_PRESSURE_CHAMBER_WITHHOLDING", Material.SMOOTH_SANDSTONE),
            Theme.MACHINE
    );
    // Advanced Auto Crafters
    public static final SlimefunItemStack ADVANCED_AUTO_MAGIC_WORKBENCH = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_MAGIC_WORKBENCH", Enchanted(Material.BOOKSHELF)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_MAGIC_WORKBENCH_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_MAGIC_WORKBENCH_WITHHOLDING", Enchanted(Material.CHISELED_BOOKSHELF)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_ARMOR_FORGE = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_ARMOR_FORGE", Enchanted(Material.SMITHING_TABLE)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_ARMOR_FORGE_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_ARMOR_FORGE_WITHHOLDING", Enchanted(Material.CARTOGRAPHY_TABLE)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_SMELTERY = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_SMELTERY", Enchanted(Material.FURNACE)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_SMELTERY_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_SMELTERY_WITHHOLDING", Enchanted(Material.BLAST_FURNACE)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_QUANTUM_WORKBENCH = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_QUANTUM_WORKBENCH", Enchanted(Material.BRAIN_CORAL_BLOCK)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_QUANTUM_WORKBENCH_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_QUANTUM_WORKBENCH_WITHHOLDING", Enchanted(Material.DRIED_KELP_BLOCK)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_ANCIENT_ALTAR = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_ANCIENT_ALTAR", Enchanted(Material.ENCHANTING_TABLE)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_ANCIENT_ALTAR_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_ANCIENT_ALTAR_WITHHOLDING", Enchanted(Material.CALIBRATED_SCULK_SENSOR)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_EXPANSION_WORKBENCH = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_EXPANSION_WORKBENCH", Enchanted(Material.FIRE_CORAL_BLOCK)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_EXPANSION_WORKBENCH_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_EXPANSION_WORKBENCH_WITHHOLDING", Enchanted(Material.HORN_CORAL_BLOCK)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_COMPRESSOR = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_COMPRESSOR", Enchanted(Material.COMPOSTER)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_COMPRESSOR_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_COMPRESSOR_WITHHOLDING", Enchanted(Material.JUKEBOX)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_GRIND_STONE = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_GRIND_STONE", Enchanted(Material.DROPPER)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_GRIND_STONE_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_GRIND_STONE_WITHHOLDING", Enchanted(Material.DISPENSER)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_JUICER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_JUICER", Enchanted(Material.MOSS_BLOCK)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_JUICER_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_JUICER_WITHHOLDING", Enchanted(Material.MUD)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_ORE_CRUSHER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_ORE_CRUSHER", Enchanted(Material.RAW_IRON_BLOCK)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_ORE_CRUSHER_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_ORE_CRUSHER_WITHHOLDING", Enchanted(Material.RAW_GOLD_BLOCK)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_PRESSURE_CHAMBER = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_PRESSURE_CHAMBER", Enchanted(Material.SMOOTH_STONE)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_PRESSURE_CHAMBER_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_PRESSURE_CHAMBER_WITHHOLDING", Enchanted(Material.SMOOTH_SANDSTONE)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_CRAFTING_TABLE = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_CRAFTING", Enchanted(Material.CRAFTING_TABLE)),
            Theme.MACHINE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_CRAFTING_TABLE_WITHHOLDING = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_AUTO_CRAFTING_WITHHOLDING", Enchanted(Material.CRAFTING_TABLE)),
            Theme.MACHINE
    );
    // Bridges
    public static final SlimefunItemStack NETWORK_BRIDGE_WHITE = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_WHITE", Material.WHITE_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_BRIDGE_LIGHT_GRAY = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_LIGHT_GRAY", Material.LIGHT_GRAY_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_BRIDGE_GRAY = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_GRAY", Material.GRAY_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_BRIDGE_BLACK = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_BLACK", Material.BLACK_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_BRIDGE_BROWN = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_BROWN", Material.BROWN_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_BRIDGE_RED = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_RED", Material.RED_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_BRIDGE_ORANGE = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_ORANGE", Material.ORANGE_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_BRIDGE_YELLOW = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_YELLOW", Material.YELLOW_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_BRIDGE_LIME = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_LIME", Material.LIME_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_BRIDGE_GREEN = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_GREEN", Material.GREEN_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_BRIDGE_CYAN = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_CYAN", Material.CYAN_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_BRIDGE_LIGHT_BLUE = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_LIGHT_BLUE", Material.LIGHT_BLUE_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_BRIDGE_BLUE = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_BLUE", Material.BLUE_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_BRIDGE_PURPLE = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_PURPLE", Material.PURPLE_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_BRIDGE_MAGENTA = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_MAGENTA", Material.MAGENTA_STAINED_GLASS),
            Theme.MACHINE
    );
    public static final SlimefunItemStack NETWORK_BRIDGE_PINK = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BRIDGE_PINK", Material.PINK_STAINED_GLASS),
            Theme.MACHINE
    );
    // Storages
    public static final SlimefunItemStack ADVANCED_QUANTUM_STORAGE = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ADVANCED_QUANTUM_STORAGE", Material.AMETHYST_BLOCK),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_POWER_OUTLET_1 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_POWER_OUTLET_1", Material.WHITE_WOOL),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_POWER_OUTLET_2 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_POWER_OUTLET_2", Material.LIGHT_GRAY_WOOL),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_POWER_OUTLET_3 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_POWER_OUTLET_3", Material.GRAY_WOOL),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_POWER_OUTLET_4 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_POWER_OUTLET_4", Material.BLACK_WOOL),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_POWER_OUTLET_5 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_POWER_OUTLET_5", Material.BROWN_WOOL),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_POWER_OUTLET_6 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_POWER_OUTLET_6", Material.RED_WOOL),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_POWER_OUTLET_7 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_POWER_OUTLET_7", Material.ORANGE_WOOL),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_POWER_OUTLET_8 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_POWER_OUTLET_8", Material.YELLOW_WOOL),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_POWER_OUTLET_9 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_POWER_OUTLET_9", Material.LIME_WOOL),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_POWER_OUTLET_10 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_POWER_OUTLET_10", Material.GREEN_WOOL),
            Theme.MACHINE
    );
    public static final SlimefunItemStack LINE_POWER_OUTLET_11 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_LINE_POWER_OUTLET_11", Material.CYAN_WOOL),
            Theme.MACHINE
    );
    public static final SlimefunItemStack AUTHOR_SEFIRAAT = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTHOR_SEFIRAAT", Skins.AUTHOR_SEFIRAAT.getHash()),
            Theme.GUIDE
    );
    public static final SlimefunItemStack AUTHOR_YBW0014 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTHOR_YBW0014", Skins.AUTHOR_YBW0014.getHash()),
            Theme.GUIDE
    );
    public static final SlimefunItemStack AUTHOR_YITOUDAIDAI = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTHOR_YITOUDAIDAI", Material.PLAYER_HEAD),
            Theme.GUIDE
    );
    public static final SlimefunItemStack AUTHOR_TINALNESS = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_AUTHOR_TINALNESS", Skins.AUTHOR_TINALNESS.getHash()),
            Theme.GUIDE
    );
    // Cargo Nodes
    public static final SlimefunItemStack CARGO_NODE_QUICK_TOOL = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_NODE_QUICK_TOOL", Material.BONE),
            Theme.MACHINE
    );
    public static final SlimefunItemStack STORAGE_UNIT_UPGRADE_TABLE = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_STORAGE_UPGRADE_TABLE", Material.CARTOGRAPHY_TABLE),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_1 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_1", Material.CHISELED_BOOKSHELF),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_2 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_2", Material.CHISELED_BOOKSHELF),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_3 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_3", Material.CHISELED_BOOKSHELF),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_4 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_4", Material.CHISELED_BOOKSHELF),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_5 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_5", Material.CHISELED_BOOKSHELF),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_6 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_6", Material.CHISELED_BOOKSHELF),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_7 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_7", Material.CHISELED_BOOKSHELF),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_8 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_8", Material.CHISELED_BOOKSHELF),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_9 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_9", Material.CHISELED_BOOKSHELF),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_10 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_10", Material.CHISELED_BOOKSHELF),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_11 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_11", Material.CHISELED_BOOKSHELF),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_12 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_12", Material.CHISELED_BOOKSHELF),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_13 = Theme.Random(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_13", Material.CHISELED_BOOKSHELF),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_1_MODEL = Theme.model(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_1_MODEL", Skins.CARGO_STORAGE_UNIT_1_MODEL.getHash()),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_2_MODEL = Theme.model(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_2_MODEL", Skins.CARGO_STORAGE_UNIT_2_MODEL.getHash()),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_3_MODEL = Theme.model(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_3_MODEL", Skins.CARGO_STORAGE_UNIT_3_MODEL.getHash()),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_4_MODEL = Theme.model(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_4_MODEL", Skins.CARGO_STORAGE_UNIT_4_MODEL.getHash()),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_5_MODEL = Theme.model(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_5_MODEL", Skins.CARGO_STORAGE_UNIT_5_MODEL.getHash()),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_6_MODEL = Theme.model(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_6_MODEL", Skins.CARGO_STORAGE_UNIT_6_MODEL.getHash()),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_7_MODEL = Theme.model(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_7_MODEL", Skins.CARGO_STORAGE_UNIT_7_MODEL.getHash()),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_8_MODEL = Theme.model(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_8_MODEL", Skins.CARGO_STORAGE_UNIT_8_MODEL.getHash()),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_9_MODEL = Theme.model(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_9_MODEL", Skins.CARGO_STORAGE_UNIT_9_MODEL.getHash()),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_10_MODEL = Theme.model(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_10_MODEL", Skins.CARGO_STORAGE_UNIT_10_MODEL.getHash()),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_11_MODEL = Theme.model(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_11_MODEL", Skins.CARGO_STORAGE_UNIT_11_MODEL.getHash()),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_12_MODEL = Theme.model(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_12_MODEL", Skins.CARGO_STORAGE_UNIT_12_MODEL.getHash()),
            Theme.MACHINE
    );
    public static final SlimefunItemStack CARGO_STORAGE_UNIT_13_MODEL = Theme.model(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CARGO_STORAGE_UNIT_13_MODEL", Skins.CARGO_STORAGE_UNIT_13_MODEL.getHash()),
            Theme.MACHINE
    );
    public static final SlimefunItemStack DUE_MACHINE_CONFIGURATOR = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_DUE_MACHINE_CONFIGURATOR", Material.BLAZE_ROD),
            Theme.TOOL
    );
    public static final SlimefunItemStack ITEM_MOVER = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ITEM_MOVER", Material.DEBUG_STICK),
            Theme.TOOL
    );
    public static final SlimefunItemStack NETWORK_BLUEPRINT_DECODER = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BLUEPRINT_DECODER", Material.DEEPSLATE_TILES),
            Theme.MACHINE
    );
    public static final SlimefunItemStack DUE_MACHINE = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_DUE_MACHINE", Material.TARGET),
            Theme.MACHINE
    );
    public static final SlimefunItemStack OFFSETTER = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_OFFSETTER", Material.GRINDSTONE),
            Theme.MACHINE
    );
    public static final SlimefunItemStack BETTER_GRABBER = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_BETTER_GRABBER", Material.PINK_STAINED_GLASS),
            Theme.MACHINE
    );

    public static final SlimefunItemStack NTW_EXPANSION_ANNOUNCE_1 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ANNOUNCE_1", Material.BOOK),
            Theme.GUIDE
    );
    public static final SlimefunItemStack NTW_EXPANSION_ANNOUNCE_2 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ANNOUNCE_2", Material.BOOK),
            Theme.GUIDE
    );
    public static final SlimefunItemStack NTW_EXPANSION_ANNOUNCE_3 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ANNOUNCE_3", Material.BOOK),
            Theme.GUIDE
    );
    public static final SlimefunItemStack NTW_EXPANSION_ANNOUNCE_4 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ANNOUNCE_4", Material.BOOK),
            Theme.GUIDE
    );
    public static final SlimefunItemStack NTW_EXPANSION_ANNOUNCE_5 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ANNOUNCE_5", Material.BOOK),
            Theme.GUIDE
    );
    public static final SlimefunItemStack NTW_EXPANSION_ANNOUNCE_6 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ANNOUNCE_6", Material.BOOK),
            Theme.GUIDE
    );
    public static final SlimefunItemStack NTW_EXPANSION_ANNOUNCE_7 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ANNOUNCE_7", Material.BOOK),
            Theme.GUIDE
    );
    public static final SlimefunItemStack NTW_EXPANSION_ANNOUNCE_8 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ANNOUNCE_8", Material.BOOK),
            Theme.GUIDE
    );
    public static final SlimefunItemStack NTW_EXPANSION_ANNOUNCE_9 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ANNOUNCE_9", Material.BOOK),
            Theme.GUIDE
    );

    public static final SlimefunItemStack NTW_EXPANSION_ANNOUNCE_10 = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_ANNOUNCE_10", Material.BOOK),
            Theme.GUIDE
    );
    public static final SlimefunItemStack NETWORK_CRAFTING_GRID_NEW_STYLE = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_CRAFTING_GRID_NEW_STYLE", Material.CRAFTING_TABLE),
            Theme.MACHINE
    );
    public static final SlimefunItemStack STATUS_VIEWER = Theme.themedSlimefunItemStack(
            Networks.getLocalizationService().getItem("NTW_EXPANSION_STATUS_VIEWER", Material.COMPASS),
            Theme.TOOL
    );

    public static ItemStack Enchanted(Material material) {
        return ItemStackUtil.getPreEnchantedItemStack(material);
    }
}
