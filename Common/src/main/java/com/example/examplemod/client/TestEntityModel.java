package com.example.examplemod.client;

import com.example.examplemod.Constants;
import com.example.examplemod.TestEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TestEntityModel extends AnimatedGeoModel<TestEntity> {
    @Override
    public ResourceLocation getModelResource(TestEntity object) {
        return Constants.rl("geo/test_entity.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TestEntity object) {
        return Constants.rl("textures/test_entity.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TestEntity animatable) {
        return Constants.rl("animations/test_entity.animation.json");
    }

}
