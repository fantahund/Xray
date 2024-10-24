package fr.atesab.xray.config;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;

public class SyncedBlockList extends SyncedRegistryList<Block> {

    private SyncedBlockList(SyncedRegistryList<Block> other) {
        super(other);
    }

    public SyncedBlockList() {
        super(Registries.BLOCK);
    }

    public SyncedBlockList(Block... objects) {
        super(objects, Registries.BLOCK);
    }

    public SyncedBlockList(List<Block> objects) {
        super(objects, Registries.BLOCK);
    }

    @Override
    public SyncedBlockList clone() {
        return new SyncedBlockList(this);
    }
}