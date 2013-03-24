package com.astorian.exc.model.render;

import org.lwjgl.opengl.GL11;

import com.astorian.exc.model.ModelVoidHeliograph;
import com.astorian.exc.tile.TileEntityVoidHeliograph;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class VoidHeliographRenderer extends TileEntitySpecialRenderer {
	
	private ModelVoidHeliograph model;
	
	public VoidHeliographRenderer(){
		model = new ModelVoidHeliograph();
	}
	
	public void renderAModelAt(TileEntityVoidHeliograph tile, double d, double d1, double d2, float f) {

		int rotation = 0;
		if(tile.worldObj != null) {
		    rotation = tile.getBlockMetadata();
		}
		bindTextureByName("/textures/blocks/voidHeliograph.png");
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
		GL11.glScalef(1.0F, -1F, -1F);
		GL11.glRotatef(rotation*90, 0.0F, 1.0F, 0.0F);
		model.renderAll();
		GL11.glPopMatrix();
		}

	@Override
	public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8) {
	    this.renderAModelAt((TileEntityVoidHeliograph)par1TileEntity, par2, par4, par6, par8);
	}

}
