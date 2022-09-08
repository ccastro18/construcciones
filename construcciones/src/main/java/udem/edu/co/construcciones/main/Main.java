/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.construcciones.main;

import udem.edu.co.construcciones.clases.Apartamento;
import udem.edu.co.construcciones.clases.Casa;
import udem.edu.co.construcciones.clases.Edificio;
import udem.edu.co.construcciones.interfaces.Construccion;

import java.util.ArrayList;
import java.util.List;
import udem.edu.co.construcciones.interfaces.Construccion;

/**
 *
 * @author USUARIO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Construccion> construcciones = new ArrayList<Construccion>();
        Construccion construccion1 = new Apartamento("apartamento");
        Construccion construccion2 = new Casa("mi casa");
        Construccion construccion3 = new Edificio(5,"edificio santafe");
        construcciones.add(construccion1);
        construcciones.add(construccion3);
        construcciones.add(construccion2);
        System.out.println("<construccion>"+construcciones+"</construccion>");
    }
    
}
