package lemon_juice.better_apatite.item;

import lemon_juice.better_apatite.BetterApatite;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterApatiteItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterApatite.MOD_ID);

    public static final DeferredItem<Item> FERTILIZER = ITEMS.register("fertilizer", () -> new BoneMealItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
