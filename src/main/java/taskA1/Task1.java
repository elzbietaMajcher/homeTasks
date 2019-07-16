package taskA1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    Path path = Paths.get("src/main/resources/task_A1.html");
    Charset charset = Charset.forName("UTF-8");





    public static List<String> readFile(Path path, Charset charset) throws IOException {
        List<String> lines = new ArrayList<>();
       BufferedReader reader = Files.newBufferedReader(path, charset);
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
//                System.out.println(line.toString());
            }


        return lines;

    }

}
