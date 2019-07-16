package taskA1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class InputDataTest {

    @Test
    public void fromText() {
        String inputString = " <tr class=\"primera odd\"><th class=\"titulo ini\" scope=\"row\">2017/10/10</th><th class=\"titulo\" scope=\"col\">Demand (b.c)</th><th class=\"titulo\" scope=\"col\">Generation(1,234.56)</th><th class=\"titulo\" scope=\"col\">Motores diesel</th><th class=\"titulo\" scope=\"col\">Turbina de gas</th><th class=\"titulo\" scope=\"col\">Fuel + Gas</th><th class=\"titulo\" scope=\"col\">Ciclo combinado (3)</sup></th><th class=\"titulo\" scope=\"col\">GeneraciÃ³n auxiliar (4)</th> </tr>\n";

        InputData expected = new InputData(new Date(20171010L),"Demand (b.c)","Generation(1,234.56)", "Motores diesel",
                "Turbina de gas", "Fuel + Gas", "Ciclo combinado (3)", "GeneraciÃ³n auxiliar (4)");

       InputData actual = InputData.fromText(inputString);

        System.out.println(expected);
        System.out.println();
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }
}