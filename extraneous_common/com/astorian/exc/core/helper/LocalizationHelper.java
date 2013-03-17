package com.astorian.exc.core.helper;

import cpw.mods.fml.common.registry.LanguageRegistry;

/*
 * Localization Helper consists of 3 methods
 * 
 * @author Pahimar
 */

public class LocalizationHelper {
	
	 public static boolean isXMLLanguageFile(String fileName) {

	        return fileName.endsWith(".xml");
	 }
	 
	 public static String getLocaleFromFileName(String fileName) {

	        return fileName.substring(fileName.lastIndexOf('/') + 1, fileName.lastIndexOf('.'));
	 }
	 
	 public static String getLocalizedString(String key) {

	        return LanguageRegistry.instance().getStringLocalization(key);
	 }

}
