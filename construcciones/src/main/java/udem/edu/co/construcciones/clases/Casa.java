package udem.edu.co.construcciones.clases;

import udem.edu.co.construcciones.abstrac.UnPiso;
import udem.edu.co.construcciones.interfaces.Construccion;

public class Casa extends UnPiso implements Construccion {
    private String nombre;

    public Casa(String nombre) {
        this.nombre = nombre;
        super.setAncho(25);
        //aqui podrian ir mas cosas pero aja
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
                ;
    }
}
