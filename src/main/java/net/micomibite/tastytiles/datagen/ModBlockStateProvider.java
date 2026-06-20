package net.micomibite.tastytiles.datagen;

import net.micomibite.tastytiles.TastyTiles;
import net.micomibite.tastytiles.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TastyTiles.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //blockWithItem(ModBlocks.BRICK_PITTER_TILE);
        //slabBlock(((SlabBlock) ModBlocks.BRICK_PITTER_TILE_SLAB.get()), blockTexture(ModBlocks.BRICK_PITTER_TILE.get()), blockTexture(ModBlocks.BRICK_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.BRICK_PITTER_TILE.get(), buildSimpleBlockWithRenderType("brick_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.BRICK_PITTER_TILE_SLAB.get(), ModBlocks.BRICK_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.BRICK_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.BRICK_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.BRICK_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.BRICK_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.FIRE_PITTER_TILE.get(), buildSimpleBlockWithRenderType("fire_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.FIRE_PITTER_TILE_SLAB.get(), ModBlocks.FIRE_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.FIRE_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.FIRE_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.FIRE_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.FIRE_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.OCHRE_PITTER_TILE.get(), buildSimpleBlockWithRenderType("ochre_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.OCHRE_PITTER_TILE_SLAB.get(), ModBlocks.OCHRE_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.OCHRE_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.OCHRE_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.OCHRE_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.OCHRE_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.EARTHY_PITTER_TILE.get(), buildSimpleBlockWithRenderType("earthy_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.EARTHY_PITTER_TILE_SLAB.get(), ModBlocks.EARTHY_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.EARTHY_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.EARTHY_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EARTHY_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.EARTHY_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.PALE_PITTER_TILE.get(), buildSimpleBlockWithRenderType("pale_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.PALE_PITTER_TILE_SLAB.get(), ModBlocks.PALE_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.PALE_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.PALE_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.PALE_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.PALE_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.LUSH_PITTER_TILE.get(), buildSimpleBlockWithRenderType("lush_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.LUSH_PITTER_TILE_SLAB.get(), ModBlocks.LUSH_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.LUSH_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.LUSH_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LUSH_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.LUSH_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.DEEP_PITTER_TILE.get(), buildSimpleBlockWithRenderType("deep_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.DEEP_PITTER_TILE_SLAB.get(), ModBlocks.DEEP_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.DEEP_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.DEEP_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DEEP_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.DEEP_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.PITCH_PITTER_TILE.get(), buildSimpleBlockWithRenderType("pitch_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.PITCH_PITTER_TILE_SLAB.get(), ModBlocks.PITCH_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.PITCH_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.PITCH_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.PITCH_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.PITCH_PITTER_TILE.get()));
        genHorizontalSBI(ModBlocks.PINK_PITTER_TILE.get(), buildSimpleBlockWithRenderType("pink_pitter_tile", "solid") );
        genSimpleSlabsSBI(ModBlocks.PINK_PITTER_TILE_SLAB.get(), ModBlocks.PINK_PITTER_TILE.get());
        stairsBlock(((StairBlock) ModBlocks.PINK_PITTER_TILE_STAIRS.get()), blockTexture(ModBlocks.PINK_PITTER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.PINK_PITTER_TILE_WALL.get()), blockTexture(ModBlocks.PINK_PITTER_TILE.get()));

        genHorizontalSBI(ModBlocks.EVE_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("eve_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.EVE_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.EVE_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EVE_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.EVE_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.EVE_SPROUT_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("eve_sprout_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.EVE_SPROUT_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.EVE_SPROUT_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EVE_SPROUT_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.EVE_SPROUT_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.EVE_BLOOM_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("eve_bloom_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.EVE_BLOOM_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.EVE_BLOOM_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EVE_BLOOM_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.EVE_BLOOM_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.EVE_FLOWER_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("eve_flower_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.EVE_FLOWER_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.EVE_FLOWER_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EVE_FLOWER_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.EVE_FLOWER_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.EVE_CROSS_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("eve_cross_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.EVE_CROSS_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.EVE_CROSS_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EVE_CROSS_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.EVE_CROSS_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.EVE_RIDGE_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("eve_ridge_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.EVE_RIDGE_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.EVE_RIDGE_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EVE_RIDGE_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.EVE_RIDGE_SUMMER_TILE.get()));

        genPillarRotationSBI((RotatedPillarBlock) ModBlocks.EVE_LINED_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("eve_lined_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.EVE_LINED_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.EVE_LINED_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.EVE_LINED_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.EVE_LINED_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.DAY_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("day_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.DAY_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.DAY_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DAY_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.DAY_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.DAY_SPROUT_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("day_sprout_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.DAY_SPROUT_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.DAY_SPROUT_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DAY_SPROUT_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.DAY_SPROUT_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.DAY_BLOOM_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("day_bloom_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.DAY_BLOOM_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.DAY_BLOOM_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DAY_BLOOM_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.DAY_BLOOM_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.DAY_FLOWER_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("day_flower_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.DAY_FLOWER_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.DAY_FLOWER_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DAY_FLOWER_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.DAY_FLOWER_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.DAY_CROSS_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("day_cross_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.DAY_CROSS_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.DAY_CROSS_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DAY_CROSS_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.DAY_CROSS_SUMMER_TILE.get()));

        genHorizontalSBI(ModBlocks.DAY_RIDGE_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("day_ridge_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.DAY_RIDGE_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.DAY_RIDGE_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DAY_RIDGE_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.DAY_RIDGE_SUMMER_TILE.get()));

        genPillarRotationSBI((RotatedPillarBlock) ModBlocks.DAY_LINED_SUMMER_TILE.get(), buildSimpleBlockWithRenderType("day_lined_summer_tile", "solid") );
        stairsBlock(((StairBlock) ModBlocks.DAY_LINED_SUMMER_TILE_STAIRS.get()), blockTexture(ModBlocks.DAY_LINED_SUMMER_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DAY_LINED_SUMMER_TILE_WALL.get()), blockTexture(ModBlocks.DAY_LINED_SUMMER_TILE.get()));

        blockWithItem(ModBlocks.LIGHT_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.LIGHT_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.LIGHT_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.LIGHT_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.LIGHT_ROSY_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.LIGHT_ROSY_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.LIGHT_ROSY_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_ROSY_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.LIGHT_ROSY_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.LIGHT_POSY_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.LIGHT_POSY_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.LIGHT_POSY_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_POSY_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.LIGHT_POSY_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.LIGHT_RING_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.LIGHT_RING_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.LIGHT_RING_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_RING_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.LIGHT_RING_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.LIGHT_SQUARED_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.LIGHT_SQUARED_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.LIGHT_SQUARED_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_SQUARED_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.LIGHT_SQUARED_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.LIGHT_FULL_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.LIGHT_FULL_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.LIGHT_FULL_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_FULL_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.LIGHT_FULL_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.DARK_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.DARK_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.DARK_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DARK_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.DARK_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.DARK_ROSY_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.DARK_ROSY_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.DARK_ROSY_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DARK_ROSY_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.DARK_ROSY_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.DARK_POSY_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.DARK_POSY_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.DARK_POSY_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DARK_POSY_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.DARK_POSY_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.DARK_RING_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.DARK_RING_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.DARK_RING_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DARK_RING_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.DARK_RING_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.DARK_SQUARED_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.DARK_SQUARED_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.DARK_SQUARED_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DARK_SQUARED_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.DARK_SQUARED_PRETTI_TILE.get()));

        blockWithItem(ModBlocks.DARK_FULL_PRETTI_TILE);
        stairsBlock(((StairBlock) ModBlocks.DARK_FULL_PRETTI_TILE_STAIRS.get()), blockTexture(ModBlocks.DARK_FULL_PRETTI_TILE.get()));
        wallBlock(((WallBlock) ModBlocks.DARK_FULL_PRETTI_TILE_WALL.get()), blockTexture(ModBlocks.DARK_FULL_PRETTI_TILE.get()));

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private ModelFile buildSimpleBlockWithRenderType(String blockName, String renderType) {
        //Builds a textured model that uses six texture .pngs for all 6 faces.

        return models().cubeAll(
                blockName,
                modLoc( "block/" + blockName)
        ).texture("particle", modLoc("block/" + blockName)).renderType(renderType);
    }

    private void genSimpleBlockWithRenderTypeSBI(Block block, String renderType) {
        String stringName = BuiltInRegistries.BLOCK.getKey(block).getPath();
        simpleBlock(block, buildSimpleBlockWithRenderType(stringName, renderType));

        String existingModelPath = "block/"+stringName;
        simpleBlockItem(block, models().getExistingFile(modLoc(existingModelPath)));
    }

    private void genHorizontalSBI(Block block, ModelFile model) {
        horizontalBlock(block, model);

        String stringName = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String existingModelPath = "block/"+stringName;
        simpleBlockItem(block, models().getExistingFile(modLoc(existingModelPath)));
    }

    private void genPillarRotationSBI(RotatedPillarBlock block, ModelFile model) {
        axisBlock(block, model, model);

        String stringName = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String existingModelPath = "block/"+stringName;
        simpleBlockItem(block, models().getExistingFile(modLoc(existingModelPath)));
    }


    private void genSimpleSlabsSBI(Block block, Block parentBlock) {
        //For slabs which have a homogenous texture and solid model
        String stringName = BuiltInRegistries.BLOCK.getKey(block).getPath();

        slabBlock(((SlabBlock) block), blockTexture(parentBlock), blockTexture(parentBlock));

        String existingModelPath = "block/"+stringName;
        simpleBlockItem(block, models().getExistingFile(modLoc(existingModelPath)));
    }
}
