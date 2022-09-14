package com.example.examplemod.client;

import com.example.examplemod.ExampleMod;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public class ExampleModQuiltClient implements ClientModInitializer {
    @Override
    public void onInitializeClient(ModContainer container) {
        EntityRendererRegistry.register(ExampleMod.TEST_ENTITY, TestEntityRenderer::new);
    }
}
