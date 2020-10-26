/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resoluçãodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author fbazm
 */
public class ResoluçãoDaTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // usa da biblioteca Toolkit para gerar um kit de ferramentas padrão chamado tk.
        Toolkit tk = Toolkit.getDefaultToolkit();
        //usa da biblioteca Dimension para receber a dimensão da tela retornada pelo
        //kit de ferramentas tk, e o armazena em varios atributos, como largura, altura da tela.
        Dimension d = tk.getScreenSize();
        //imprime no terminal formatado a resolução da tela.
        System.out.println("A resolução da tela é de: " + d.width + " X " + d.height);
    }
    
}
