package com.astorian.exc.core.config;

import java.io.File;
import java.util.logging.Level;

import com.astorian.exc.lib.BlockIDs;
import com.astorian.exc.lib.ItemIDs;
import com.astorian.exc.lib.Reference;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {
	
	public static Configuration config;
	
	public static void init(File configFile) {
		
		config = new Configuration(configFile);
		
		try {
			/*
			 * Try to Load the Config file
			 */
            config.load();
            
            /* Graphical constants */
            ConfigurationSettings.ENABLE_PARTICLES = config.get(ConfigurationSettings.CATEGORY_GRAPHICS, ConfigurationSettings.ENABLE_PARTICLES_CONFIG, ConfigurationSettings.enableParticles).getBoolean(ConfigurationSettings.enableParticles);
            
            /* WorldGen constants */
            ConfigurationSettings.ENABLE_WORLDGEN = config.get(ConfigurationSettings.CATEGORY_GENERATION, ConfigurationSettings.ENABLE_WORLDGEN_CONFIG, ConfigurationSettings.enableWorldGen).getBoolean(ConfigurationSettings.enableWorldGen);
            
            /* Sound constants */
            ConfigurationSettings.ENABLE_SOUNDS = config.get(ConfigurationSettings.CATEGORY_SOUND, ConfigurationSettings.ENABLE_SOUNDS_CONFIG, ConfigurationSettings.ENABLE_SOUNDS_DEFAULT).getString();
            
            /* Block constants */
            BlockIDs.VoidHeliograph = config.getBlock("voidHeliograph", BlockIDs.VoidHeliograph_Default).getInt(BlockIDs.VoidHeliograph_Default);
            BlockIDs.VoidContainer = config.getBlock("voidContainer", BlockIDs.VoidContainer_Default).getInt(BlockIDs.VoidContainer_Default);
            
            /* Item constants */
            ItemIDs.SaplingAccumulator = config.getItem("herbalAccumulator", ItemIDs.SaplingAccumulator_Default).getInt(ItemIDs.SaplingAccumulator_Default);
            ItemIDs.EterneousIngot = config.getItem("ingotEterneous", ItemIDs.EterneousIngot_Default).getInt(ItemIDs.EterneousIngot_Default);
            ItemIDs.InfusedSeeds = config.getItem("infusedSeeds", ItemIDs.InfusedSeeds_Default).getInt(ItemIDs.InfusedSeeds_Default);
		
		
		} catch(Exception e) {
			/*
			 * If an error has occured display this message with a Severe logging level.
			 */
			FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " " + "has had a problem loading its configuration");
		
		} finally {
			/*
			 * When all is done save the config file
			 */
			config.save();
		}
		
	}
	
	 public static void set(String categoryName, String propertyName, String newValue) {

	        config.load();
	        if (config.getCategoryNames().contains(categoryName)) {
	            if (config.getCategory(categoryName).containsKey(propertyName)) {
	                config.getCategory(categoryName).get(propertyName).set(newValue);
	            }
	        }
	        config.save();
	    }

}
