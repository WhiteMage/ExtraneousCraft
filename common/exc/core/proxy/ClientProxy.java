package exc.core.proxy;

import net.minecraftforge.client.MinecraftForgeClient;
import exc.lib.Reference;

public class ClientProxy extends CommonProxy {
	
	@Override
    public void registerRenderers() {
            MinecraftForgeClient.preloadTexture(Reference.ITEM_TEXTURES);
            MinecraftForgeClient.preloadTexture(Reference.BLOCK_TEXTURES);
    }

}
