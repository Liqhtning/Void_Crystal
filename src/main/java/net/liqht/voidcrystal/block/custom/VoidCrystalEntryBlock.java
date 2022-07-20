package net.liqht.voidcrystal.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.function.Predicate;

public class VoidCrystalEntryBlock extends Block {
    private Object VoidPearlItem;
    private Object Predicate;
    private Object VoidCrystalExitBlock;

    public VoidCrystalEntryBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient() && hand.equals(VoidPearlItem)) {
            player.teleport(0, 500, 0);
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 60, 10,
                    true, false, false));
            try {
                Thread.sleep(3600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int x = pos.getX(); ; ) {
                for (int y = pos.getY(); ; ) {
                    for (int z = pos.getZ(); ; ) {
                        if (world.getBlockState(new BlockPos(x, y, z)).getBlock().equals(VoidCrystalExitBlock)) {
                            player.teleport(x, y, z);
                            break;
                        }
                    }
                }
            }
        }


        return super.onUse(state, world, pos, player, hand, hit);
    }

}
