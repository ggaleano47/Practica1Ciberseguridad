/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author user
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Declaramos el objeto*/
        Menu miMenu;
        /**Instanciamos el objeto*/
        miMenu= new Menu();
        /**Enviamos el objeto como parametro para que sea unico
         * en toda la aplicación*/
         miMenu.setMenu(miMenu);
        /**Hacemos que se cargue la ventana*/
         miMenu.setVisible(true);
    }
    
}
