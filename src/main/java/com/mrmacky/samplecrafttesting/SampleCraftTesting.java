package com.mrmacky.samplecrafttesting;

import com.mrmacky.samplecrafttesting.registry.SCTBlocks;
import com.mrmacky.samplecrafttesting.registry.SCTCreativeModeTabs;
import com.mrmacky.samplecrafttesting.registry.SCTItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(SampleCraftTesting.MOD_ID)
public class SampleCraftTesting {
    public static final String MOD_ID = "samplecrafttesting";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SampleCraftTesting(IEventBus modEventBus, ModContainer modContainer) {
        SCTBlocks.register(modEventBus);
        SCTItems.register(modEventBus);
        SCTCreativeModeTabs.register(modEventBus);
    }

}