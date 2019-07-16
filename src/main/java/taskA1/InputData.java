package taskA1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class InputData {

    Date date;
    String demand;
    String generation;
    String engine;
    String turbina;
    String fuel;
    String ciclo;
    String generacion;

    public InputData(Date date, String demand, String generation, String engine, String turbina, String fuel, String ciclo, String generacion) {
        this.date = date;
        this.demand = demand;
        this.generation = generation;
        this.engine = engine;
        this.turbina = turbina;
        this.fuel = fuel;
        this.ciclo = ciclo;
        this.generacion = generacion;
    }

    @Override
    public String toString() {
        return "InputData{" +
                "date=" + date +
                ", demand='" + demand + '\'' +
                ", generation='" + generation + '\'' +
                ", engine='" + engine + '\'' +
                ", turbina='" + turbina + '\'' +
                ", fuel='" + fuel + '\'' +
                ", ciclo='" + ciclo + '\'' +
                ", generacion='" + generacion + '\'' +
                '}';
    }

    /**
     * @param input is a line from the text from the html
     * @return an object with parsed data or null
     */
    public static InputData fromText(String input)  {
        InputData inputData = null;
        try {

            List<String> parsedText = parsText(input);

            Date temp = new SimpleDateFormat("yyyy/MM/dd").parse(clean4(parsedText.get(1)));

            inputData = new InputData(temp, clean(parsedText.get(2)), clean(parsedText.get(3)), clean(parsedText.get(4)), clean(parsedText.get(5)), clean(parsedText.get(6)), clean2(parsedText.get(7)), clean3(parsedText.get(8)));
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        return inputData;
    }

    public static String clean4(String s) {
        return s.replace("class=\"titulo ini\" scope=\"row\">", "")
                .replace("</th>", "")
                .trim();
    }


    private static String clean3(String s) {
        return s.replace("class=\"titulo\" scope=\"col\">", "")
                .replace("</th> </tr>", "")
                .trim();
    }

    private static String clean2(String s) {
        return s.replace("class=\"titulo\" scope=\"col\">", "")
                .replace("</sup></th>", "")
                .trim();
    }
    private static String clean(String s) {
        return s.replace("class=\"titulo\" scope=\"col\">", "")
                .replace("</th>", "")
                .trim();
    }

    public static List<String> parsText(String input) {
        return Arrays.asList(input.split("<th"));
    }


}
