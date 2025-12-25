package ren.elisis.anpm.common.data;

import java.util.List;
import java.util.function.Supplier;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;

import io.netty.buffer.ByteBuf;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.codec.StreamCodec;
import net.neoforged.neoforge.registries.DeferredRegister;
import ren.elisis.anpm.ANPM;

public class DataTypes {
	
	public static final DeferredRegister.DataComponents DATA_COMPONENT_REGISTRY = DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE, ANPM.MODID);

	
	public class CompositionRecord {

		public static final Codec<List<Pair<String, Float>>> CODEC = Codec.compoundList(Codec.STRING, Codec.FLOAT);
		public static final StreamCodec<ByteBuf, List<Pair<String, Float>>> UNIT_STREAM_CODEC = StreamCodec.unit(List.of(Pair.of("", 0.0f)));


		
	}
	
	
	public static final Supplier<DataComponentType<List<Pair<String, Float>>>> COMPOSITION_SUPPLIER = DATA_COMPONENT_REGISTRY.registerComponentType("composition", builder -> builder.persistent(CompositionRecord.CODEC).networkSynchronized(CompositionRecord.UNIT_STREAM_CODEC));


}
