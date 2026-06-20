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

    //EVE FLOWER SUMMER TILE
    public static final RegistryObject<Block> EVE_FLOWER_SUMMER_TILE = registerBlock("eve_flower_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_FLOWER_SUMMER_TILE_SLAB = registerBlock("eve_flower_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_FLOWER_SUMMER_TILE_STAIRS = registerBlock("eve_flower_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EVE_FLOWER_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EVE_FLOWER_SUMMER_TILE_WALL = registerBlock("eve_flower_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //EVE CROSS SUMMER TILE
    public static final RegistryObject<Block> EVE_CROSS_SUMMER_TILE = registerBlock("eve_cross_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_CROSS_SUMMER_TILE_SLAB = registerBlock("eve_cross_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_CROSS_SUMMER_TILE_STAIRS = registerBlock("eve_cross_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EVE_CROSS_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EVE_CROSS_SUMMER_TILE_WALL = registerBlock("eve_cross_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //EVE RIDGE SUMMER TILE
    public static final RegistryObject<Block> EVE_RIDGE_SUMMER_TILE = registerBlock("eve_ridge_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_RIDGE_SUMMER_TILE_SLAB = registerBlock("eve_ridge_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_RIDGE_SUMMER_TILE_STAIRS = registerBlock("eve_ridge_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EVE_RIDGE_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EVE_RIDGE_SUMMER_TILE_WALL = registerBlock("eve_ridge_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //EVE LINED SUMMER TILE
    public static final RegistryObject<Block> EVE_LINED_SUMMER_TILE = registerBlock("eve_lined_summer_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_LINED_SUMMER_TILE_SLAB = registerBlock("eve_lined_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> EVE_LINED_SUMMER_TILE_STAIRS = registerBlock("eve_lined_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.EVE_LINED_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> EVE_LINED_SUMMER_TILE_WALL = registerBlock("eve_lined_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DAY SUMMER TILE
    public static final RegistryObject<Block> DAY_SUMMER_TILE = registerBlock("day_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_SUMMER_TILE_SLAB = registerBlock("day_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_SUMMER_TILE_STAIRS = registerBlock("day_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DAY_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DAY_SUMMER_TILE_WALL = registerBlock("day_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DAY SPROUT SUMMER TILE
    public static final RegistryObject<Block> DAY_SPROUT_SUMMER_TILE = registerBlock("day_sprout_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_SPROUT_SUMMER_TILE_SLAB = registerBlock("day_sprout_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_SPROUT_SUMMER_TILE_STAIRS = registerBlock("day_sprout_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DAY_SPROUT_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DAY_SPROUT_SUMMER_TILE_WALL = registerBlock("day_sprout_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DAY BLOOM SUMMER TILE
    public static final RegistryObject<Block> DAY_BLOOM_SUMMER_TILE = registerBlock("day_bloom_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_BLOOM_SUMMER_TILE_SLAB = registerBlock("day_bloom_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_BLOOM_SUMMER_TILE_STAIRS = registerBlock("day_bloom_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DAY_BLOOM_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DAY_BLOOM_SUMMER_TILE_WALL = registerBlock("day_bloom_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DAY FLOWER SUMMER TILE
    public static final RegistryObject<Block> DAY_FLOWER_SUMMER_TILE = registerBlock("day_flower_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_FLOWER_SUMMER_TILE_SLAB = registerBlock("day_flower_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_FLOWER_SUMMER_TILE_STAIRS = registerBlock("day_flower_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DAY_FLOWER_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DAY_FLOWER_SUMMER_TILE_WALL = registerBlock("day_flower_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DAY CROSS SUMMER TILE
    public static final RegistryObject<Block> DAY_CROSS_SUMMER_TILE = registerBlock("day_cross_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_CROSS_SUMMER_TILE_SLAB = registerBlock("day_cross_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_CROSS_SUMMER_TILE_STAIRS = registerBlock("day_cross_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DAY_CROSS_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DAY_CROSS_SUMMER_TILE_WALL = registerBlock("day_cross_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DAY RIDGE SUMMER TILE
    public static final RegistryObject<Block> DAY_RIDGE_SUMMER_TILE = registerBlock("day_ridge_summer_tile",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_RIDGE_SUMMER_TILE_SLAB = registerBlock("day_ridge_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_RIDGE_SUMMER_TILE_STAIRS = registerBlock("day_ridge_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DAY_RIDGE_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DAY_RIDGE_SUMMER_TILE_WALL = registerBlock("day_ridge_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DAY LINED SUMMER TILE
    public static final RegistryObject<Block> DAY_LINED_SUMMER_TILE = registerBlock("day_lined_summer_tile",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_LINED_SUMMER_TILE_SLAB = registerBlock("day_lined_summer_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DAY_LINED_SUMMER_TILE_STAIRS = registerBlock("day_lined_summer_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DAY_LINED_SUMMER_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DAY_LINED_SUMMER_TILE_WALL = registerBlock("day_lined_summer_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));
    
    //LIGHT PRETTI TILE
    public static final RegistryObject<Block> LIGHT_PRETTI_TILE = registerBlock("light_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_PRETTI_TILE_SLAB = registerBlock("light_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LIGHT_PRETTI_TILE_STAIRS = registerBlock("light_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_PRETTI_TILE_WALL = registerBlock("light_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //LIGHT ROSY PRETTI TILE
    public static final RegistryObject<Block> LIGHT_ROSY_PRETTI_TILE = registerBlock("light_rosy_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_ROSY_PRETTI_TILE_SLAB = registerBlock("light_rosy_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LIGHT_ROSY_PRETTI_TILE_STAIRS = registerBlock("light_rosy_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_ROSY_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_ROSY_PRETTI_TILE_WALL = registerBlock("light_rosy_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //LIGHT POSY PRETTI TILE
    public static final RegistryObject<Block> LIGHT_POSY_PRETTI_TILE = registerBlock("light_posy_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_POSY_PRETTI_TILE_SLAB = registerBlock("light_posy_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LIGHT_POSY_PRETTI_TILE_STAIRS = registerBlock("light_posy_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_POSY_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_POSY_PRETTI_TILE_WALL = registerBlock("light_posy_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //LIGHT RING PRETTI TILE
    public static final RegistryObject<Block> LIGHT_RING_PRETTI_TILE = registerBlock("light_ring_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_RING_PRETTI_TILE_SLAB = registerBlock("light_ring_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LIGHT_RING_PRETTI_TILE_STAIRS = registerBlock("light_ring_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_RING_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_RING_PRETTI_TILE_WALL = registerBlock("light_ring_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //LIGHT SQUARED PRETTI TILE
    public static final RegistryObject<Block> LIGHT_SQUARED_PRETTI_TILE = registerBlock("light_squared_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_SQUARED_PRETTI_TILE_SLAB = registerBlock("light_squared_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LIGHT_SQUARED_PRETTI_TILE_STAIRS = registerBlock("light_squared_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_SQUARED_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_SQUARED_PRETTI_TILE_WALL = registerBlock("light_squared_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //LIGHT FULL PRETTI TILE
    public static final RegistryObject<Block> LIGHT_FULL_PRETTI_TILE = registerBlock("light_full_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_FULL_PRETTI_TILE_SLAB = registerBlock("light_full_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> LIGHT_FULL_PRETTI_TILE_STAIRS = registerBlock("light_full_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_FULL_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> LIGHT_FULL_PRETTI_TILE_WALL = registerBlock("light_full_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DARK PRETTI TILE
    public static final RegistryObject<Block> DARK_PRETTI_TILE = registerBlock("dark_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_PRETTI_TILE_SLAB = registerBlock("dark_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DARK_PRETTI_TILE_STAIRS = registerBlock("dark_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_PRETTI_TILE_WALL = registerBlock("dark_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DARK ROSY PRETTI TILE
    public static final RegistryObject<Block> DARK_ROSY_PRETTI_TILE = registerBlock("dark_rosy_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_ROSY_PRETTI_TILE_SLAB = registerBlock("dark_rosy_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DARK_ROSY_PRETTI_TILE_STAIRS = registerBlock("dark_rosy_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_ROSY_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_ROSY_PRETTI_TILE_WALL = registerBlock("dark_rosy_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DARK POSY PRETTI TILE
    public static final RegistryObject<Block> DARK_POSY_PRETTI_TILE = registerBlock("dark_posy_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_POSY_PRETTI_TILE_SLAB = registerBlock("dark_posy_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DARK_POSY_PRETTI_TILE_STAIRS = registerBlock("dark_posy_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_POSY_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_POSY_PRETTI_TILE_WALL = registerBlock("dark_posy_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DARK RING PRETTI TILE
    public static final RegistryObject<Block> DARK_RING_PRETTI_TILE = registerBlock("dark_ring_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_RING_PRETTI_TILE_SLAB = registerBlock("dark_ring_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DARK_RING_PRETTI_TILE_STAIRS = registerBlock("dark_ring_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_RING_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_RING_PRETTI_TILE_WALL = registerBlock("dark_ring_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DARK SQUARED PRETTI TILE
    public static final RegistryObject<Block> DARK_SQUARED_PRETTI_TILE = registerBlock("dark_squared_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_SQUARED_PRETTI_TILE_SLAB = registerBlock("dark_squared_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DARK_SQUARED_PRETTI_TILE_STAIRS = registerBlock("dark_squared_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_SQUARED_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_SQUARED_PRETTI_TILE_WALL = registerBlock("dark_squared_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //DARK FULL PRETTI TILE
    public static final RegistryObject<Block> DARK_FULL_PRETTI_TILE = registerBlock("dark_full_pretti_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_FULL_PRETTI_TILE_SLAB = registerBlock("dark_full_pretti_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.DEEPSLATE_TILES)) {
            });

    public static final RegistryObject<Block> DARK_FULL_PRETTI_TILE_STAIRS = registerBlock("dark_full_pretti_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_FULL_PRETTI_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> DARK_FULL_PRETTI_TILE_WALL = registerBlock("dark_full_pretti_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.DEEPSLATE_TILES)));

    //CRISP ORANGE TILES
    public static final RegistryObject<Block> CRISP_ORANGE_TILE = registerBlock("crisp_orange_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_ORANGE_TILE_SLAB = registerBlock("crisp_orange_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_ORANGE_TILE_STAIRS = registerBlock("crisp_orange_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_ORANGE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_ORANGE_TILE_WALL = registerBlock("crisp_orange_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

    //CRISP RIPE ORANGE TILES
    public static final RegistryObject<Block> CRISP_RIPE_ORANGE_TILE = registerBlock("crisp_ripe_orange_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_ORANGE_TILE_SLAB = registerBlock("crisp_ripe_orange_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB).sound(SoundType.METAL)) {
            });

    public static final RegistryObject<Block> CRISP_RIPE_ORANGE_TILE_STAIRS = registerBlock("crisp_ripe_orange_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.CRISP_RIPE_ORANGE_TILE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CRISP_RIPE_ORANGE_TILE_WALL = registerBlock("crisp_ripe_orange_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).sound(SoundType.METAL)));

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
