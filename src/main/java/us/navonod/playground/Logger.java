package us.navonod.playground;

public class Logger {
    public void log(String s) throws Exception {
        throw new LoggerException("Log message cannot be blank");
    }
}
