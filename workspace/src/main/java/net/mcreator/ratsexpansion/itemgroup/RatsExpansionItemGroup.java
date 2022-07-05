
package net.mcreator.ratsexpansion.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.ratsexpansion.item.RatSkewerItem;
import net.mcreator.ratsexpansion.RatsExpansionModElements;

@RatsExpansionModElements.ModElement.Tag
public class RatsExpansionItemGroup extends RatsExpansionModElements.ModElement {
	public RatsExpansionItemGroup(RatsExpansionModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabrats_expansion") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RatSkewerItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
