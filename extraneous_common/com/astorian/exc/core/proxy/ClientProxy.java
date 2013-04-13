package com.astorian.exc.core.proxy;

import net.minecraftforge.client.MinecraftForgeClient;

import com.astorian.exc.block.ExtraneousBlocks;
import com.astorian.exc.model.render.ItemVoidHeliographRenderer;
import com.astorian.exc.model.render.TileEntityVoidHeliographRenderer;
import com.astorian.exc.tile.TileEntityVoidHeliograph;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers() {

        ClientRegistry.bindTileEntitySpecialRenderer(
                TileEntityVoidHeliograph.class,
                new TileEntityVoidHeliographRenderer());
        MinecraftForgeClient.registerItemRenderer(
                ExtraneousBlocks.voidHeliograph.blockID,
                new ItemVoidHeliographRenderer());

    }

    @Override
    public void registerTileEntites() {
        GameRegistry.registerTileEntity(TileEntityVoidHeliograph.class,
                "tileEntityVoidHeliograph");
    }

}
