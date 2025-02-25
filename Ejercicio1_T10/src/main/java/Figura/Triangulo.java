
package Figura;

public class Triangulo extends Figura{
    private double b;
    private double h;

    public Triangulo() {
    }

    public Triangulo(double x, double y, double b, double h) {
        super(x,y);
        this.b = b;
        this.h = h;
    }

    @Override
    public double calcularArea() {
       double respuesta = (b*h) / 2;
       return respuesta;
    }
    
    
    
}
