package com.astorian.exc.model.render;

import org.lwjgl.opengl.GL11;

import com.astorian.exc.lib.TextureLib;
import com.astorian.exc.model.ModelVoidHeliograph;
import com.astorian.exc.tile.TileEntityVoidHeliograph;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class TileEntityVoidHeliographRenderer extends TileEntitySpecialRenderer {
	
	private ModelVoidHeliograph model;
	
	public TileEntityVoidHeliographRenderer() {
		model = new ModelVoidHeliograph();
	}
	
	public void renderAModelAt(TileEntityVoidHeliograph tile, double d, double d1, double d2, float f) {

		bindTextureByName(TextureLib.VOID_HELIOGRAPH_TEXTURE); //texture
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
		GL11.glScalef(1.0F, -1F, -1F);
		model.renderAll(0.0625f);
		GL11.glPopMatrix(); //end
		}

	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y,
			double z, float tick) {
		this.renderAModelAt((TileEntityVoidHeliograph)tileentity, x, y, z, tick);	
	}

}
