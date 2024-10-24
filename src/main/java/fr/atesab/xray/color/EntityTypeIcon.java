package fr.atesab.xray.color;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;

public record EntityTypeIcon(EntityType<?> entity, ItemStack icon) {

    private static final Map<String, ItemStack> ICONS = new HashMap<>();
    private static final ItemStack DEFAULT_ICON = new ItemStack(Items.PAPER);

    public static final EntityTypeIcon CREEPER = register(EntityType.CREEPER, Items.CREEPER_HEAD);
    public static final EntityTypeIcon PLAYER = register(EntityType.PLAYER, Items.PLAYER_HEAD);
    public static final EntityTypeIcon SKELETON = register(EntityType.SKELETON, Items.SKELETON_SKULL);
    public static final EntityTypeIcon SKELETON_HORSE = register(EntityType.SKELETON_HORSE, Items.SKELETON_SKULL);
    public static final EntityTypeIcon WITHER = register(EntityType.WITHER, Items.WITHER_SKELETON_SKULL);
    public static final EntityTypeIcon WITHER_SKELETON = register(EntityType.WITHER_SKELETON,
            Items.WITHER_SKELETON_SKULL);
    public static final EntityTypeIcon ARMOR_STAND = register(EntityType.ARMOR_STAND, Items.ARMOR_STAND);
    public static final EntityTypeIcon ARROW = register(EntityType.ARROW, Items.ARROW);
    public static final EntityTypeIcon CAVE_SPIDER = register(EntityType.CAVE_SPIDER, Items.SPIDER_EYE);
    public static final EntityTypeIcon CHEST_MINECART = register(EntityType.CHEST_MINECART, Items.CHEST_MINECART);
    public static final EntityTypeIcon FURNACE_MINECART = register(EntityType.FURNACE_MINECART, Items.FURNACE_MINECART);
    public static final EntityTypeIcon COMMAND_BLOCK_MINECART = register(EntityType.COMMAND_BLOCK_MINECART,
            Items.COMMAND_BLOCK_MINECART);
    public static final EntityTypeIcon MINECART = register(EntityType.MINECART, Items.MINECART);
    public static final EntityTypeIcon HOPPER_MINECART = register(EntityType.HOPPER_MINECART, Items.HOPPER_MINECART);
    public static final EntityTypeIcon TNT_MINECART = register(EntityType.TNT_MINECART, Items.TNT_MINECART);
    public static final EntityTypeIcon SPAWNER_MINECART = register(EntityType.SPAWNER_MINECART, Items.SPAWNER);
    public static final EntityTypeIcon CHICKEN = register(EntityType.CHICKEN, Items.CHICKEN);
    public static final EntityTypeIcon EGG = register(EntityType.EGG, Items.EGG);
    public static final EntityTypeIcon ENDER_DRAGON = register(EntityType.ENDER_DRAGON, Items.DRAGON_HEAD);
    public static final EntityTypeIcon ENDER_PEARL = register(EntityType.ENDER_PEARL, Items.ENDER_PEARL);
    public static final EntityTypeIcon END_CRYSTAL = register(EntityType.END_CRYSTAL, Items.END_CRYSTAL);
    public static final EntityTypeIcon EYE_OF_ENDER = register(EntityType.EYE_OF_ENDER, Items.ENDER_EYE);
    public static final EntityTypeIcon EXPERIENCE_BOTTLE = register(EntityType.EXPERIENCE_BOTTLE,
            Items.EXPERIENCE_BOTTLE);
    public static final EntityTypeIcon EXPERIENCE_ORB = register(EntityType.EXPERIENCE_ORB, Items.EXPERIENCE_BOTTLE);
    public static final EntityTypeIcon FALLING_BLOCK = register(EntityType.FALLING_BLOCK, Blocks.SAND);
    public static final EntityTypeIcon FIREBALL = register(EntityType.FIREBALL, Items.FIRE_CHARGE);
    public static final EntityTypeIcon FIREWORK_ROCKET = register(EntityType.FIREWORK_ROCKET, Items.FIREWORK_ROCKET);
    public static final EntityTypeIcon OAK_BOAT = register(EntityType.OAK_BOAT, Items.OAK_BOAT);
    public static final EntityTypeIcon DARK_OAK_BOAT = register(EntityType.DARK_OAK_BOAT, Items.DARK_OAK_BOAT);
    public static final EntityTypeIcon SPRUCE_BOAT = register(EntityType.SPRUCE_BOAT, Items.SPRUCE_BOAT);
    public static final EntityTypeIcon ACACIA_BOAT = register(EntityType.ACACIA_BOAT, Items.ACACIA_BOAT);
    public static final EntityTypeIcon BIRCH_BOAT = register(EntityType.BIRCH_BOAT, Items.BIRCH_BOAT);
    public static final EntityTypeIcon CHERRY_BOAT = register(EntityType.CHERRY_BOAT, Items.CHERRY_BOAT);
    public static final EntityTypeIcon JUNGLE_BOAT = register(EntityType.JUNGLE_BOAT, Items.JUNGLE_BOAT);
    public static final EntityTypeIcon MANGROVE_BOAT = register(EntityType.MANGROVE_BOAT, Items.MANGROVE_BOAT);
    public static final EntityTypeIcon PALE_OAK_BOAT = register(EntityType.PALE_OAK_BOAT, Items.PALE_OAK_BOAT);
    public static final EntityTypeIcon BAMBOO_RAFT = register(EntityType.BAMBOO_RAFT, Items.BAMBOO_RAFT);

