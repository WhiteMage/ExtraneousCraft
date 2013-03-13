package exc.item;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

public class ItemSaplingAccumulator extends ItemTool {
	
	public static Block[] blocksEffectiveAgainst = {Block.leaves, Block.sapling, Block.grass};
	
	private static BlockLeaves leaves;

	public ItemSaplingAccumulator(int id, int par2, EnumToolMaterial toolMaterial, Block[] blocksEffectiveAgainst) {
		super(id, par2, toolMaterial, blocksEffectiveAgainst);
		this.maxStackSize = 1;
		this.setMaxDamage(24);
		this.damageVsEntity = 0;
		this.setIconCoord(0, 0); //TODO Make a texture for the Item
		this.setItemName("saplingAccumulator");
	}
	
	 public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int blockID, int x, int y, int z, EntityLiving par7EntityLiving) 
	 {
		 if (super.onBlockDestroyed(par1ItemStack, par2World, blockID, x, y, z, par7EntityLiving))
		    {
			    if(!par2World.isRemote) {
			    	
			    	if(blockID == Block.leaves.blockID) {
			    		
			    		par2World.spawnEntityInWorld(new EntityItem(par2World, x + 0.5D, y + 0.5D, z + 0.5D, new ItemStack(Block.sapling)));
			    	}
			    	 
			    }
		    }
		 return true;	 
	 }
	 
	 public static boolean findRespondingSapling() {
		 return true;
	 }

}
