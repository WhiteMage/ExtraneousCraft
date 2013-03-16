package com.astorian.exc.core.config;

public class ConfigurationSettings {
	
	public static boolean enableSounds = true;     //Enabled by default
	public static boolean enableParticles = true;  //Enabled by default
	public static boolean enableWorldGen = true;   //Toggles ancient dungeons n' stuff
	
	public static final String CATEGORY_SOUND = "sounds";
	public static final String CATEGORY_GRAPHICS = "graphics";
	public static final String CATEGORY_GENERATION = "worldGen";
	
	/*
	 * Audio Related
	 */
	public static String ENABLE_SOUNDS;
	public static final String ENABLE_SOUNDS_CONFIG = "sounds.enabled";
	public static final String ENABLE_SOUNDS_DEFAULT = "default(all)";
	
	/*
     * Graphics Related
     */
	public static boolean ENABLE_PARTICLES;
	public static final String ENABLE_PARTICLES_CONFIG = "particles.enabled";
	
	/*
	 * WorldGeneration Related
	 */
	public static boolean ENABLE_WORLDGEN;
	public static final String ENABLE_WORLDGEN_CONFIG = "worldgen.enabled";

}
