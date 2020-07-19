package us.navonod.playground;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LoggerTest {
    Logger logger;

    @BeforeEach
    public void setLogger() {
        logger = new Logger();

    }

    @Test
    public void itThrowsWhenPassedAnEmptyMessage() {
        LoggerException exception = assertThrows(LoggerException.class, () -> logger.log(""));

        assertEquals("Log message cannot be blank", exception.getMessage());
    }
}
