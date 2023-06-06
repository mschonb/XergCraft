package net.xerg.xcraft.item.custom;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class TomatoItem extends Item {
    public TomatoItem() {
        super(new Item.Properties()
                .tab(CreativeModeTab.TAB_FOOD)
                .food(new FoodProperties.Builder().nutrition(3).saturationMod(0.3f).build())
        );
    }
}
