package com.mrmacky.samplecrafttesting.datagen;

import com.mrmacky.samplecrafttesting.registry.SCTBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class SCTBlockStateProvider extends BlockStateProvider {

    public SCTBlockStateProvider(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(SCTBlocks.EXAMPLE_BLOCK.get(), cubeAll(SCTBlocks.EXAMPLE_BLOCK.get()));
    }

}