    public static final EntityTypeIcon OAK_CHEST_BOAT = register(EntityType.OAK_CHEST_BOAT, Items.OAK_CHEST_BOAT);
    public static final EntityTypeIcon DARK_OAK_CHEST_BOAT = register(EntityType.DARK_OAK_CHEST_BOAT, Items.DARK_OAK_CHEST_BOAT);
    public static final EntityTypeIcon SPRUCE_CHEST_BOAT = register(EntityType.SPRUCE_CHEST_BOAT, Items.SPRUCE_CHEST_BOAT);
    public static final EntityTypeIcon ACACIA_CHEST_BOAT = register(EntityType.ACACIA_CHEST_BOAT, Items.ACACIA_CHEST_BOAT);
    public static final EntityTypeIcon BIRCH_CHEST_BOAT = register(EntityType.BIRCH_CHEST_BOAT, Items.BIRCH_CHEST_BOAT);
    public static final EntityTypeIcon CHERRY_CHEST_BOAT = register(EntityType.CHERRY_CHEST_BOAT, Items.CHERRY_CHEST_BOAT);
    public static final EntityTypeIcon JUNGLE_CHEST_BOAT = register(EntityType.JUNGLE_CHEST_BOAT, Items.JUNGLE_CHEST_BOAT);
    public static final EntityTypeIcon MANGROVE_CHEST_BOAT = register(EntityType.MANGROVE_CHEST_BOAT, Items.MANGROVE_CHEST_BOAT);
    public static final EntityTypeIcon PALE_OAK_CHEST_BOAT = register(EntityType.PALE_OAK_CHEST_BOAT, Items.PALE_OAK_CHEST_BOAT);
    public static final EntityTypeIcon BAMBOO_CHEST_RAFT = register(EntityType.BAMBOO_CHEST_RAFT, Items.BAMBOO_CHEST_RAFT);

    public static final EntityTypeIcon SPIDER = register(EntityType.SPIDER, Items.SPIDER_EYE);
    public static final EntityTypeIcon POTION = register(EntityType.POTION, Items.POTION);
    public static final EntityTypeIcon PUFFERFISH = register(EntityType.PUFFERFISH, Items.PUFFERFISH);
    public static final EntityTypeIcon ITEM = register(EntityType.ITEM, Items.STICK);
    public static final EntityTypeIcon ITEM_FRAME = register(EntityType.ITEM_FRAME, Items.ITEM_FRAME);
    public static final EntityTypeIcon PAINTING = register(EntityType.PAINTING, Items.PAINTING);
    public static final EntityTypeIcon GLOW_ITEM_FRAME = register(EntityType.GLOW_ITEM_FRAME, Items.ITEM_FRAME);
    public static final EntityTypeIcon SNOWBALL = register(EntityType.SNOWBALL, Items.SNOWBALL);
    public static final EntityTypeIcon SPECTRAL_ARROW = register(EntityType.SPECTRAL_ARROW, Items.SPECTRAL_ARROW);
    public static final EntityTypeIcon TNT = register(EntityType.TNT, Items.TNT);
    public static final EntityTypeIcon WOLF = register(EntityType.WOLF, Items.BONE);

    public static EntityTypeIcon register(EntityType<?> type, ItemConvertible icon) {
        return register(type, new ItemStack(icon));
    }

    public static EntityTypeIcon register(EntityType<?> type, ItemStack icon) {
        ICONS.put(type.getTranslationKey(), icon);
        return new EntityTypeIcon(type, icon);
    }

    @SuppressWarnings("deprecation")
    public static ItemStack getIcon(EntityType<?> type) {
        ItemStack icon = ICONS.get(type.getTranslationKey());
        if (icon != null)
            return icon;

        SpawnEggItem egg = SpawnEggItem.forEntity(type);

        if (egg != null)
            return new ItemStack(egg);

        return DEFAULT_ICON;
    }

    @SuppressWarnings("deprecation")
    public static List<EntityType<?>> getEntityOfType(SpawnGroup cat) {
        return Registries.ENTITY_TYPE.stream().filter(type -> type.getSpawnGroup() == cat).toList();
    }
}
