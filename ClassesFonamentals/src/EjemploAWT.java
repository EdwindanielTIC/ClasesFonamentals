import java.awt.*;
import java.awt.event.*;

// con el siguinete codigo, voy a crear una ventana un frame , voy añadir un boton y una etiqueta 
// al hacer click en el boton, va a cambiar de etiqueta y mediante el windowListener se manejara el cierre
public class EjemploAWT {
    public static void main(String[] args) {
        // Creamps una instancia del frame
        Frame ventana = new Frame("Ejemplo AWT");

        // Creamos el boton mediante button y le ponemos un texto
        Button boton = new Button("Haz clic aqui");

        // Creamos una etiqueta
        Label etiqueta = new Label("crack, estamos esperando el click.....");

        // Con lo siguiente voy a establecer el tamaño del boton
        boton.setBounds(100, 100, 100, 30);
        etiqueta.setBounds(100, 150, 200, 30);

        // Añadir un listener al botón , que cuando se presones aparecera una indicacion
        // de que ha sido presionado
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("¡Botón presionado!");
            }
        });

        // Añadir componentes a la ventana
        ventana.add(boton);
        ventana.add(etiqueta);

        ventana.setSize(400, 300); // con esto se le indica el tamaño de la ventana
        ventana.setLayout(null); // Layout absoluto
        ventana.setVisible(true); // Mostrar ventana

        // Cerrar la ventana correctamente para que no nos de ningun erro
        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                ventana.dispose(); // Cierra la ventana
            }
        });
    }
}
