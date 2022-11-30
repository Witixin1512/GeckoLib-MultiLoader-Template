package com.example.examplemod;

import com.example.examplemod.entity.TestEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import software.bernie.example.registry.EntityRegistryBuilder;

public class ExampleMod implements ModInitializer {

    public static EntityType<TestEntity> TEST_ENTITY = EntityRegistryBuilder.<TestEntity>createBuilder(new ResourceLocation(Constants.MOD_ID, "test_entity")).entity(TestEntity::new)
            .category(MobCategory.CREATURE).dimensions(EntityDimensions.scalable(1.0f, 1.0f)).build();
    
    @Override
    public void onInitialize() {
        
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();

        FabricDefaultAttributeRegistry.register(TEST_ENTITY, TestEntity.makeMobAttributes());
    }
}
