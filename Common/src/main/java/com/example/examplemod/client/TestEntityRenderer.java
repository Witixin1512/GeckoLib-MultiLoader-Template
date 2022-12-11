package com.example.examplemod.client;

import com.example.examplemod.Constants;
import com.example.examplemod.entity.TestEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class TestEntityRenderer extends GeoEntityRenderer<TestEntity> {

    private static final ResourceLocation TEXTURE_LOCATION = Constants.rl("textures/test_entity.png");

    public TestEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new TestEntityModel(Constants.rl("test_entity")));
    }

    @Override
    public ResourceLocation getTextureLocation(TestEntity testEntity) {
        return TEXTURE_LOCATION;
    }


}
