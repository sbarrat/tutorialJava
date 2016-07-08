package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lectura {

    private File fichero = null;
    private Scanner lector = null;
    /**
     * Crea el objeto Lectura
     * @param ficheroLectura fichero que vamos a leer
     */
    public Lectura(String ficheroLectura)
    {
        this.fichero = new File(ficheroLectura);
    }

    /**
     * Lee el fichero y muestra por pantalla linea a linea
     */
    public void leeFichero()
    {
        if (this.fichero.isFile()) {
            try {
                this.lector = new Scanner(this.fichero);
                while (this.lector.hasNextLine()) {
                    String linea = this.lector.nextLine();
                    System.out.println(linea);
                }
            } catch (FileNotFoundException exception) {
                System.out.println("Error: " + exception.getMessage());
            }
        }
    }

    /**
     * Cerramos el scanner de lectura
     */
    public void cierraFichero()
    {
        this.lector.close();
    }

    /**
     * Borra el fichero
     */
    public void borraFichero()
    {
        String nombreFichero = fichero.getName();
        String mensaje = "No se ha podido borrar el fichero " + nombreFichero;
        if (this.fichero.delete()) {
            mensaje = "Fichero " + nombreFichero + " Borrado";
        }
        System.out.println(mensaje);
    }
}
