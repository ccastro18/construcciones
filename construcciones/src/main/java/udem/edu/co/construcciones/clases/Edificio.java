package udem.edu.co.construcciones.clases;

import udem.edu.co.construcciones.abstrac.MasUnPiso;
import udem.edu.co.construcciones.interfaces.Construccion;

public class Edificio extends MasUnPiso implements Construccion {
    private String nombre;


    public Edificio(int pisos, String nombre) {
        super(pisos);
        super.setAlto(12);
        super.setArea(320);
        super.setLatitud(-456);
        this.nombre = nombre;
    }


    //getters and setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "<construccion>"
                +super.toString()
                +"<nombre>"+nombre+"</nombre>"
                +"</construccion>";
    }
}
