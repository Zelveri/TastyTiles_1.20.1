package net.micomibite.tastytiles.datagen;

import net.micomibite.tastytiles.TastyTiles;
import net.micomibite.tastytiles.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
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

    private void genSimpleSlabsSBI(Block block, Block parentBlock) {
        //For Rockrete slabs which have a homogenous texture and solid model
        String stringName = BuiltInRegistries.BLOCK.getKey(block).getPath();

        slabBlock(((SlabBlock) block), blockTexture(parentBlock), blockTexture(parentBlock));

        String existingModelPath = "block/"+stringName;
        simpleBlockItem(block, models().getExistingFile(modLoc(existingModelPath)));
    }
}
