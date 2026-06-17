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

    //Brick Pitter Tiles
    public static final RegistryObject<Block> BRICK_PITTER_TILE = registerBlock("brick_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> BRICK_PITTER_TILE_SLAB = registerBlock("brick_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> BRICK_PITTER_TILE_STAIRS = registerBlock("brick_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.BRICK_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> BRICK_PITTER_TILE_WALL = registerBlock("brick_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Fire Pitter Tiles
    public static final RegistryObject<Block> FIRE_PITTER_TILE = registerBlock("fire_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> FIRE_PITTER_TILE_SLAB = registerBlock("fire_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> FIRE_PITTER_TILE_STAIRS = registerBlock("fire_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.FIRE_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> FIRE_PITTER_TILE_WALL = registerBlock("fire_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Ochre Pitter Tile
    public static final RegistryObject<Block> OCHRE_PITTER_TILE = registerBlock("ochre_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> OCHRE_PITTER_TILE_SLAB = registerBlock("ochre_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> OCHRE_PITTER_TILE_STAIRS = registerBlock("ochre_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.OCHRE_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> OCHRE_PITTER_TILE_WALL = registerBlock("ochre_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Earthy Pitter Tiles
    public static final RegistryObject<Block> EARTHY_PITTER_TILE = registerBlock("earthy_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EARTHY_PITTER_TILE_SLAB = registerBlock("earthy_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EARTHY_PITTER_TILE_STAIRS = registerBlock("earthy_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EARTHY_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EARTHY_PITTER_TILE_WALL = registerBlock("earthy_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Pale Pitter Tiles
    public static final RegistryObject<Block> PALE_PITTER_TILE = registerBlock("pale_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PALE_PITTER_TILE_SLAB = registerBlock("pale_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PALE_PITTER_TILE_STAIRS = registerBlock("pale_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.PALE_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> PALE_PITTER_TILE_WALL = registerBlock("pale_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Lush Pitter Tile
    public static final RegistryObject<Block> LUSH_PITTER_TILE = registerBlock("lush_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LUSH_PITTER_TILE_SLAB = registerBlock("lush_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LUSH_PITTER_TILE_STAIRS = registerBlock("lush_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.LUSH_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LUSH_PITTER_TILE_WALL = registerBlock("lush_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Deep Pitter Tile
    public static final RegistryObject<Block> DEEP_PITTER_TILE = registerBlock("deep_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DEEP_PITTER_TILE_SLAB = registerBlock("deep_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DEEP_PITTER_TILE_STAIRS = registerBlock("deep_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DEEP_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DEEP_PITTER_TILE_WALL = registerBlock("deep_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Pitch Pitter Tile
    public static final RegistryObject<Block> PITCH_PITTER_TILE = registerBlock("pitch_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PITCH_PITTER_TILE_SLAB = registerBlock("pitch_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PITCH_PITTER_TILE_STAIRS = registerBlock("pitch_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.PITCH_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> PITCH_PITTER_TILE_WALL = registerBlock("pitch_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //Pink Pitter Tiles
    public static final RegistryObject<Block> PINK_PITTER_TILE = registerBlock("pink_pitter_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PINK_PITTER_TILE_SLAB = registerBlock("pink_pitter_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> PINK_PITTER_TILE_STAIRS = registerBlock("pink_pitter_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_PITTER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> PINK_PITTER_TILE_WALL = registerBlock("pink_pitter_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //EVE SUMMER TILE
    public static final RegistryObject<Block> EVE_SUMMER_TILE = registerBlock("eve_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_SUMMER_TILE_SLAB = registerBlock("eve_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_SUMMER_TILE_STAIRS = registerBlock("eve_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EVE_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EVE_SUMMER_TILE_WALL = registerBlock("eve_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //EVE SPROUT SUMMER TILE
    public static final RegistryObject<Block> EVE_SPROUT_SUMMER_TILE = registerBlock("eve_sprout_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_SPROUT_SUMMER_TILE_SLAB = registerBlock("eve_sprout_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_SPROUT_SUMMER_TILE_STAIRS = registerBlock("eve_sprout_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EVE_SPROUT_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EVE_SPROUT_SUMMER_TILE_WALL = registerBlock("eve_sprout_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //EVE BLOOM SUMMER TILE
    public static final RegistryObject<Block> EVE_BLOOM_SUMMER_TILE = registerBlock("eve_bloom_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_BLOOM_SUMMER_TILE_SLAB = registerBlock("eve_bloom_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_BLOOM_SUMMER_TILE_STAIRS = registerBlock("eve_bloom_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EVE_BLOOM_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EVE_BLOOM_SUMMER_TILE_WALL = registerBlock("eve_bloom_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //EVE LINED SUMMER TILE
    public static final RegistryObject<Block> EVE_LINED_SUMMER_TILE = registerBlock("eve_lined_summer_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).sound(SoundType.DEEPSLATE_TILES)) {
            });

    //Functions for making this actually work
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
