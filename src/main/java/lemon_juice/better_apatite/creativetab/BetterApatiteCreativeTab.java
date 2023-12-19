package lemon_juice.better_apatite.creativetab;

import lemon_juice.better_apatite.BetterApatite;
import lemon_juice.better_apatite.block.BetterApatiteBlocks;
import lemon_juice.better_apatite.item.BetterApatiteItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterApatiteCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterApatite.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BETTER_APATITE_TAB = CREATIVE_MODE_TABS.register("better_apatite", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_apatite"))
            .icon(() -> new ItemStack(BetterApatiteItems.FERTILIZER.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == BETTER_APATITE_TAB.get()){
            event.accept(BetterApatiteItems.FERTILIZER.get());

            event.accept(BetterApatiteBlocks.APATITE_ORE.get());
            event.accept(BetterApatiteBlocks.DEEPSLATE_APATITE_ORE.get());
        }
    }

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
