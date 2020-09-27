
package EstructuraDeDatos;

import java.util.Calendar;
import java.util.Scanner;


public class Main {

    public static  Fecha Obj = new Fecha();
    public static  Scanner in = new Scanner(System.in);
    
    public static void Lectura(){
        System.out.print("\nIngrese el dia: ");
        Obj.setDia(in.nextInt());
        System.out.print("\nIngrese el mes: ");
        Obj.setMes(in.nextInt());
        System.out.print("\nIngrese el año: ");
        Obj.setAnio(in.nextInt());
    }
    
    public static void Reiniciar(){
        Obj.setDia(0);
        Obj.setMes(0);
        Obj.setAnio(0);
    }
    
    public static void Adelantar(){
        int diaActual = Obj.getDia();
        int mesActual = Obj.getMes();
        int anioActual = Obj.getAnio();
        
        Calendar oFecha = Calendar.getInstance();
        oFecha.set(anioActual, mesActual, diaActual);
        
        int dia=0,mes=0,anio=0;
        
        System.out.print("\nAdelante el dia: "); dia = in.nextInt();
        System.out.print("\nAdelante el mes: "); mes = in.nextInt();
        System.out.print("\nAdelante el anio: "); anio = in.nextInt();
        
        oFecha.add(Calendar.DAY_OF_MONTH, dia);
        oFecha.add(Calendar.MONTH, mes);
        oFecha.add(Calendar.YEAR, anio);
        
        Obj.setAnio(oFecha.get(Calendar.YEAR));
        Obj.setMes(oFecha.get(Calendar.MONTH));
        Obj.setDia(oFecha.get(Calendar.DAY_OF_MONTH));
        
    }
    
    public static void Imprimir(){
        System.out.println("\nSu dia es: "+Obj.getDia());
        System.out.println("\nSu mes es: "+Obj.getMes());
        System.out.println("\nSu anio es: "+Obj.getAnio());
    }
    
    public static void min(String[] args) {
        Lectura();
        Reiniciar();
        Imprimir();
        Lectura();
        Adelantar();
        Imprimir();
    }
    
}
