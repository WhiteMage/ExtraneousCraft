package astorian.exc.core.proxy;

import jadarstudios.api.DeveloperCapesAPI.DeveloperCapesAPI;
import net.minecraftforge.client.MinecraftForgeClient;
import astorian.exc.lib.Reference;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void initCapes() {
		DeveloperCapesAPI.init("https://raw.github.com/Astorian/ExtraneousCraft/master/resources/capes.txt");
	}

}
