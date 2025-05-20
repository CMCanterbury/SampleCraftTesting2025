package com.mrmacky.samplecrafttesting.registry;

import com.mrmacky.samplecrafttesting.SampleCraftTesting;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SCTItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SampleCraftTesting.MOD_ID);

    //Items go here
    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}