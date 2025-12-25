package ren.elisis.anpm.common;

import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.neoforged.neoforge.registries.NewRegistryEvent;
import net.neoforged.neoforge.registries.RegistryBuilder;
import ren.elisis.anpm.ANPM;
import ren.elisis.anpm.common.material.Solid;

public class ANPMRegistries {
	
	// Solids registry
	public static final ResourceKey<Registry<Solid>> SOLID_REGISTRY_KEY = ResourceKey.createRegistryKey(Identifier.fromNamespaceAndPath(ANPM.MODID, "solids"));
		
	public static final Registry<Solid> SOLID_REGISTRY = new RegistryBuilder<>(SOLID_REGISTRY_KEY)	
		.defaultKey(Identifier.fromNamespaceAndPath(ANPM.MODID, "empty")).maxId(1024).create();
	
	
	public static void registerRegistries(NewRegistryEvent event) {

    	event.register(ANPMRegistries.SOLID_REGISTRY);
    }
	
	

	

}
