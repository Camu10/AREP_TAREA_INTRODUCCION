package edu.escuelaing.arem.ASE.app.calculadora;

import  edu.escuelaing.arem.ASE.app.model.LinkedList;

public class Calculos {

    public static double mean(LinkedList<Double> list){
        double cont = 0;
        for(int i =0; i<list.getSize(); i++){
            cont += list.get(i);
        }
        return cont / list.getSize();
    }

    public static double deviation(LinkedList<Double> list){
        double mean = mean(list);
        double cont = 0;

        for(int i=0;i<list.getSize();i++){
            cont += Math.pow((list.get(i)-mean),2);
        }
        double res = Math.sqrt(cont/(list.getSize()-1));
        return res;
    }
}
