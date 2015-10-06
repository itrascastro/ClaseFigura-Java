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
public class ClaseFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto origen;
        
        origen = ClaseFigura.testPunto();
        ClaseFigura.testCirculo(origen);
        
        
    }
    
    public static Punto testPunto() {
        Punto p = new Punto(3,1);
        
        System.out.println(p);
        p.desplazar(4, 0);
        System.out.println(p);
        
        return p;
    }
    
    public static void testCirculo(Punto origen) {
        Circulo c = new Circulo(origen, 3);
        Circulo c1 = new Circulo(origen, 4);
        
        System.out.println(c1);
        
        System.out.println(Figura.numFiguras());
        System.out.println(c1.perimetro());
    }
    
}
