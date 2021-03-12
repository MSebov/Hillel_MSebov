import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomLogger {
    private static Logger loggerDebug = LoggerFactory.getLogger("logger.debug");


    public static void logDebug(String str) {
        loggerDebug.debug(str);
    }


}
