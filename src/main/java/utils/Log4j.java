package utils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {
    private static final Logger logger = Logger.getLogger(Log4j.class);

    public static void info(String message) {
        logger.info(message);
    }
}
