package com.example.examplemod.client;

import com.example.examplemod.TestEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TestEntityRenderer extends GeoEntityRenderer<TestEntity> {

    public TestEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new TestEntityModel());
    }

}
