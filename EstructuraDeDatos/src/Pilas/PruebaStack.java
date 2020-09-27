
package Pilas;

import java.util.Stack;


public class PruebaStack {

    
    public static void mn(String[] args) {
        // TODO code application logic here
        
        Stack<String> pila1 = new Stack<>();
        
        System.out.println("Se insertan 3 elementos a la pila: Juan,Sara,Pedro");
        pila1.push("Juan");
        pila1.push("Sara");
        pila1.push("Pedro");
        System.out.println("Total de elementos en la pila: "+pila1.size());
        System.out.println("Extraccion de elemento de la pila "+pila1.pop());
        System.out.println("Total de elementos en la pila: "+pila1.size());
        System.out.println("Consulta el primer elemento de la pila sin extraerlo: "+pila1.peek());
        System.out.println("Total de elementos en la pila: "+pila1.size());
        System.out.println("Extraemos los elementos de la pila mientras no este vacia...");
        while(!pila1.isEmpty()){
            System.out.println(pila1.pop()+"  ");
        }
        System.out.println("\n\n");
        Stack<Integer> pila2 = new Stack<>();
        pila2.push(70);
        pila2.push(120);
        pila2.push(14);
        pila2.push(86);
        
        System.out.println("Total de elementos en la pila2 : "+pila2.size());
        System.out.println("Borrando contenido de la pila");
        pila2.clear();
        System.out.println("\nTotal de elementos en la pila: "+pila2.size());
    }
    public static void DeberPila(){
        Stack<String> CD = new Stack<>();
        System.out.println("Insertando discos en la pila");
        CD.push("Album 1");
        CD.push("Album 2");
        CD.push("Album 3");
        System.out.println("Total de elementos en la pila: "+CD.size());
        System.out.println("Extraccion de elemento de la pila "+CD.pop());
        System.out.println("Total de elementos en la pila: "+CD.size());
        System.out.println("Consulta el primer elemento de la pila sin extraerlo: "+CD.peek());
        System.out.println("Total de elementos en la pila: "+CD.size());
        System.out.println("Extraemos los elementos de la pila mientras no este vacia...");
        while(!CD.isEmpty()){
            System.out.println(CD.pop()+"  ");
        }
    }
    
    public static void man(String[] args){
        DeberPila();
    }
}
