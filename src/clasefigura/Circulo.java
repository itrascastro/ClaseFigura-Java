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
public class Circulo extends Figura {
    private int radio;
    
    public Circulo(Punto origen, int radio) {
        super.Figura(origen);
        this.radio = radio;
    }

    @Override
    protected double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    protected double perimetro() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    protected void escalar(double n) {
        this.radio *= n;
    }

    @Override
    public String toString() {
        return "Circulo{" + super.toString() + ", radio=" + this.radio + '}';
    }
    
}
