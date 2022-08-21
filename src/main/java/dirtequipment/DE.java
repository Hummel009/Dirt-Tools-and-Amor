package dirtequipment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.*;

@Mod(DE.MOD_ID)
public class DE {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DE.MOD_ID);

	public static final RegistryObject<Item> DIRT_SWORD = ITEMS.register("dirt_sword", () -> new SwordItem(DEToolMaterials.DIRT, 6, -2.3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> DIRT_HELMET = ITEMS.register("dirt_helmet", () -> new ArmorItem(DEArmorMaterials.DIRT, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> DIRT_CHESTPLATE = ITEMS.register("dirt_chestplate", () -> new ArmorItem(DEArmorMaterials.DIRT, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> DIRT_LEGGINGS = ITEMS.register("dirt_leggings", () -> new ArmorItem(DEArmorMaterials.DIRT, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> DIRT_BOOTS = ITEMS.register("dirt_boots", () -> new ArmorItem(DEArmorMaterials.DIRT, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

	public static final RegistryObject<Item> DIRT_PICKAXE = ITEMS.register("dirt_pickaxe", () -> new PickaxeItem(DEToolMaterials.DIRT, 4, -2.7f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<Item> DIRT_AXE = ITEMS.register("dirt_axe", () -> new AxeItem(DEToolMaterials.DIRT, 9, -3.1f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<Item> DIRT_SHOVEL = ITEMS.register("dirt_shovel", () -> new ShovelItem(DEToolMaterials.DIRT, 4.5f, -2.9f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
	public static final RegistryObject<Item> DIRT_HOE = ITEMS.register("dirt_hoe", () -> new HoeItem(DEToolMaterials.DIRT, 1, -0.9f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

	public static final String MOD_ID = "dirtequipment";

	public DE() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ITEMS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
	}
}
