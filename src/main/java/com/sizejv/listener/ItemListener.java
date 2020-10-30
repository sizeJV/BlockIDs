package com.sizejv.listener;

import com.sizejv.util.Collection;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Collections;
import java.util.Objects;

public class ItemListener implements Listener {

    @EventHandler
    public void onItemPickup(InventoryMoveItemEvent event) {
        for (ItemStack item : event.getSource().getContents()) {
            Objects.requireNonNull(item.getItemMeta()).setLore(Collections.singletonList("ID: §c" + Collection.getID(item.getType())));
        }
    }
}
