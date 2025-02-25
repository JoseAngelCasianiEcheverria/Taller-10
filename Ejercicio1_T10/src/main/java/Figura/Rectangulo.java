
package Figura;

public class Rectangulo extends Figura{
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura, double x, double y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }
    

    @Override
    public double calcularArea() {
        double resultado = base * altura;
        return resultado;
    }
}
