
import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorylist {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Daniel");
        nombres.add("Laura");
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Sofía");
        // creamos la lista y la hemos imprimido
        System.out.println("Lista original:");
        System.out.println(nombres);
        // mediante el interator voy a recorrer la lista
        Iterator<String> iterator = nombres.iterator();
        System.out.println("\nElementos recorridos usando Iterator:");
        while (iterator.hasNext()) {
            String nombre = iterator.next();
            System.out.println(nombre);
        }

        // voy a buscar de la lista el elemento carlos y para ello voy a utilizar el
        // iteratos la voy a imprimir y despues vou a elimnar
        iterator = nombres.iterator();
        String elementoAEliminar = "Carlos";
        while (iterator.hasNext()) {
            String nombre = iterator.next();
            if (nombre.equals(elementoAEliminar)) {
                System.out.println("\nEliminando: " + nombre);
                iterator.remove();
            }
        }

        System.out.println("\nLista después de eliminar '" + elementoAEliminar + "':");
        System.out.println(nombres);

        nombres.add("María");
        System.out.println("\nLista después de agregar 'María':");
        System.out.println(nombres);

        System.out.println("\nElementos finales en la lista:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}