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
public class Punto {
    private int x;
    private int y;
    
    public Punto() {
        this.x = 0;
        this.y = 0;
    }
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double distancia(Punto p) {
        int dx = this.x - p.getX();
        int dy = this.y - p.getY();
        
        return Math.sqrt(Math.pow(dx,2) + Math.pow(dy, 2));
    }
    
    public void desplazar(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + this.x + ", y=" + this.y + '}';
    }
}
