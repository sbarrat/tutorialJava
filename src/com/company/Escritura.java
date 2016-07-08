package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Escritura {
    private FileWriter fichero = null;

    /**
     * Constructor de clase
     * @param ficheroEscritura nombre del fichero
     * @param agregar true si agrega false si sobreescribe
     */
    public Escritura(String ficheroEscritura, Boolean agregar)
    {
        try {
            this.fichero = new FileWriter(ficheroEscritura, agregar);
        } catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

    /**
     * Escribe el texto
     * @param texto
     */
    public void escribe(String texto)
    {
        if (fichero != null) {
            try {
                this.fichero.write(texto + System.getProperty("line.separator"));
            } catch (IOException exception) {
                System.out.println("Error: " + exception.getMessage());
            }
        }
    }

    /**
     * Cierra el fichero
     */
    public void cierraFichero()
    {
        try {
            this.fichero.close();
        } catch (IOException exception) {
            System.out.print("Error: " + exception.getMessage());
        }
    }

}
