package ee.mathiaskivi.speedbuilders.api.event;

import ee.mathiaskivi.speedbuilders.api.game.ArenaState;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class ArenaStateChangeEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final ArenaState arenaState;
    private final Collection<? extends Player> players;

    public ArenaStateChangeEvent(ArenaState arenaState, Collection<? extends Player> players) {
        this.arenaState = arenaState;
        this.players = players;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public @NotNull ArenaState getArenaState() {
        return arenaState;
    }

    public @NotNull Collection<? extends Player> getPlayers() {
        return players;
    }
}
