package me.realized._duels.event;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class KitCreateEvent extends KitEvent {

    private static final HandlerList handlers = new HandlerList();

    public KitCreateEvent(String name, Player player) {
        super(name, player);
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}