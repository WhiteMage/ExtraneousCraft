package com.astorian.exc.model.render;

import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import com.astorian.exc.model.ModelVoidHeliograph;
import com.astorian.exc.tile.TileEntityVoidHeliograph;

public class ItemVoidHeliographRenderer implements IItemRenderer {

    private ModelVoidHeliograph model;

    public ItemVoidHeliographRenderer() {
        model = new ModelVoidHeliograph();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
            ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        TileEntityRenderer.instance.renderTileEntityAt(
                new TileEntityVoidHeliograph(), 0.0D, 0.0D, 0.0D, 0.0F);
    }

}
