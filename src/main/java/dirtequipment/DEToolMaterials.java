package dirtequipment;

import java.util.function.Supplier;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

public enum DEToolMaterials implements Tier {
	DIRT(4, 2031, 9.0F, 4.0F, 15, () -> Ingredient.of(Blocks.DIRT));

	private final int level;
	private final int uses;
	private final float speed;
	private final float damage;
	private final int enchantmentValue;
	private final LazyLoadedValue<Ingredient> repairIngredient;

	DEToolMaterials(int miningLevel, int durability, float miningSpeed, float p_43335_, int enchantability, Supplier<Ingredient> repairIngredient) {
		level = miningLevel;
		uses = durability;
		speed = miningSpeed;
		damage = p_43335_;
		enchantmentValue = enchantability;
		this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
	}

	@Override
	public float getAttackDamageBonus() {
		return damage;
	}

	@Override
	public int getEnchantmentValue() {
		return enchantmentValue;
	}

	@Override
	public int getLevel() {
		return level;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return repairIngredient.get();
	}

	@Override
	public float getSpeed() {
		return speed;
	}

	@Override
	public int getUses() {
		return uses;
	}
}
