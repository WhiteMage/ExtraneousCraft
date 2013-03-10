package exc.core.helper;

import exc.lib.Reference;

public class StartupHelper { 
	
	public static void initAddonCheck() {
		CheckHelper.checkIC2();
		CheckHelper.checkBC();
	}
	
	 /**
	  * Note: MinetunesConfig is where my mod saves bits of data. It uses a java.util.Properties to contain the data: setString() sets a value, getString() gets a value, and flush() saves. Since your mod does not yet have a config, it is your choice whether to a) add one and use it in here or b) remove all references, and cause a update message to appear every single time a player logs on (annoying).
	  */
	/*
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
	 */

}
