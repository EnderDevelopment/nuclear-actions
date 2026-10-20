package com.example.electricityredstoneexpansion.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class MotherboardBlock extends Block {
    public static final IntegerProperty CHIP_SLOTS = IntegerProperty.create("chip_slots", 0, 5);

    public MotherboardBlock() {
        super(Properties.of(Material.METAL, MaterialColor.COLOR_GRAY)
                .strength(5.0f, 6.0f)
                .sound(SoundType.METAL));
        this.registerDefaultState(this.defaultBlockState().setValue(CHIP_SLOTS, 0));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(CHIP_SLOTS);
    }
}