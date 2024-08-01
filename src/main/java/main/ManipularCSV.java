package main;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samu
 */
public class ManipularCSV {
    private BufferedReader lector;
    private String linea;
    private List<String[]> filas = new ArrayList<>();
    
    public void leerArchivo(String nombreArchivo) {
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(",");
                filas.add(partes);
            }

            lector.close();
            
            // Construir el mensaje para la ventana emergente
            String mensajeCompleto = construirMensaje();
            
            // Mostrar toda la información en un cuadro de diálogo
            JOptionPane.showMessageDialog(null, "<html><pre>" + mensajeCompleto + "</pre></html>");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
        }
    }
    
    private String construirMensaje() {
        StringBuilder mensajeCompleto = new StringBuilder();
        int[] maxColWidths = obtenerAnchosMaximos();

        for (String[] fila : filas) {
            for (int i = 0; i < fila.length; i++) {
                mensajeCompleto.append(String.format("%-" + (maxColWidths[i] + 2) + "s", fila[i]));
            }
            mensajeCompleto.append("\n");
        }

        return mensajeCompleto.toString();
    }

    private int[] obtenerAnchosMaximos() {
        int numCols = filas.get(0).length;
        int[] maxColWidths = new int[numCols];

        for (String[] fila : filas) {
            for (int i = 0; i < fila.length; i++) {
                if (fila[i].length() > maxColWidths[i]) {
                    maxColWidths[i] = fila[i].length();
                }
            }
        }

        return maxColWidths;
    }

    
}
