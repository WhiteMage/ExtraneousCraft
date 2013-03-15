package astorian.exc.core.helper;

import astorian.exc.inventory.CraftingVoidHeliograph;
import astorian.exc.item.ExtraneousItems;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class RecipeHelper {
	
	public static void initRecipes() {
		CraftingVoidHeliograph.getInstance().addVoidRecipe(new ItemStack(ExtraneousItems.saplingAccumulator, 1, 0), new Object[]{"S S", 'S', Block.dirt});
	}
	
	

}
