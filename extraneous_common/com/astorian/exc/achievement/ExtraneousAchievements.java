package com.astorian.exc.achievement;

import net.minecraft.stats.Achievement;

import com.astorian.exc.item.ExtraneousItems;

public class ExtraneousAchievements {

    static Achievement timeAccumulate;

    public static void init() {

        initializeAchievements();
        registerAchievements();
        registerConditions();

    }

    public static void initializeAchievements() {

        timeAccumulate = new Achievement(2001, "timeAccumulate", 1, -4,
                ExtraneousItems.herbalAccumulator, null);

    }

    public static void registerAchievements() {

        timeAccumulate.registerAchievement();

    }

    public static void registerConditions() {

    }

}
