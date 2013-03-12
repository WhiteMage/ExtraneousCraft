package exc.update.common.checking;

import exc.update.common.UpdateManagerMod;

/**
 * Checks if the UM version is equal to the web version.
 * 
 * @author Vazkii, TheWhiteWolves
 */
public class CMEquals extends CheckingMethod {

	@Override
	public boolean isUpdated(UpdateManagerMod mod, String webVersion) {
		return mod.getUMVersion().equals(webVersion);
	}

}
