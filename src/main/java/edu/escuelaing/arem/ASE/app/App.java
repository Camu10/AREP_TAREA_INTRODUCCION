package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.app.calculadora.Calculos;
import edu.escuelaing.arem.ASE.app.model.LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Hello world!
 *
 */
public class App 
{
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

    public static void calcular(LinkedList<Double> elementos){
        double mean = Calculos.mean(elementos);
        double deviation = Calculos.deviation(elementos);
        System.out.println("Mean: " + mean + " Deviation: "+ deviation);
    }
}
