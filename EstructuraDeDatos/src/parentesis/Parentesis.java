
package parentesis;

import java.util.Stack;


public class Parentesis {

    
    public static void man(String[] args) {
        // TODO code application logic here
        String cadenano = "(Cadena no equilibrada en parentesis (()()()))))";
        String cadenasi = "(Cadena no equilibrada en parentesis ())";
        System.out.println("Verificando parentesis para cadenano");
        System.out.println("LA VERIFICACION DE cadenano  DIO COMO RESULTADO " +verificarParentesis(cadenano));
        System.out.println("Verificando parentesis para cadenasi");
        System.out.println("LA VERIFICACION DE cadenasi  DIO COMO RESULTADO " +verificarParentesis(cadenasi));
        
    }
    
    
    public static boolean verificarParentesis(String cadena){
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
}
