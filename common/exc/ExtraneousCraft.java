package exc;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import exc.core.handler.PacketHandler;
import exc.core.proxy.CommonProxy;
import exc.lib.Reference;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false, channels={"ExcRandom"}, packetHandler = PacketHandler.class)
public class ExtraneousCraft {	 

	 private static FileUpdater updater = new FileUpdater ("http://urltogithubversionfile", "mod");
	
	 @Instance(Reference.MOD_NAME)
     public static ExtraneousCraft instance;
	 
	 @SidedProxy(clientSide=Reference.CLIENT_PROXY, serverSide=Reference.COMMON_PROXY)
     public static CommonProxy proxy;
	 
	 @PreInit
     public void preInit(FMLPreInitializationEvent event) {
            
		 checkForUpdates();
		 //TODO StartupMethods
		 //TODO Texture and Render Registrations
		 proxy.registerRenderers();
		 //TODO Localizations
		 
     }
	 
	 /**
	  * Note: MinetunesConfig is where my mod saves bits of data. It uses a java.util.Properties to contain the data: setString() sets a value, getString() gets a value, and flush() saves. Since your mod does not yet have a config, it is your choice whether to a) add one and use it in here or b) remove all references, and cause a update message to appear every single time a player logs on (annoying).
	  */
	 private void checkForUpdates() {
	  	Thread t = new Thread(new Runnable() {
			public void run() {
				// Handle new version found alert
				String foundVersion = updater
						.getLatestVersion(Reference.MINECRAFT_VERSION);
				// If new version found is greater than the current AND is
				// greater
				// than the last time we checked
				if (foundVersion != null
						&& CompareVersion
								.isVersionNewerThanCurrent(foundVersion)
						&& !MinetunesConfig.getString(
								"updates.lastVersionFound")
								.equals(foundVersion)) {
					// Show a message
					Minecraft.getMinecraft().thePlayer.addChatMessage("§aA new version of ExtraneousCraft (§b"
							+ foundVersion
							+ "§a) is available.");

					MinetunesConfig.setString("updates.lastVersionFound",
							foundVersion);
					try {
						MinetunesConfig.flush();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t.setName("ExtraneousCraft Update Checker");
		t.start();
	 }
	 
	 @Init
     public void load(FMLInitializationEvent event) {
		 
		 //Registers ore and Items that may also be in other Mods
		 proxy.oreDictionary();
             
     }
	 
	 @PostInit
     public void postInit(FMLPostInitializationEvent event) {
             
		 //TODO AddonCheck
		 //TODO Addon Registrations
		 
     }

}
