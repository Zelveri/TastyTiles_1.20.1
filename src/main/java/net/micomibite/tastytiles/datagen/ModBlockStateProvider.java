package net.micomibite.tastytiles.datagen;

import net.micomibite.tastytiles.TastyTiles;
import net.micomibite.tastytiles.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
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
        //blockWithItem(ModBlocks.RED_PITTER_TILE);
        genHorizontalSBI(ModBlocks.RED_PITTER_TILE.get(), buildSimpleBlockWithRenderType("red_pitter_tile", "solid") );
        //slabBlock(((SlabBlock) ModBlocks.RED_PITTER_TILE_SLAB.get()), blockTexture(ModBlocks.RED_PITTER_TILE.get()), blockTexture(ModBlocks.RED_PITTER_TILE.get()));
        genSimpleSlabsSBI(ModBlocks.RED_PITTER_TILE_SLAB.get(), ModBlocks.RED_PITTER_TILE.get());
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
