package udem.edu.co.construcciones.clases;

import udem.edu.co.construcciones.abstrac.UnPiso;
import udem.edu.co.construcciones.interfaces.Construccion;

public class Apartamento extends UnPiso implements Construccion {
    private String nombre;

    public Apartamento(String nombre) {
        this.nombre = nombre;
        super.setLongitud(129);
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
        return
                super.toString()
                +"<nombre>"+nombre+"</nombre>"
                +"</UnPiso>";
    }
}
