package com.umbrielstudios.evilmc;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EvilMinecraftMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("evilmc");

    protected static Block CORRUPT_GRASS;
    protected static Item COPPER_COIN = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    @Override
    public void onInitialize(){
        LOGGER.info("Evil Minecraft Revival v1 enabled");

        initializeBlocks();
        initializeItems();
    }

    private static void initializeBlocks() {
        //CORRUPT_GRASS = new GrassBlock();
    }

    private static void initializeItems() {
        Registry.register(Registry.ITEM, new Identifier("evilmc", "copper_coin"), COPPER_COIN);
    }
}