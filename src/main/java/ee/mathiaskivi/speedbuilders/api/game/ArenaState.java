package ee.mathiaskivi.speedbuilders.api.game;

/**
 * Represents the state of an arena.
 */
public enum ArenaState {
    /**
     * The minimum number of players is needed to start the arena.
     */
    WAITING,

    /**
     * The countdown to start the arena is being shown.
     */
    STARTING,

    /**
     * The countdown to display the first build is being shown.
     */
    BEGINNING,

    /**
     * The build to be recreated is being displayed to players.
     */
    DISPLAYING,

    /**
     * The displayed build is being recreated by players.
     */
    BUILDING,

    /**
     * The least accurate build is being announced to players.
     */
    JUDGING
}
