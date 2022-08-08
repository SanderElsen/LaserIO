package com.direwolf20.laserio.common.containers.customslot;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class NeighborSlot extends SlotItemHandler {

    public NeighborSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPickup(Player playerIn) {
        return false;
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return false;
    }

    @Override
    public boolean allowModification(Player p_150652_) {
        return false;
    }
    
}
