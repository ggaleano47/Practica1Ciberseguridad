/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhonatan
 */
public class BabageModel {

    public static ArrayList<Frase> buscarRepetidos(String texto) {

        ArrayList<Frase> listaFrases = new ArrayList<>();
        int cantMin = 4;
        //itera analizando todas las letras de tamaño 4 y luego 5 y asi sucesivamente
        try {
            for (int i = cantMin; i <= texto.length() - i; i++) {
                //recorrer el texto para capturar la frase
                try {
                    for (int j = 0; j <= texto.length() - i; j++) {
                        Frase frase = new Frase();
                        String fraseAnalizar = texto.substring((j), j + i);
                        ArrayList<String> distancia = new ArrayList<>();
                        //recorre todo el texto para comparar la frase escogida con todas las demas letras 
                        try {
                            int d = 0;
                            for (int k = j + i; k <= texto.length() - i; k++) {
                                String comparar = texto.substring(k, k + i);
                                if (fraseAnalizar.equals(comparar)) {
                                    //int d = k - i;
                                    distancia.add(String.valueOf(d));
                                }
                                d++;
                            }
                            if (distancia.size() > 0) {
                                frase.setFrase(fraseAnalizar);
                                frase.setDiferencia(distancia);
                                listaFrases.add(frase);
                            }
                        } catch (Exception e) {
                            System.out.println("Error en el for 3");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error en el for 2");
                }
            }
        } catch (Exception e) {
            System.out.println("Error en el for 1");
        }
        return listaFrases;
    }

    public static void main(String[] args) {
        String t = "asdfqasdfyasdfevtepevtemmasdfqzzzzhkzzzz";
        ArrayList<Frase> lf = buscarRepetidos(t);
    }

}
