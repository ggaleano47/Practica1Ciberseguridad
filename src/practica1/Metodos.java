package practica1;

@SuppressWarnings("resource")
public class Metodos {

    public String procesoDES(int accion, String llave, String texto) throws Exception {
        // IHCkrmhA9Gs=
        //String llave = "IHCkrmhA9Gs";
        String textOperado = "";
        try {
            DES des = new DES(llave);
            // accion vale 1 para desencriptar y 2 para encriptar
            switch (accion) {
                case 1:

                    textOperado = des.decrypt(texto);
                    break;
                case 2:

                    textOperado = des.encrypt(texto);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Por favor ingrese una llave correcta");
        }
        return textOperado;
    }

    public String procesoTresDES(String llave, int accion, String texto) throws Exception {

         
	    
	    
	 	
        
        try {
            TresDES tresDes = new TresDES(llave);
            // accion vale 1 para desencriptar y 2 para encriptar
            switch (accion) {
                case 1:
                    //texto = new TresDES()._decrypt(texto, llave);
                    texto = tresDes.decrypt(texto);
                    break;
                case 2:
                    //texto = new TresDES()._encrypt(texto, llave);
                    texto = tresDes.encrypt(texto);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Por favor ingrese una llave correcta para 3DES");
        }
        return texto;
    }
}
