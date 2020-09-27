
package Palindromo;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Deber_Palindromo {

    
    public static void man(String[] args) {
        compararCaracteres();
    }
    public static void compararCaracteres(){
        Pila newPila;
		boolean band;
		String palindromo;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
	try {
		newPila = new Pila(); 
		System.out.print("Ingresa la palabra a verificar si es palíndromo: ");
		palindromo = entrada.readLine().toLowerCase(); 
	
		for (int i = 0; i < palindromo.length(); ) {
		Character c;
		c = palindromo.charAt(i++);
		newPila.PutOn(c);

		}
        // se comprueba si es palíndromo
	band = true;
	for (int j = 0; band && !newPila.EmptyPila(); ) {
		Character c;
		c = (Character) newPila.PutAway();
		band = palindromo.charAt(j++) == c.charValue();
		}
	newPila.ClearPila();
		if (band)
			System.out.println("La palabra " + " "+palindromo+" " + " es un palíndromo ");
		else
			System.out.println("La palabra " + " "+palindromo+" " + " no es un palíndromo ");
		}
		catch (Exception error)
		{
			System.err.println("Excepcion: " + error);
		}
    }
}
