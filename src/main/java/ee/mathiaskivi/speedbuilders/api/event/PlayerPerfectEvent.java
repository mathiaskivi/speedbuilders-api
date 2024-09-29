package ee.mathiaskivi.speedbuilders.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player recreates the displayed build.
 */
public class PlayerPerfectEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final float time;

    /**
     * Constructs a new PlayerPerfectEvent.
     *
     * @param player The player who recreated the displayed build.
     * @param time The time spent on recreating the displayed build in seconds.
     */
    public PlayerPerfectEvent(Player player, float time) {
        this.player = player;
        this.time = time;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    /**
     * Gets the player who recreated the displayed build.
     *
     * @return The player who recreated the displayed build.
     */
    public @NotNull Player getPlayer() {
        return player;
    }

    /**
     * Gets the time spent on recreating the displayed build in seconds.
     *
     * @return The time spent on recreating the displayed build in seconds.
     */
    public float getTime() {
        return time;
    }
}
