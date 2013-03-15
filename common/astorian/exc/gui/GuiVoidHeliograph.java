package astorian.exc.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.StatCollector;

public class GuiVoidHeliograph extends GuiContainer {
	
	public GuiVoidHeliograph(Container par1Container) {
		super(par1Container);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean doesGuiPauseGame() {
	    return false;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
	         this.fontRenderer.drawString("Void Heliograph", 28, 6, 4210752);
	         this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		
		 GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.mc.renderEngine.func_98187_b("/gui/VoidHelioghraph.png");
         int var5 = (this.width - this.xSize) / 2;
         int var6 = (this.height - this.ySize) / 2;
         this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
		
	}

}
