package ee.mathiaskivi.speedbuilders.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player loses a game.
 */
public class PlayerLoseEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final Player player;

    /**
     * Constructs a new PlayerLoseEvent.
     *
     * @param player The player who lost a game.
     */
    public PlayerLoseEvent(Player player) {
        this.player = player;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    /**
     * Gets the player who lost a game.
     *
     * @return The player who lost a game.
     */
    public @NotNull Player getPlayer() {
        return player;
    }
}
