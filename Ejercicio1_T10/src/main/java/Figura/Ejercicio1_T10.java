
package Figura;

public class Ejercicio1_T10 {

    public static void main(String[] args) {
       Figura rectangulo = new Rectangulo(5,5,5,5);
       Figura triangulo = new Triangulo(5,55,5,5);
       
       rectangulo.calcularArea();
       System.out.println("");
       triangulo.calcularArea();
    }
}
