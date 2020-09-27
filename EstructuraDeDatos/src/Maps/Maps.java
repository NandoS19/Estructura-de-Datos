package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {
    
    
    public static Map<Character,Integer> contadorCarac(String frase){
        Map<Character,Integer> contador = new HashMap<>();
        
        frase = frase.toUpperCase();
        
        for(int i=0;i<frase.length();i++){
            Character caracter = frase.charAt(i);
            if(contador.containsKey(caracter)){
                Integer valor = contador.get(caracter);
                valor++;
                contador.put(caracter, valor);
            }
            else{
                contador.put(caracter, 1);
            }
        }
        return contador;
    }
    
    public static void mostrarCaracteres (Map<Character,Integer> lista_caracteres){
        Character clave;
        Iterator<Character> caracter = lista_caracteres.keySet().iterator();
        
        while(caracter.hasNext()){
            clave = caracter.next();
            System.out.println(clave+" - "+ lista_caracteres.get(clave));
        }
    }
    
    public static void n(String[] args){
        Map<Character,Integer> cont = new HashMap<>();
        cont = contadorCarac("Abad es un cojudo");
        System.out.println(cont);
    }
}
