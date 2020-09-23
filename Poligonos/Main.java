package Poligonos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Jesus Cruz
 */
public class Main {
    
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    
    public static void main(String[] args) {
        //llenar poligono
        llenar_poligono();
        
        //mostrar datos y area de cada poligono
        mostrar_resultados();
    }
    
    public static void llenar_poligono(){
        int opcion;
        char respuesta = 0;
        do{
            try{
                do{
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite que poligono desea\n\n1. Triangulo\n2. Rectangulo\n\nOpcion:"));
                }while(opcion<1 || opcion>2);

                switch(opcion){

                    case 1: llenar_triangulo();//llenar un triangulo
                            break;
                    case 2: llenar_rectangulo();//llena rectangulo
                            break;
                }

                respuesta = JOptionPane.showInputDialog("Desea introducir otro poligono (s/n)").charAt(0);
         
             }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Muchas gracias.");
            }
             
        }while(respuesta == 's' || respuesta == 'S');
    }
    
    public static void llenar_triangulo(){
        double lado1,lado2,lado3;
        
        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el lado1 del triangulo: "));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el lado2 del triangulo: "));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite el lado3 del triangulo: "));
        
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        //guardar triangulo en el arreglo de poligonos
        poligono.add(triangulo);
    }
    
    public static void llenar_rectangulo(){
    double lado1,lado2;
        
        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el lado1 del rectangulo: "));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el lado2 del rectangulo: "));
        
        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        //guardar rectangulo en el arreglo de poligonos
        poligono.add(rectangulo);
    }
    
    public static void mostrar_resultados(){
        
        for (Poligono poli: poligono) {
            JOptionPane.showMessageDialog(null,poli.toString() + "\n" + "Area: "+poli.area() + "\n" + "\n");
        }
    }
}
