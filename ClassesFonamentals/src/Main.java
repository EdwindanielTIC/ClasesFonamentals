import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Collection<String> nombres = new ArrayList<>();
        Collection<String> correos = new HashSet<>();

        nombres.add("Daniel");
        nombres.add("Ruben");
        nombres.add("Paco");

        correos.add("daniel.gonzalez@correoexample.com");
        correos.add("contacto.barcelona@correoexample.org");
        correos.add("inmobiliario.legal@correoexample.net");
        correos.add("inmobiliario.legal@correoexample.net");

        System.out.println("Nombres personas " + nombres.size());

        System.out.println("Contiene la lista contiene algun paco ? " + nombres.contains("Paco"));

        System.out.println("\nElemento en la coleccion :  ");

        for (String x : nombres) {

            System.out.print(x + " , ");

        }

        nombres.remove("Daniel");

        System.out.println("Despues de eliminar a Daniel : " + nombres + " \n");

        System.out.println("\ntotal de correo " + correos.size()); // en pantalla me apareceran 3, pero en reazlidad
        // tenemos 4, hascode no permite duplicados

        for (String emails : correos) {
            System.out.println(emails);
        }
    }

}
