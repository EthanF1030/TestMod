package com.demondev.test_mod.block.custom;

import com.demondev.test_mod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class MagicBlock extends Block {
    public MagicBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                               Player player, BlockHitResult hitResult) {
        level.playSound(player, pos, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1f, 1f);
        return InteractionResult.SUCCESS;
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof ItemEntity itemEntity){
            if(itemEntity.getItem().getItem() == ModItems.TESTER.get()) {
                itemEntity.setItem(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getItem().getCount()));
            }
            if(itemEntity.getItem().getItem() == Items.RAW_IRON) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }if(itemEntity.getItem().getItem() == Items.RAW_GOLD) {
                itemEntity.setItem(new ItemStack(Items.GOLD_INGOT, itemEntity.getItem().getCount()));
            }if(itemEntity.getItem().getItem() == Items.RAW_COPPER) {
                itemEntity.setItem(new ItemStack(Items.COPPER_INGOT, itemEntity.getItem().getCount()));
            }
        }

        super.stepOn(level, pos, state, entity);
    }
}
