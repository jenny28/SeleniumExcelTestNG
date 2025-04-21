package principal;

import utilities.Logs;

public class EjercicioLog {

    public static void main(String[] args) {
        Logs.info("soy un paso genérico");
        Logs.debug("soy un paso de debugging, el valor es 5");
        Logs.trace("soy un paso puntual, el valor es 5 y la lista actual [1,2,3,4,5]");
    }
}
