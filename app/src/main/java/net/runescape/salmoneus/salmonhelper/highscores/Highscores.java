package net.runescape.salmoneus.salmonhelper.highscores;

/**
 * Created by kenneth on 5/30/16.
 * Found on the Internet
 * Should I be concerned?
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * A wrapper for the RuneScape old school highscores API.
 * @author Ryan Greene
 *
 */
public final class Highscores {

    /**
     * A private constructor to prevent initialization.
     */
    private Highscores() {

    }

    /**
     * The base URL of the API request.
     */
    private static final String BASE_URL = "http://services.runescape.com/";
    private static final String MODE_PARAM = "m";
    private static final String PAGE = "index_lite.ws";
    private static final String PLAYER_PARM = "?player=";
    /**
     * The amount of skills in old school RuneScape.
     */
    private static final int OS_SKILL_COUNT = 24;

    /**
     * The amount of recorded activities in old school RuneScape.
     */
    private static final int OS_ACTIVITY_COUNT = 3;

    /**
     * Gets all of the specified player's skills.
     *
     * @param playerName The name of the player to get the skills of.
     * @return The skills of the player.
     * @throws IllegalArgumentException if the player name isn't a valid one.
     */
    public static Skill[] getSkills(final String playerName) {
        try {
            final Skill[] skills = new Skill[OS_SKILL_COUNT];
            try (final BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(new StringBuffer(BASE_URL).append(playerName).toString()).openStream()))) {
                for (int skill = 0; skill < OS_SKILL_COUNT; skill++) {
                    final String[] skillEncodedSplit = reader.readLine().split(",");
                    skills[skill] = new Skill(Integer.parseInt(skillEncodedSplit[0]), Integer.parseInt(skillEncodedSplit[1]), Integer.parseInt(skillEncodedSplit[2]));
                }
            }
            return skills;
        } catch (final IOException e) {
            throw new IllegalArgumentException("Username not valid");
        }
    }

    /**
     * Gets the specified skill of the specified player.
     *
     * @param playerName The name of the player to get the skill of.
     * @param skillId    The id of the skill to get.
     * @return The skill of the player.
     */
    public static Skill getSkill(final String playerName, int skillId) {
        return getSkills(playerName)[skillId];
    }

    /**
     * Gets all of the specified player's activities.
     *
     * @param playerName The name of the player to get the activities of.
     * @return The activities of the player.
     * @throws IllegalArgumentException if the player name isn't a valid one.
     */
    public static Activity[] getActivities(final String playerName) {
        try {
            final Activity[] activities = new Activity[OS_ACTIVITY_COUNT];
            try (final BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(new StringBuffer(BASE_URL).append(playerName).toString()).openStream()))) {
                for (int skill = 0; skill < OS_SKILL_COUNT; skill++) {
                    reader.readLine();
                }
                for (int activity = 0; activity < OS_ACTIVITY_COUNT; activity++) {
                    final String[] activityEncodedSplit = reader.readLine().split(",");
                    activities[activity] = new Activity(Integer.parseInt(activityEncodedSplit[0]), Integer.parseInt(activityEncodedSplit[1]));
                }
            }
            return activities;
        } catch (final IOException e) {
            throw new IllegalArgumentException("Username not valid");
        }
    }

    /**
     * Gets the specified activity of the specified player.
     *
     * @param playerName The name of the player to get the activity of.
     * @param activityId The id of the activity to get.
     * @return The activity of the player.
     */
    public static Activity getActivity(final String playerName, int activityId) {
        return getActivities(playerName)[activityId];
    }

}

