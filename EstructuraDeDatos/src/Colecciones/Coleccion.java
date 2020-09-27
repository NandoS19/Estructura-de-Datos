
package Colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Coleccion {
    
    public static void mn(String[] args){
        Set<Integer> conjunto1 = new HashSet<>();
        conjunto1.add(20);
        conjunto1.add(1);
        conjunto1.add(10);
        conjunto1.add(5);
        conjunto1.remove(5);
        //No se debe repetir los numeros, aunque lo ponga, el programa los va a ignorar
        System.out.println("La presentacion con orden no es segura");
        for(int elemento:conjunto1){
            System.out.println(elemento+" , "); 
        }
        System.out.println();
        
        
        Set<Integer> conjunto2 = new TreeSet<>();
        conjunto2.add(20);
        conjunto2.add(1);
        conjunto2.add(10);
        conjunto2.add(5);
        conjunto2.remove(10);
         //No se debe repetir los numeros, aunque lo ponga, el programa los va a ignorar
         //Los datos se ordenaran en forma ascendente
         System.out.println("La presentacion con orden  es segura");
         for(int elemento:conjunto2){
             System.out.println(elemento+" , "); 
         }
         System.out.println();   
        
        Set<Integer> conjunto3 = new LinkedHashSet<>();
        conjunto3.add(20);
        conjunto3.add(1);
        conjunto3.add(10);
        conjunto3.add(5);
        conjunto3.remove(20);
         //No se debe repetir los numeros, aunque lo ponga, el programa los va a ignorar
         //Los datos se mostraran en forma que se van guardando
         System.out.println("La presentacion con orden  es segura");
         for(int elemento:conjunto3){
             System.out.println(elemento+" , "); 
         }
         System.out.println();
         
    }
    
}
