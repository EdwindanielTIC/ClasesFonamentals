import java.util.*;

public class TiposDeAcceso {
    public static void main(String[] args) {
        // con el siguiente codigo lo que hare sera un acceso secuencua por posicion
        List<String> lista = Arrays.asList("A", "B", "C", "D");

        // con Mapa voy hacer un acceso por clave
        Map<String, String> mapa = new HashMap<>();
        mapa.put("clave1", "Valor 1");
        mapa.put("clave2", "Valor 2");

        // Acceso secuencial por posición
        System.out.println("Acceso secuencial por posición:");
        for (String valor : lista) {
            System.out.println(valor);
        }

        // Acceso directo por posición es muy util cuando tengo la lista
        System.out.println("\nAcceso directo por posición:");
        System.out.println(lista.get(2)); // "C"

        // Acceso secuencial por clave (recorriendo el mapa)
        System.out.println("\nAcceso secuencial por clave:");
        for (Map.Entry<String, String> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        System.out.println("\nAcceso directo por clave:");
        System.out.println(mapa.get("clave2")); // aqui sera el valor 2
    }
}
