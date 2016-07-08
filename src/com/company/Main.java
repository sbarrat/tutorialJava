package com.company;


public class Main {

    public static void main(String[] args) {
        String directorioActual = System.getProperty("user.dir");
        Lectura lectura = new Lectura(directorioActual + "/fichero");
        System.out.println("Antes");
        lectura.leeFichero();
        lectura.cierraFichero();
        Escritura escritura = new Escritura(directorioActual + "/fichero", true);
        escritura.escribe("Hola");
        escritura.cierraFichero();
        System.out.println("Despues");
        lectura.leeFichero();
        Escritura nuevo = new Escritura(directorioActual + "/nuevo", false);
        nuevo.escribe("Nuevo fichero");
        nuevo.cierraFichero();
        Lectura nueva = new Lectura(directorioActual + "/nuevo");
        System.out.println("Este es el contenido del nuevo fichero");
        nueva.leeFichero();
        nueva.cierraFichero();
        nueva.borraFichero();
    }
}
