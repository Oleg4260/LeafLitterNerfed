package com.oleg4260.leaftlitternerf;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.item.Items;

public class LeafLitterNerfed implements ModInitializer {

	@Override
	public void onInitialize() {
		FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(Items.LEAF_LITTER, 200 / 8);
        });
	}
}