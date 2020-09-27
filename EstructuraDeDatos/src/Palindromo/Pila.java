
package Palindromo;



public class Pila {
    private static final int Pilasize = 100;
	private int tope;
	private Object [] elementosEnPila;
	
	public Pila() {
		
		tope = -1;
		elementosEnPila = new Object[Pilasize];
        }
	
    public void PutOn(Object elemento) throws Exception {
	
	if (FullPila()) {
		throw new Exception("Desbordamiento pila");
	}
	tope++;
	elementosEnPila[tope] = elemento;
    }

    public Object PutAway() throws Exception {
	Object aux;
	
	if (EmptyPila()) {
		throw new Exception ("Pila vacía, no se puede extraer.");
	}
	aux = elementosEnPila[tope];
	tope--;
	return aux;
    }

    public Object TopePila() throws Exception {
	
	if (EmptyPila()) {
		throw new Exception ("Pila vacía, no se puede extraer.");
	}
	return elementosEnPila[tope];
    }

    public boolean EmptyPila() {
	return tope == -1;
    }

    public boolean FullPila() {
	return tope == Pilasize-1;
    }

    public void ClearPila() {
	tope = -1;
    }
    
    
}
