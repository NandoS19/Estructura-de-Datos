
package ArrayLista;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayLista {
    
    public static void cargarDatos(ArrayList a){
        Scanner in = new Scanner(System.in);
        
        String auto = null, opc = null;
        
        do{
            System.out.print("\nIngrese el nombre del auto: "); auto = in.next();
            a.add(auto);
            System.out.print("\nDesea continuar? (S/N): "); opc = in.next();
        }while("si".equals(opc) || "SI".equals(opc) || "Si".equals(opc) || "S".equals(opc)|| "s".equals(opc));
        
    }
    
    public static void mostrarDatos(ArrayList a){
        for(int i =0;i<a.size();i++){
            System.out.println(a.get(i)+ "  ");
        }
    }
    
    public static void man(String[]args){
        ArrayList <String> autos = new ArrayList <>();
        cargarDatos(autos);
        mostrarDatos(autos);
    }
}
