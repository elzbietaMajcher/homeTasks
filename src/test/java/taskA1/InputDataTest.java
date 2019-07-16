package taskA1;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InputDataTest {

    @Test
    public void fromText()throws ParseException {
        String inputString = " <tr class=\"primera odd\"><th class=\"titulo ini\" scope=\"row\">2017/10/10</th><th class=\"titulo\" scope=\"col\">Demand (b.c)</th><th class=\"titulo\" scope=\"col\">Generation(1,234.56)</th><th class=\"titulo\" scope=\"col\">Motores diesel</th><th class=\"titulo\" scope=\"col\">Turbina de gas</th><th class=\"titulo\" scope=\"col\">Fuel + Gas</th><th class=\"titulo\" scope=\"col\">Ciclo combinado (3)</sup></th><th class=\"titulo\" scope=\"col\">GeneraciÃ³n auxiliar (4)</th> </tr>\n";
        Date temp = new SimpleDateFormat("yyyy/MM/dd").parse("2017/10/10");
        InputData expected = new InputData(temp,"Demand (b.c)","Generation(1,234.56)", "Motores diesel",
                "Turbina de gas", "Fuel + Gas", "Ciclo combinado (3)", "GeneraciÃ³n auxiliar (4)");

       InputData actual = InputData.fromText(inputString);

        System.out.println(expected);
        System.out.println();
        System.out.println(actual);

        expected.equals(actual);
    }

    @Test
    public void clean4() {
String input = "class=\"titulo ini\" scope=\"row\">2017/10/10</th>";
String expected = "2017/10/10";
String actual = InputData.clean4(input);
expected.equals(actual);


    }
}