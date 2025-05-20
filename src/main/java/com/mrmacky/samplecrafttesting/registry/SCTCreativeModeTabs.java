package com.mrmacky.samplecrafttesting.registry;

import com.mrmacky.samplecrafttesting.SampleCraftTesting;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

@EventBusSubscriber(modid = SampleCraftTesting.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class SCTCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SampleCraftTesting.MOD_ID);

    //Creative mode tabs go here
    public static final Supplier<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register(
            "example_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(SCTItems.EXAMPLE_ITEM.get()))
                    .title(Component.translatable("creativetab.samplecrafttesting.example_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(SCTItems.EXAMPLE_ITEM);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> SECOND_TAB = CREATIVE_MODE_TABS.register(
            "second_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(SCTItems.EXAMPLE_ITEM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SampleCraftTesting.MOD_ID, "example_tab"))
                    .title(Component.translatable("creativetab.samplecrafttesting.second_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(SCTItems.EXAMPLE_ITEM);
                    })
                    .build());

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }

    @SubscribeEvent
    private static void addCreative(BuildCreativeModeTabContentsEvent event) {
//        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
//            event.accept(SCTItems.EXAMPLE_ITEM);
//        }
    }

}