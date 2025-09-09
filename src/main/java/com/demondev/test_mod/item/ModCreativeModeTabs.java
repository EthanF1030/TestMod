package com.demondev.test_mod.item;

import com.demondev.test_mod.TestMod;
import com.demondev.test_mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MOD_ID);

public static final Supplier<CreativeModeTab> TESTER_ITEMS_TAB = CREATIVE_MODE_TAB.register("tester_items_tab",
        () -> CreativeModeTab.builder()
                .icon(() -> new ItemStack(ModItems.TESTER.get()))
                .title(Component.translatable("creativetab.test_mod.tester_items"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.TESTER);
                }).build());

public static final Supplier<CreativeModeTab> TESTER_BLOCKS_TAB = CREATIVE_MODE_TAB.register("tester_blocks_tab",
        () -> CreativeModeTab.builder()
                .icon(() -> new ItemStack(ModBlocks.TESTER_BLOCK))
                .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TestMod.MOD_ID, "tester_items_tab"))
                .title(Component.translatable("creativetab.test_mod.tester_blocks"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModBlocks.TESTER_BLOCK);
                    output.accept(ModBlocks.TESTER_ORE);
                }).build());


    public static void register (IEventBus eventBus) {
    CREATIVE_MODE_TAB.register(eventBus);
    }
}
