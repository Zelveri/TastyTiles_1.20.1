package net.micomibite.tastytiles.block;

import net.micomibite.tastytiles.TastyTiles;
import net.micomibite.tastytiles.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TastyTiles.MOD_ID);

    public static final RegistryObject<Block> RED_PITTER_TILE = registerBlock("red_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)) {
            });

    public static final RegistryObject<Block> RED_PITTER_TILE_SLAB = registerBlock("red_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB)) {
            });

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T>block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
