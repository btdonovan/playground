package us.navonod.playground;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Transposer {
    public String readFile(String fileName) throws IOException {
        Stream<String> stream = Files.lines(Paths.get(fileName));
        return stream.collect(Collectors.joining("\n"));
    }
}
