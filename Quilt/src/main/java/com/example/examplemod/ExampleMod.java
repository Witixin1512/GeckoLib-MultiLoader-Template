package com.example.examplemod;

import com.example.examplemod.entity.TestEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.entity.api.QuiltEntityTypeBuilder;

public class ExampleMod implements ModInitializer {


    public static EntityType<TestEntity> TEST_ENTITY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Constants.rl("test_entity"), QuiltEntityTypeBuilder.create(MobCategory.CREATURE, TestEntity::new).setDimensions(EntityDimensions.scalable(1.0f, 1.0f)).build());

    @Override
    public void onInitialize(ModContainer container) {
        
        // This method is invoked by the Quilt mod loader when it is ready
        // to load your mod. You can access Quilt and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        Constants.LOG.info("Hello Quilt world!");
        CommonClass.init();

        FabricDefaultAttributeRegistry.register(TEST_ENTITY, TestEntity.makeMobAttributes());
    }
}
