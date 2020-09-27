
package ArrayLista;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

     public static void cargarDatos(ArrayList misAutos){
        Scanner in = new Scanner(System.in);
        
        String opc = null;
        String ma,mo,c,p;
        long ns; int anio;
        do{
            System.out.print("\nNumero de serie: "); ns = in.nextLong();
            System.out.print("\nMarca: "); ma = in.next();
            System.out.print("\nModelo: "); mo = in.next();
            System.out.print("\nColor: "); c = in.next();
            System.out.print("\nPlaca: "); p = in.next();
            System.out.print("\nAnio: "); anio = in.nextInt();
            System.out.println("\n\n");
            System.out.print("\n\nDesea continuar? (S/N): "); opc = in.next();
            misAutos.add(new Auto(ns,ma,mo,c,p,anio));
        }while("si".equals(opc) || "SI".equals(opc) || "Si".equals(opc) || "S".equals(opc)|| "s".equals(opc));
        
    }
    
    public static void mostrarDatos(ArrayList misAutos){
        for(int i =0;i<misAutos.size();i++){
            System.out.println(misAutos.get(i)+ "  ");
        }
    }
    
    
    public static void man(String[] args) {
        ArrayList<Auto> misAutos = new ArrayList<>();
        cargarDatos(misAutos);
        mostrarDatos(misAutos);
        
    }
    
}
