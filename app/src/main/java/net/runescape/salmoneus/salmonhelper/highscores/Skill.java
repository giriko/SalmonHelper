package net.runescape.salmoneus.salmonhelper.highscores;

/**
 * Created by Kenneth Beck (girko) on 5/31/16.
 * @email: <thebeckken@gmail.com>
 *
 */

/**
 * Represents a single skill.
 *
 * @author Ryan Greene
 */
public class Skill {

    /**
     * The rank of the skill.
     */
    private final int rank;

    /**
     * The level of the skill.
     */
    private final int level;

    /**
     * The xp of the skill.
     */
    private final int xp;

    /**
     * Constructs a new skill with the specified rank, level, and xp.
     *
     * @param rank  The rank of the skill.
     * @param level The level of the skill.
     * @param xp    The xp of the skill.
     */
    public Skill(final int rank, final int level, final int xp) {
        this.rank = rank;
        this.level = level;
        this.xp = xp;
    }

    /**
     * Gets the rank of the skill.
     *
     * @return The rank of the skill.
     */
    public int getRank() {
        return rank;
    }

    /**
     * Gets the level of the skill.
     *
     * @return The level of the skill.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Gets the xp of the skill.
     *
     * @return The xp of the skill.
     */
    public int getXp() {
        return xp;
    }
}
