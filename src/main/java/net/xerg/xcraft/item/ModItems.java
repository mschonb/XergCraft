package net.xerg.xcraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xerg.xcraft.XCraft;
import net.xerg.xcraft.item.custom.TomatoItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, XCraft.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, XCraft.MOD_ID);

    public static final RegistryObject<TomatoItem> TOMATO = ITEMS.register("tomato", TomatoItem::new);


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
