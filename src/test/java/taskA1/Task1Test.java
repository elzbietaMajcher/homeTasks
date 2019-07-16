package taskA1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task1Test {

    Path path = Paths.get("src/main/resources/task_A1.html");
    Charset charset = Charset.forName("UTF-8");


    @Test
    public void redFileHasAmountOfLines() throws IOException {
        List<String> input = Task1.readFile(path, charset);
        long numOfLines = 189;

        System.out.println(input);

        Assert.assertEquals(numOfLines, input.size());
    }

    @Test
    public void onlyValid3() throws IOException {
        List<String> input = Task1.readFile(path, charset);

//        input.forEach(System.out::println);

//
        List<InputData> collect = input
                .stream()
                .map(InputData::fromTextToParsed)
                .filter(i -> i !=null)
                .collect(Collectors.toList());


        System.out.println(collect.size());
//
//        collect.forEach(System.out::println);


    }
}
