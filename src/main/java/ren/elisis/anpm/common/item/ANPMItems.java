package ren.elisis.anpm.common.item;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import ren.elisis.anpm.ANPM;
import ren.elisis.anpm.common.item.mixables.DustMixable;

public class ANPMItems {
	
	public static final DeferredRegister.Items SPECIFIC_ITEMS = DeferredRegister.createItems(ANPM.MODID);
	
	
	public static final DeferredItem<Item> DUST = SPECIFIC_ITEMS.registerItem("dust", DustMixable::new);; // Mixable dust
	

	

}
