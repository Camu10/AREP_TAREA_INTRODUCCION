package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.app.calculadora.Calculos;
import edu.escuelaing.arem.ASE.app.model.LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;

public class App {
    /**
     * Metodo principal de la clase App.
     * @param args Lista de los elementos que se quieren evaluar.
     */
    public static void main( String[] args ) {
        try {
            LinkedList<Double> elementos;
            String sCadena;
            BufferedReader bf = new BufferedReader(new FileReader("data.txt"));
            double n;
            while ((sCadena = bf.readLine())!=null) {
                elementos = new LinkedList<Double>();
                String[] lista = sCadena.split(" ");
                for (String elemento: lista){
                    n = Double.parseDouble(elemento);
                    elementos.add(n);
                }
                calcular(elementos);
            }
            bf.close();
        }catch (Exception  e){
            System.out.println("Error.");
        }
    }

    /**
     * Obtiene la media y la desviación estandar de los datos ingresados.
     * @param elementos Lista que contiene los elementos a evaluar.
     */
    public static void calcular(LinkedList<Double> elementos){
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        double mean = Calculos.mean(elementos);
        double deviation = Calculos.deviation(elementos);
        System.out.println("Mean: " + twoDForm.format(mean) + " Deviation: "+ twoDForm.format(deviation));
    }
}
