package utilities;

import models.Credencial;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DataGiver {

    private static Map<String, Credencial> obtenerMapCredencial() {
        final var listaCredencial = ExcelReader.obtenerListaCredencial();

        return listaCredencial
                .stream()
                .collect(Collectors.toMap(Credencial::getNombre, Function.identity()));
    }

    public static Credencial obtenerCredencialesValidas() {
        return obtenerMapCredencial().get("valid");
    }

    public static Credencial obtenerCredencialesInValidas() {
        return obtenerMapCredencial().get("invalid");
    }

    public static Credencial obtenerCredencialesBloqueadas() {

        System.out.println("Mapa:" + obtenerMapCredencial());
        return obtenerMapCredencial().get("locked");
    }

}
