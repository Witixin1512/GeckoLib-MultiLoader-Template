package com.example.examplemod.client;

import com.example.examplemod.Constants;
import com.example.examplemod.entity.TestEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class TestEntityModel extends DefaultedEntityGeoModel<TestEntity> {


    public TestEntityModel(ResourceLocation assetSubpath) {
        super(assetSubpath);
    }
}
