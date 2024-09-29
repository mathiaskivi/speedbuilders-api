package ee.mathiaskivi.speedbuilders.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player wins a game.
 */
public class PlayerWinEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final Player player;

    /**
     * Constructs a new PlayerWinEvent.
     *
     * @param player The player who won a game.
     */
    public PlayerWinEvent(Player player) {
        this.player = player;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    /**
     * Gets the player who won a game.
     *
     * @return The player who won a game.
     */
    public @NotNull Player getPlayer() {
        return player;
    }
}
