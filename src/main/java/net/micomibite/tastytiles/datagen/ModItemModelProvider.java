package net.micomibite.tastytiles.datagen;

import net.micomibite.tastytiles.TastyTiles;
import net.micomibite.tastytiles.block.ModBlocks;
import net.micomibite.tastytiles.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TastyTiles.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CERAMIC_MIXTURE);

        evenSimplerBlockItem(ModBlocks.BRICK_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.BRICK_PITTER_TILE_WALL, ModBlocks.BRICK_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.FIRE_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.FIRE_PITTER_TILE_WALL, ModBlocks.FIRE_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.OCHRE_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.OCHRE_PITTER_TILE_WALL, ModBlocks.OCHRE_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.EARTHY_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.EARTHY_PITTER_TILE_WALL, ModBlocks.EARTHY_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.PALE_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.PALE_PITTER_TILE_WALL, ModBlocks.PALE_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.LUSH_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.LUSH_PITTER_TILE_WALL, ModBlocks.LUSH_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.DEEP_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.DEEP_PITTER_TILE_WALL, ModBlocks.DEEP_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.PITCH_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.PITCH_PITTER_TILE_WALL, ModBlocks.PITCH_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.PINK_PITTER_TILE_STAIRS);
        wallItem(ModBlocks.PINK_PITTER_TILE_WALL, ModBlocks.PINK_PITTER_TILE);
        evenSimplerBlockItem(ModBlocks.EVE_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.EVE_SUMMER_TILE_WALL, ModBlocks.EVE_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.EVE_SPROUT_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.EVE_SPROUT_SUMMER_TILE_WALL, ModBlocks.EVE_SPROUT_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.EVE_BLOOM_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.EVE_BLOOM_SUMMER_TILE_WALL, ModBlocks.EVE_BLOOM_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.EVE_FLOWER_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.EVE_FLOWER_SUMMER_TILE_WALL, ModBlocks.EVE_FLOWER_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.EVE_CROSS_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.EVE_CROSS_SUMMER_TILE_WALL, ModBlocks.EVE_CROSS_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.EVE_RIDGE_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.EVE_RIDGE_SUMMER_TILE_WALL, ModBlocks.EVE_RIDGE_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.EVE_LINED_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.EVE_LINED_SUMMER_TILE_WALL, ModBlocks.EVE_LINED_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.DAY_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.DAY_SUMMER_TILE_WALL, ModBlocks.DAY_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.DAY_SPROUT_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.DAY_SPROUT_SUMMER_TILE_WALL, ModBlocks.DAY_SPROUT_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.DAY_BLOOM_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.DAY_BLOOM_SUMMER_TILE_WALL, ModBlocks.DAY_BLOOM_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.DAY_FLOWER_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.DAY_FLOWER_SUMMER_TILE_WALL, ModBlocks.DAY_FLOWER_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.DAY_CROSS_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.DAY_CROSS_SUMMER_TILE_WALL, ModBlocks.DAY_CROSS_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.DAY_RIDGE_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.DAY_RIDGE_SUMMER_TILE_WALL, ModBlocks.DAY_RIDGE_SUMMER_TILE);
        evenSimplerBlockItem(ModBlocks.DAY_LINED_SUMMER_TILE_STAIRS);
        wallItem(ModBlocks.DAY_LINED_SUMMER_TILE_WALL, ModBlocks.DAY_LINED_SUMMER_TILE);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TastyTiles.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(TastyTiles.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(TastyTiles.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
}
