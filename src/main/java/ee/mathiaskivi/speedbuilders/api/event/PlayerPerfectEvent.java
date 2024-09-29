package ee.mathiaskivi.speedbuilders.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class PlayerPerfectEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final float timeInSeconds;

    public PlayerPerfectEvent(Player player, float timeInSeconds) {
        this.player = player;
        this.timeInSeconds = timeInSeconds;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public @NotNull Player getPlayer() {
        return player;
    }

    public float getTimeInSeconds() {
        return timeInSeconds;
    }
}
