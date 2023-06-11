package lemon_juice.better_apatite.creativetab;

import lemon_juice.better_apatite.BetterApatite;
import lemon_juice.better_apatite.block.ModBlocks;
import lemon_juice.better_apatite.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterApatite.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTER_APATITE_TAB = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_apatite"))
            .icon(() -> new ItemStack(ModItems.FERTILIZER.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == BETTER_APATITE_TAB.get()){
            event.accept(ModItems.FERTILIZER.get());

            event.accept(ModBlocks.APATITE_ORE.get());
            event.accept(ModBlocks.DEEPSLATE_APATITE_ORE.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
