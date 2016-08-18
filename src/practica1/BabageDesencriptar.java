/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author jhonatan
 */
public class BabageDesencriptar {

    public static void main(String[] args) {
        String[][] matriz = new String[27][26];
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        matriz = llenarMatriz(matriz, alfabeto);
        String cifrado = "dpryev";
        String texto = desencriptar("king", matriz, cifrado);
    }

    public static String desencriptar(String clave, String[][] m, String textoCifrado) {
        String texto = "";
        int j = 0;
        for (int i = 0; i < textoCifrado.length(); i++) {
            if (j == clave.length()) 
                j = 0;            
            String letraTextoCifrado = String.valueOf(textoCifrado.charAt(i));
            String letraClave = String.valueOf(clave.charAt(j));
            int numeroFila = 0;
            int numeroColumna = 0;
            for (int k = 0; k < 26; k++) {
                if(m[k][0].equals(letraClave)){
                    numeroFila = k;
                    break;
                }
            }
            for (int k = 0; k < 25; k++) {
                if(m[numeroFila][k].equals(letraTextoCifrado)){
                    numeroColumna = k;
                break;
                }
            }
            j++;
            texto = texto + m[0][numeroColumna];
        }

        return texto;
    }

//llenar la matriz con el alfabeto    
    public static String cambiarAlfabeto(String a) {
        String n = "";
        for (int i = 1; i < a.length() ; i++) {
            if(n.equals("")){
                 n =  String.valueOf(a.charAt(i));
            }else{
            n = n + String.valueOf(a.charAt(i));
            }
        }
         n = n + String.valueOf(a.charAt(0));
        return n;
    }

    public static String[][] llenarMatriz(String[][] m, String alfabeto) {
        for (int i = 0; i < 27; i++) {
            int j = 0;
            try {
                for (j = 0; j < 26; j++) {
                    m[i][j] = String.valueOf(alfabeto.charAt(j));
                }
                int l2 = alfabeto.length();
                alfabeto = cambiarAlfabeto(alfabeto);
                int l =alfabeto.length();
                System.out.println("");
            } catch (Exception e) {
                System.out.println("j : " + j);
            }

        }

        return m;
    }

}
