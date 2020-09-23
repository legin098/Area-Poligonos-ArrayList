package Poligonos;
/**
 *
 * @author Jesus Cruz
 */
public abstract class Poligono {
    
    protected int numerolados;

    public Poligono(int numerolados) {
        this.numerolados = numerolados;
    }

    public int getNumerolados() {
        return numerolados;
    }
    
    @Override
    public String toString() {
        return "Numero de lados =" + numerolados;
    }
    //metodo area como abstracto
    public abstract double area();
    
}
