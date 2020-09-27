
package Palindromo;

import java.util.Stack;


public class ExpresionAritmetica {
    public static void man(String[] args) {
        // TODO code application logic here
        String cadenano = "2*[(a+b)/2.5 + x - 7*y";
        String cadenasi = "((a+b)*5) - 7";
        System.out.println("Cadena erronea: "+cadenano);
        System.out.println("Cadena correcta: "+cadenasi);
        System.out.println("Verificando parentesis para cadenano");
        System.out.println("LA VERIFICACION DE cadenano  DIO COMO RESULTADO " +verificarExpresion(cadenano));
        System.out.println("Verificando parentesis para cadenasi");
        System.out.println("LA VERIFICACION DE cadenasi  DIO COMO RESULTADO " +verificarExpresion(cadenasi));
        
    }
    
    
    public static boolean verificarExpresion(String cadena){
        return verificarParentesisEnExpresion(cadena) == true && verificarCorchetesEnExpresion(cadena) == true;
    }
    
    public static boolean verificarParentesisEnExpresion(String cadena){
        Stack <String> pila = new Stack<>();
        int i=0;
        while(i< cadena.length()){
            if(cadena.charAt(i)=='('){ //Se pregunta si el parentesis es de abertura
                pila.push("(");//Al ser parentesis de apertura, se lo ingresa a la pila
            }
            else if (cadena.charAt(i)== ')'){
                if(!pila.empty()){//Si no esta vacia, se saca un elemento
                    pila.pop();
                }
                else{
                    pila.push(")");//la pila no puede empezar con un parentesis de cierre
                    break;//rompe proceso de verificacion
                }
            }
            i++;
        }
        return pila.empty();
    }
    
    public static boolean verificarCorchetesEnExpresion(String cadena){
        Stack <String> pila = new Stack<>();
        int i=0;
        
        while(i< cadena.length()){
            if(cadena.charAt(i) == '['){
                pila.push("[");
            }
            else if (cadena.charAt(i) == ']'){
                if(!pila.empty()){
                    pila.pop();
                }
                else{
                    pila.push("]");
                    break;
                }
            }
            i++;
        }
        return pila.empty();
    }
}
