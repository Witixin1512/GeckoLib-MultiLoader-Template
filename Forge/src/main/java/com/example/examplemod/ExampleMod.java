package com.example.examplemod;

import com.example.examplemod.client.TestEntityRenderer;
import com.example.examplemod.entity.TestEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(Constants.MOD_ID)
public class ExampleMod {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Constants.MOD_ID);
    public static final RegistryObject<EntityType<TestEntity>> TEST_ENTITY = ENTITY_TYPE_DEFERRED_REGISTER.register("test_entity",
            () -> EntityType.Builder.<TestEntity>of(TestEntity::new, MobCategory.CREATURE).sized(1.0f, 1.0f).build("test_entity"));


    public void createTestEntityAttributes(final EntityAttributeCreationEvent event){
        event.put(TEST_ENTITY.get(), TestEntity.makeMobAttributes().build());
    }

    public void setupCommon(final FMLCommonSetupEvent event){
        //ENTITY_TYPE_DEFERRED_REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public ExampleMod() {

        // Use Forge to bootstrap the Common mod.
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();
    
        // Some code like events require special initialization from the
        // loader specific code.
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ENTITY_TYPE_DEFERRED_REGISTER.register(bus);
        bus.addListener(this::setupCommon);
        bus.addListener(this::createTestEntityAttributes);
    }

    @Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    private static class ClientModListener {

        @SubscribeEvent
        public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event){
            event.registerEntityRenderer(TEST_ENTITY.get(), TestEntityRenderer::new);
        }
    }

}