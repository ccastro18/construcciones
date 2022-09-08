/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.construcciones.abstrac;

/**
 *
 * @author USUARIO
 */
public  abstract class UnPiso {
    private int area;
    private int ancho;
    private int alto;
    private int latitud;
    private int longitud;
    private int pisos;

    //constructor

    public UnPiso() {
        this.pisos = 1;
    }

    //getters and setters


    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString(){
        return "<UnPiso>"
                +"<area>"+this.area+"</area>"
                +"<longitud>"+this.longitud+"</longitud>"
                +"<latitud>"+this.latitud+"</latitud>"
                +"<ancho>"+this.ancho+"</ancho>"
                +"<pisos>"+this.pisos+"</pisos>"
                +"<alto>"+this.alto+"</alto>";
    }
}
