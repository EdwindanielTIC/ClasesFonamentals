import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EjemploListIterator {
    public static void main(String[] args) {

        // a continuacion voy a crear una lista
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");

        // Obtenemos el ListIterator
        ListIterator<String> iterador = frutas.listIterator();

        System.out.println("Recorriendo hacia adelante:");
        while (iterador.hasNext()) {
            String fruta = iterador.next();
            System.out.println(fruta);

            // Si encontramos "Banana", agregamos otra fruta después
            if (fruta.equals("Banana")) {
                iterador.add("Durazno"); // Agrega después de "Banana"
            }
        }

        System.out.println("\nRecorriendo hacia atrás:");
        while (iterador.hasPrevious()) {
            System.out.println(iterador.previous());
        }
    }
}
