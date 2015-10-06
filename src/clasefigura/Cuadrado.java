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
public class Cuadrado extends Figura {
    protected double ancho;

    public void Cuadrado(Punto origen, double ancho) {
        super.Figura(origen);
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + super.toString() + ", ancho=" + this.ancho + '}';
    }
    
    @Override
    protected double area() {
        return Math.pow(this.ancho, 2);
    }

    @Override
    protected double perimetro() {
        return 4 * this.ancho;
    }

    @Override
    protected void escalar(double n) {
        this.ancho *= n;
    }
    
}