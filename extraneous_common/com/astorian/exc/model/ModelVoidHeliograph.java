package com.astorian.exc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

import com.astorian.exc.lib.TextureLib;
import com.astorian.exc.tile.TileEntityVoidHeliograph;

import cpw.mods.fml.client.FMLClientHandler;

public class ModelVoidHeliograph extends ModelBase {
    // fields
    ModelRenderer Base;
    ModelRenderer Column;
    ModelRenderer RExtension;
    ModelRenderer LExtension;
    ModelRenderer BaseTop;
    ModelRenderer ExtensionBase;

    public ModelVoidHeliograph() {
        textureWidth = 64;
        textureHeight = 64;

        Base = new ModelRenderer(this, 0, 0);
        Base.addBox(0F, 0F, 0F, 14, 3, 14);
        Base.setRotationPoint(-7F, 21F, -7F);
        Base.setTextureSize(64, 64);
        Base.mirror = true;
        setRotation(Base, 0F, 0F, 0F);
        Column = new ModelRenderer(this, 0, 37);
        Column.addBox(0F, 0F, 0F, 6, 11, 6);
        Column.setRotationPoint(-3F, 10F, -3F);
        Column.setTextureSize(64, 64);
        Column.mirror = true;
        setRotation(Column, 0F, 0F, 0F);
        RExtension = new ModelRenderer(this, 40, 17);
        RExtension.addBox(0F, 0F, 0F, 1, 7, 2);
        RExtension.setRotationPoint(3F, 9F, -1F);
        RExtension.setTextureSize(64, 64);
        RExtension.mirror = true;
        setRotation(RExtension, 0F, 0F, 0F);
        LExtension = new ModelRenderer(this, 40, 17);
        LExtension.addBox(0F, 0F, 0F, 1, 6, 2);
        LExtension.setRotationPoint(-4F, 9F, -1F);
        LExtension.setTextureSize(64, 64);
        LExtension.mirror = true;
        setRotation(LExtension, 0F, 0F, 0F);
        BaseTop = new ModelRenderer(this, 0, 17);
        BaseTop.addBox(0F, 0F, 0F, 10, 1, 10);
        BaseTop.setRotationPoint(-5F, 20F, -5F);
        BaseTop.setTextureSize(64, 64);
        BaseTop.mirror = true;
        setRotation(BaseTop, 0F, 0F, 0F);
        ExtensionBase = new ModelRenderer(this, 0, 28);
        ExtensionBase.addBox(0F, 0F, 0F, 8, 1, 8);
        ExtensionBase.setRotationPoint(-4F, 15F, -4F);
        ExtensionBase.setTextureSize(64, 64);
        ExtensionBase.mirror = true;
        setRotation(ExtensionBase, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3,
            float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Base.render(f5);
        Column.render(f5);
        RExtension.render(f5);
        LExtension.render(f5);
        BaseTop.render(f5);
        ExtensionBase.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void render(Entity entity, TileEntityVoidHeliograph heliograph,
            double x, double y, double z) {

        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glTranslatef((float) x + 0.5F, (float) y + 0.0F, (float) z + 1.2F);
        GL11.glRotatef(0F, 0F, 0F, 0F);
        GL11.glRotatef(0F, 0F, 0F, 0F);
        FMLClientHandler.instance().getClient().renderEngine
                .bindTexture(TextureLib.VOID_HELIOGRAPH_TEXTURE);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3,
            float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

    public void renderAll(float f1) {
        Base.render(f1);
        Column.render(f1);
        RExtension.render(f1);
        LExtension.render(f1);
        BaseTop.render(f1);
        ExtensionBase.render(f1);
    }

}
