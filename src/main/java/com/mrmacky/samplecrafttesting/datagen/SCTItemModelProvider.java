package com.mrmacky.samplecrafttesting.datagen;

import com.mrmacky.samplecrafttesting.registry.SCTItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class SCTItemModelProvider extends ItemModelProvider {

    public SCTItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(SCTItems.EXAMPLE_ITEM.get());
    }
}
