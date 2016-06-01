package net.runescape.salmoneus.salmonhelper.highscores;

/**
 * Created by kenneth on 5/31/16.
 */
/**
 * Represents a single activity.
 * @author Ryan Greene
 *
 */
public class Activity {

        /**
         * The rank of the activity.
         */
        private final int rank;

        /**
         * The score of the activity.
         */
        private final int score;

        /**
         * Constructs a new activity with the specified rank and score.
         * @param rank The rank of the activity.
         * @param score The score of the activity.
         */
        public Activity(final int rank, final int score) {
            this.rank = rank;
            this.score = score;
        }

        /**
         * Gets the rank of the activity.
         * @return The rank of the activity.
         */
        public int getRank() {
            return rank;
        }

        /**
         * Gets the score of the activity.
         * @return The score of the activity.
         */
        public int getScore() {
            return score;
        }
    }
