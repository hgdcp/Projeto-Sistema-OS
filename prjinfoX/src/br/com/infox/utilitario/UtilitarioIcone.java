package br.com.infox.utilitario;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class UtilitarioIcone {
    public void InserirIcone(JFrame frm){
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/br/com/infox/icones/letra-x-240.jpg"));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}
