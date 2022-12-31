package dirtequipment;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DECreativeTabs {
	@SubscribeEvent
	public static void addCreativeTab(CreativeModeTabEvent.BuildContents event) {
		if (event.getTab() == CreativeModeTabs.COMBAT) {
			event.accept(DE.DIRT_SWORD.get());
			event.accept(DE.DIRT_HELMET.get());
			event.accept(DE.DIRT_CHESTPLATE.get());
			event.accept(DE.DIRT_LEGGINGS.get());
			event.accept(DE.DIRT_BOOTS.get());
		}
		if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			event.accept(DE.DIRT_PICKAXE.get());
			event.accept(DE.DIRT_AXE.get());
			event.accept(DE.DIRT_SHOVEL.get());
			event.accept(DE.DIRT_HOE.get());
		}
	}
}
