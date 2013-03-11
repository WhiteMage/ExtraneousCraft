package exc.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import exc.lib.ItemIDs;
import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class ExtraneousItems {
	
	public static Item saplingAccumulator;
	
	public static void init() {
		
		saplingAccumulator = new ItemSaplingAccumulator(ItemIDs.SaplingAccumulator_Default, 0, EnumToolMaterial.WOOD, ItemSaplingAccumulator.blocksEffectiveAgainst);
		
		//TODO Remove this (Testing till Locale files are up ;D )
		LanguageRegistry.addName(saplingAccumulator, "Sapling Accumulator");
		
	}

}
