package Lecture4;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogDemo {
    private static final Logger LOGGER = Logger.getLogger(LogDemo.class.getName());

    private static void randomFailingAlgorithm() {
        double randomNumber = Math.random();
        LOGGER.log(Level.FINE, "Generated random number {0}", randomNumber);
        if (randomNumber < 0.5) {
            throw new IllegalStateException("Invalid phase of the Moon");
        }
    }


    public static void main(String[] args) {
        LOGGER.log(Level.FINE, "Started with arguments {0}", Arrays.toString(args));

        try {
            randomFailingAlgorithm();
        } catch (IllegalStateException e) {
            LOGGER.log(Level.SEVERE, "Exception caught", e);
            System.exit(2);
        }
        LOGGER.fine("Finished successfully");
    }
}
