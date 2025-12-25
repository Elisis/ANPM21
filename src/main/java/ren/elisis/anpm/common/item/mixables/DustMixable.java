package ren.elisis.anpm.common.item.mixables;

import java.util.List;

import com.mojang.datafixers.util.Pair;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import ren.elisis.anpm.ANPM;
import ren.elisis.anpm.common.data.DataTypes;

public class DustMixable extends Item {

	public DustMixable(Properties properties) {
		super(properties.component(DataTypes.COMPOSITION_SUPPLIER.get(), List.of(Pair.of("hi", 2.0f))));
	}
	
	/*
	public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> list, TooltipFlag flag) {
        itemStack.addToTooltip(DataComponents.composition.value(), context, display, list, flag);
    }*/
	
	 @Override
	 public InteractionResult use(Level world, Player player, InteractionHand hand) {
		 final var itemStack = player.getItemInHand(hand);
		 ANPM.LOGGER.warn("In event");
		 ANPM.LOGGER.warn(itemStack.get(DataTypes.COMPOSITION_SUPPLIER.get()).toString());
	        
	     return InteractionResult.SUCCESS;
	
	    }
}
