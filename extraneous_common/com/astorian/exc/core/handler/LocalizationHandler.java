package com.astorian.exc.core.handler;

import com.astorian.exc.core.helper.LocalizationHelper;
import com.astorian.exc.lib.LocalizationLib;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {
	
	public static void loadLanguages() {

        // For every file specified in the Localization library class, load them into the Language Registry
        for (String localizationFile : LocalizationLib.localeFiles) {
            LanguageRegistry.instance().loadLocalization(localizationFile, LocalizationHelper.getLocaleFromFileName(localizationFile), LocalizationHelper.isXMLLanguageFile(localizationFile));
        }
    }

}
