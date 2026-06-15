package net.micomibite.tastytiles.item;

import net.micomibite.tastytiles.TastyTiles;
import net.micomibite.tastytiles.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TastyTiles.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TASTY_TILES_TAB = CREATIVE_MODE_TABS.register("tasty_tiles_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CERAMIC_MIXTURE.get()))
                    .title(Component.translatable("creativetab.tasty_tiles_tab"))
            .displayItems((pParameters,pOutput) -> {
            pOutput.accept(ModItems.CERAMIC_MIXTURE.get());

            pOutput.accept(ModBlocks.RED_PITTER_TILE.get());

            pOutput.accept(ModBlocks.RED_PITTER_TILE_SLAB.get());
        })
        .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
