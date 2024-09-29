package ee.mathiaskivi.speedbuilders.api.event;

import ee.mathiaskivi.speedbuilders.api.game.ArenaState;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

/**
 * Called when an arena changes state.
 */
public class ArenaStateChangeEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final ArenaState arenaState;
    private final Collection<? extends Player> players;

    /**
     * Constructs a new ArenaStateChangeEvent.
     *
     * @param arenaState The state the arena has changed to.
     * @param players The players present at the arena.
     */
    public ArenaStateChangeEvent(ArenaState arenaState, Collection<? extends Player> players) {
        this.arenaState = arenaState;
        this.players = players;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    /**
     * Gets the state the arena has changed to.
     *
     * @return The state the arena has changed to.
     */
    public @NotNull ArenaState getArenaState() {
        return arenaState;
    }

    /**
     * Gets the players present at the arena.
     *
     * @return The players present at the arena.
     */
    public @NotNull Collection<? extends Player> getPlayers() {
        return players;
    }
}
