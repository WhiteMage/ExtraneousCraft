package astorian.exc.core.helper;

import astorian.exc.lib.Reference;

public class StartupHelper { 
	
	public static void initAddonCheck() {
		CheckHelper.checkIC2();
		CheckHelper.checkBC();
	}

}
