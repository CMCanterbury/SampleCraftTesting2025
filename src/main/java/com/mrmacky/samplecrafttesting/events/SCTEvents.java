package com.mrmacky.samplecrafttesting.events;


import com.mrmacky.samplecrafttesting.SampleCraftTesting;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;

@EventBusSubscriber(modid = SampleCraftTesting.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class SCTEvents {

    @SubscribeEvent
    public static void doAThing(LivingDamageEvent.Pre event) {

    }

}