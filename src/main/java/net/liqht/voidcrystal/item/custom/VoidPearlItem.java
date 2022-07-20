package net.liqht.voidcrystal.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class VoidPearlItem extends Item {
    public VoidPearlItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand.equals(Hand.MAIN_HAND)) {
            user.playSound(SoundEvents.ENTITY_ENDER_PEARL_THROW, 1.0F, 1.0F);
        }
        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.literal("This item is used for transporting players using the Void Crystal").formatted(Formatting.AQUA));
        } else {
            tooltip.add(Text.literal("Press shift for more info!").formatted(Formatting.YELLOW));
        }


        super.appendTooltip(stack, world, tooltip, context);
    }
}
