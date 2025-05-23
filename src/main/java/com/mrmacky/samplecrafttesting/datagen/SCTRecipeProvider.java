package com.mrmacky.samplecrafttesting.datagen;

import com.mrmacky.samplecrafttesting.registry.SCTBlocks;
import com.mrmacky.samplecrafttesting.registry.SCTItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class SCTRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public SCTRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SCTBlocks.EXAMPLE_BLOCK.get())
                .pattern("EDE")
                .pattern("DED")
                .pattern("EDE")
                .define('E', SCTItems.EXAMPLE_ITEM.get())
                .define('D', Items.DIAMOND)
                .unlockedBy("has_example_item", has(SCTItems.EXAMPLE_ITEM))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SCTItems.EXAMPLE_ITEM.get(), 5)
                .requires(SCTBlocks.EXAMPLE_BLOCK)
                .unlockedBy("has_example_block", has(SCTBlocks.EXAMPLE_BLOCK))
                .save(recipeOutput, "samplecrafttesting:funky_recipe_name");

    }
}
