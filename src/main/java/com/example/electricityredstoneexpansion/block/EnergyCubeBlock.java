package com.example.electricityredstoneexpansion.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class EnergyCubeBlock extends Block {
    public static final BooleanProperty ACTIVE = BooleanProperty.create("active");
    public static final IntegerProperty POWER = IntegerProperty.create("power", 0, 15);

    public EnergyCubeBlock() {
        super(Properties.of(Material.METAL, MaterialColor.COLOR_GRAY)
                .strength(5.0f, 6.0f)
                .sound(SoundType.METAL)
                .lightLevel(state -> state.getValue(ACTIVE) ? 15 : 0));
        this.registerDefaultState(this.defaultBlockState().setValue(ACTIVE, false).setValue(POWER, 0));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(ACTIVE, POWER);
    }
}