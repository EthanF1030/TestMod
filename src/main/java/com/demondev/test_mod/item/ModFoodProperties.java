package com.demondev.test_mod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties RADISH = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.35f).build();
    public static final FoodProperties DIAMOND_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 6000, 5), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 3), 1.0f)
            .alwaysEdible().build();
}
