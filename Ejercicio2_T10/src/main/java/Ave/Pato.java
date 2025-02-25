
package Ave;

public class Pato implements Volador, Nadador{

    @Override
    public void Volar() {
        System.out.println("SOY UN PATO Y PUEDO VOLAR");
    }

    @Override
    public void Nadar() {
        System.out.println("SOY UN PATO Y ME GUSTA NADAR");
    }
    
}
