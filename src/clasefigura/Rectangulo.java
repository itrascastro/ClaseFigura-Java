/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasefigura;

/**
 *
 * @author ismael trascastro
 */
public class Rectangulo extends Cuadrado {
    private double alto;

    public Rectangulo(Punto origen, double ancho, double alto) {
        super.Cuadrado(origen, ancho);
        this.alto = alto;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    @Override
    protected void escalar(double n) {
        super.escalar(n); //To change body of generated methods, choose Tools | Templates.
        this.alto *= n;
    }

    @Override
    protected double perimetro() {
        return this.ancho * 2 + this.alto * 2;
    }

    @Override
    protected double area() {
        return this.ancho * this.alto;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + super.toString() + ", alto=" + alto + '}';
    }
}
