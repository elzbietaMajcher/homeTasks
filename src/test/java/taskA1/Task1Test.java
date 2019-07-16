package taskA1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Task1Test {

    Path path = Paths.get("src/main/resources/task_A1.html");
    Charset charset = Charset.forName("UTF-8");


    @Test
    public void redFileHasAmountOfLines() {
        List<String> input = Task1.readFile(path, charset);
        long numOfLines = 189;

        Assert.assertEquals(numOfLines, input.size());

    }
}
