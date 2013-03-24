package com.astorian.exc.core.proxy;

import net.minecraftforge.client.MinecraftForgeClient;

import com.astorian.exc.block.ExtraneousBlocks;
import com.astorian.exc.lib.ModelIDs;
import com.astorian.exc.lib.Reference;
import com.astorian.exc.model.render.ItemVoidHeliographRenderer;
import com.astorian.exc.model.render.VoidHeliographRenderer;
import com.astorian.exc.tile.TileEntityVoidHeliograph;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		
		ModelIDs.ModelVoidHeliograph = RenderingRegistry.getNextAvailableRenderId();
		
		// Register Void Heliograph related stuff
		MinecraftForgeClient.registerItemRenderer(ExtraneousBlocks.voidHeliograph.blockID, new ItemVoidHeliographRenderer());
	}
	
	 @Override
	 public void initTileEntities() {

	    super.initTileEntities();

	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityVoidHeliograph.class, new VoidHeliographRenderer());
	    
	 }

}
