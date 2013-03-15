package astorian.exc.inventory;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ContainerVoidHeliograph extends Container {
	
	private World worldObj;
	private int posX;
	private int posY;
	private int posZ;

	public InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 3);
	public IInventory craftResult = new InventoryCraftResult();
	
	public ContainerVoidHeliograph(InventoryPlayer inventory, World world, int x, int y, int z)
	{
		 this.worldObj = world;
         this.posX = x;
         this.posY = y;
         this.posZ = z;
		
	         this.addSlotToContainer(new SlotCrafting(inventory.player, this.craftMatrix, this.craftResult, 0, 124, 35));
	         int var6;
	         int var7;
	         for (var6 = 0; var6 < 3; ++var6)
	         {
	                 for (var7 = 0; var7 < 3; ++var7)
	                 {
	                         this.addSlotToContainer(new Slot(this.craftMatrix, var7 + var6 * 3, 30 + var7 * 18, 17 + var6 * 18));
	                 }
	         }
	         for (var6 = 0; var6 < 3; ++var6)
	         {
	                 for (var7 = 0; var7 < 9; ++var7)
	                 {
	                         this.addSlotToContainer(new Slot(inventory, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
	                 }
	         }
	         for (var6 = 0; var6 < 9; ++var6)
	         {
	                 this.addSlotToContainer(new Slot(inventory, var6, 8 + var6 * 18, 142));
	         }
	         this.onCraftMatrixChanged(this.craftMatrix);
	}
	
	public void onCraftMatrixChanged(IInventory inventory)
	{
	         ItemStack stack = CraftingVoidHeliograph.getInstance().findMatchingRecipe(this.craftMatrix, this.worldObj);
	this.craftResult.setInventorySlotContents(0, ItemStack.areItemStacksEqual(stack, new ItemStack( Block.planks, 2, 0)) ? null : stack);
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		// TODO Auto-generated method stub
		return false;
	}
	


}
