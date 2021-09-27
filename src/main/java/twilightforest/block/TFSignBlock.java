package twilightforest.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.block.entity.BlockEntity;
import twilightforest.block.entity.TFSignBlockEntity;

import javax.annotation.Nullable;

public class TFSignBlock extends StandingSignBlock {
    public TFSignBlock(Properties properties, WoodType type) {
        super(properties, type);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new TFSignBlockEntity(pos, state);
    }
}
