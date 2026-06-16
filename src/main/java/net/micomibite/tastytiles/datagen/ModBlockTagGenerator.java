package net.micomibite.tastytiles.datagen;

import net.micomibite.tastytiles.TastyTiles;
import net.micomibite.tastytiles.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TastyTiles.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        ModBlocks.BRICK_PITTER_TILE.get(),
                        ModBlocks.BRICK_PITTER_TILE_SLAB.get(),
                        ModBlocks.BRICK_PITTER_TILE_STAIRS.get()
                );
    }
}
