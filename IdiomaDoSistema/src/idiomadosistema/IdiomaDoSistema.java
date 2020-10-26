/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomadosistema;

import java.util.Locale;

/**
 *
 * @author fbazm
 */
public class IdiomaDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // usa da biblioteca Locale para obter a lingua do sistema operacional 
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é: " + loc.getDisplayLanguage());
    }
    
}
