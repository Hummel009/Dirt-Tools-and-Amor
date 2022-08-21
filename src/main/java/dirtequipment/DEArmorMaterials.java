package dirtequipment;

import java.util.function.Supplier;

import net.minecraft.sounds.*;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

public enum DEArmorMaterials implements ArmorMaterial {
	DIRT("dirt", 37, new int[] { 3, 6, 8, 3 }, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.of(Blocks.DIRT));

	private static final int[] HEALTH_PER_SLOT = { 13, 15, 16, 11 };
	private final String name;
	private final int durabilityMultiplier;
	private final int[] slotProtections;
	private final int enchantmentValue;
	private final SoundEvent sound;
	private final float toughness;
	private final float knockbackResistance;
	private final LazyLoadedValue<Ingredient> repairIngredient;

	DEArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
		name = p_40474_;
		durabilityMultiplier = p_40475_;
		slotProtections = p_40476_;
		enchantmentValue = p_40477_;
		sound = p_40478_;
		toughness = p_40479_;
		knockbackResistance = p_40480_;
		repairIngredient = new LazyLoadedValue<>(p_40481_);
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot p_40487_) {
		return slotProtections[p_40487_.getIndex()];
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlot p_40484_) {
		return HEALTH_PER_SLOT[p_40484_.getIndex()] * durabilityMultiplier;
	}

	@Override
	public int getEnchantmentValue() {
		return enchantmentValue;
	}

	@Override
	public SoundEvent getEquipSound() {
		return sound;
	}

	@Override
	public float getKnockbackResistance() {
		return knockbackResistance;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return repairIngredient.get();
	}

	@Override
	public float getToughness() {
		return toughness;
	}
}
