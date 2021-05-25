package com.aqupd.caracal;

import net.fabricmc.api.ModInitializer;
import com.aqupd.caracal.entities.CaracalEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	public static final Identifier CARACAL_SCREAM = new Identifier("aqupd:caracal_scream");
	public static SoundEvent CARACAL_AMBIENT = new SoundEvent(CARACAL_SCREAM);

	public static final EntityType<CaracalEntity> CARACAL = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier("aqupd", "caracal"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,
					CaracalEntity::new).dimensions(EntityDimensions.fixed(0.5f, 0.75f)).build()
	);
	@Override
	public void onInitialize() {

		FabricDefaultAttributeRegistry.register(CARACAL, CaracalEntity.createcaracalAttributes());

		//SpawnInit.init();
	}
}
