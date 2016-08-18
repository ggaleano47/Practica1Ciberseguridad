/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.ArrayList;

/**
 *
 * @author jhonatan
 */
public class Frase {

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setDiferencia(ArrayList<String> diferencia) {
        this.diferencia = diferencia;
    }

    public String getFrase() {
        return frase;
    }

    public ArrayList<String> getDiferencia() {
        return diferencia;
    }
    
    private String frase;
    private ArrayList<String> diferencia;
    
    
}
