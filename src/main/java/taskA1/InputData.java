package taskA1;

import java.util.Date;

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
     *
     * @param input is a line from the text from the html
     * @return an object with parsed data or null
     */
    public static InputData fromText (String input) {
        return new InputData(new Date(), "", "","","","","","");
    }



}
