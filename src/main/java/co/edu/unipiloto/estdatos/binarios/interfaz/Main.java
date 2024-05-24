package co.edu.unipiloto.estdatos.binarios.interfaz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("data/ejemplo.properties"));

            String valoresString = properties.getProperty("preorden");

            String[] valoresArray = valoresString.split(",");

            int[] valores = new int[valoresArray.length];
            for (int i = 0; i < valoresArray.length; i++) {
                valores[i] = Integer.parseInt(valoresArray[i]);
            }

            ArbolBin arbol = new ArbolBin();
            arbol.reconstruirArbol(valores);

            System.out.println("Recorrido Preorden del Árbol Binario:");
            arbol.imprimirPreOrden();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            properties.load(new FileInputStream("data/ejemplo.properties"));

            String valoresString = properties.getProperty("inorden");

            String[] valoresArray = valoresString.split(",");

            int[] valores = new int[valoresArray.length];
            for (int i = 0; i < valoresArray.length; i++) {
                valores[i] = Integer.parseInt(valoresArray[i]);
            }

            ArbolBin arbol = new ArbolBin();
            arbol.reconstruirArbol(valores);

            System.out.println("Recorrido Inorden del Árbol Binario:");
            arbol.imprimirInOrden();

        } catch (IOException e) {
            e.printStackTrace();
        }
}
}

