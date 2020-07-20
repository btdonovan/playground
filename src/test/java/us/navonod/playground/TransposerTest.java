package us.navonod.playground;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransposerTest {

    Transposer transposer;

    @BeforeEach
    public void setTransposer() {
        transposer = new Transposer();
    }

    @Test
    public void itCanReadFiles() throws IOException {
        assertEquals("hello\nworld", transposer.readFile("file1.txt"));
        assertEquals("foo\nbar", transposer.readFile("file2.txt"));
    }

}