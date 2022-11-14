package net.shadow.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.registry.Registry;
import net.shadow.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.util.registry.Registry.BLOCK;
import static net.minecraft.util.registry.Registry.register;


public class ModBlocks {
    public static Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f)), ItemGroup.BUILDING_BLOCKS);

    public static Block MOSSY_ANDESITE_BRICKS = registerBlock("mossy_andesite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f)), ItemGroup.BUILDING_BLOCKS);

    public static Block CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f)), ItemGroup.BUILDING_BLOCKS);

    public static Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f)), ItemGroup.BUILDING_BLOCKS);

    public static Block MOSSY_DIORITE_BRICKS = registerBlock("mossy_diorite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f)), ItemGroup.BUILDING_BLOCKS);

    public static Block CRACKED_DIORITE_BRICKS = registerBlock("cracked_diorite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f)), ItemGroup.BUILDING_BLOCKS);

    public static Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f)), ItemGroup.BUILDING_BLOCKS);

    public static Block MOSSY_GRANITE_BRICKS = registerBlock("mossy_granite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f)), ItemGroup.BUILDING_BLOCKS);

    public static Block CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f)), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return register(BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }


    public static void registerModBlock() {
        TutorialMod.LOGGER.debug("Registering ModBlock for " + TutorialMod.MOD_ID);
    }
}
