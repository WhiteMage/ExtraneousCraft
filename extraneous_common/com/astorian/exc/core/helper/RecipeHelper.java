package com.astorian.exc.core.helper;

import com.astorian.exc.inventory.CraftingVoidHeliograph;
import com.astorian.exc.item.ExtraneousItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeHelper {
	
	public static void initRecipes() {
		
		// Crafting
		GameRegistry.addRecipe(new ItemStack(ExtraneousItems.herbalAccumulator), "xyx", " z ", " w ", 'x', Block.glass, 'y', Item.ingotIron, 'z', Item.hoeStone, 'w', Item.stick);
		
	}
	
	

}
