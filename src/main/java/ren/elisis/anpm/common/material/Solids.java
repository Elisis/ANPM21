package ren.elisis.anpm.common.material;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import ren.elisis.anpm.ANPM;
import ren.elisis.anpm.common.ANPMRegistries;

public class Solids {
	
	public static final DeferredRegister<Solid> SOLIDS = DeferredRegister.create(ANPMRegistries.SOLID_REGISTRY, ANPM.MODID);
	
	public static final DeferredHolder<Solid, Solid> TEST_SOLID = SOLIDS.register("test_solid", () -> new Solid());


}
