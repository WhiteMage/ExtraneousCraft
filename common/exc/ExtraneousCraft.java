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
import exc.item.ExtraneousItems;
import exc.lib.Reference;
import exc.update.FileUpdater;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.CURRENT_VERSION_NUMS_ONLY)
@NetworkMod(clientSideRequired=true, serverSideRequired=false, channels={"ExcRandom"}, packetHandler = PacketHandler.class)
public class ExtraneousCraft {	 

	 // public static FileUpdater updater = new FileUpdater ("http://urltogithubversionfile", "mod");
	
	 @Instance(Reference.MOD_NAME)
     public static ExtraneousCraft instance;
	 
	 @SidedProxy(clientSide=Reference.CLIENT_PROXY, serverSide=Reference.COMMON_PROXY)
     public static CommonProxy proxy;
	 
	 @PreInit
     public void preInit(FMLPreInitializationEvent event) {
            
		 //StartupHelper.checkForUpdates();
		 //TODO StartupMethods
		 //TODO Texture and Render Registrations
		 proxy.registerRenderers();
		 //TODO Localizations
		 
     }
	 
	 @Init
     public void load(FMLInitializationEvent event) {
		 
		 //Registers ore and Items that may also be in other Mods
		 proxy.oreDictionary();
		 
		 // Initialize items
		 ExtraneousItems.init();
             
     }
	 
	 @PostInit
     public void postInit(FMLPostInitializationEvent event) {
             
		 //TODO AddonCheck
		 //TODO Addon Registrations
		 
     }

}
