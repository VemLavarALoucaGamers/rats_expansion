package net.mcreator.ratsexpansion.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ratsexpansion.item.ToothpickItem;
import net.mcreator.ratsexpansion.RatsExpansionMod;

import java.util.Map;

public class RatSnackPlayerFinishesUsingProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RatsExpansionMod.LOGGER.warn("Failed to load dependency entity for procedure RatSnackPlayerFinishesUsing!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(ToothpickItem.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
