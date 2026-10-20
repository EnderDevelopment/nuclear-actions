package com.example.electricityredstoneexpansion.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class DistributionCableBlock extends Block {
    public static final BooleanProperty CONNECTED = BooleanProperty.create("connected");

    public DistributionCableBlock() {
        super(Properties.of(Material.METAL, MaterialColor.COLOR_GRAY)
                .strength(5.0f, 6.0f)
                .sound(SoundType.METAL));
        this.registerDefaultState(this.defaultBlockState().setValue(CONNECTED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(CONNECTED);
    }
}