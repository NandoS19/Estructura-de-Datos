
package EstructuraDeDatos;

import java.util.Scanner;


public class Array {
    
    public static void ordenarArreglo(int s[], int limite){
        int aux;
        for(int i=0;i<limite;i++){
            for(int j=0;j<limite-i-1;j++){
                if(s[j+1]<s[j]){
                    aux = s[j+1];
                    s[j+1] = s[j];
                    s[j] = aux;
                }
            }
        }
        
    }
    
    public static void ingresarArreglo(int sueldo[], int limite){
        Scanner in = new Scanner(System.in);
        for(int i=0;i<limite;i++){
            System.out.print((i+1)+") Ingrese los sueldos: ");
            sueldo[i] = in.nextInt();
        }
        System.out.println();
    }
    
    public static void mostrarArreglo(int sueldo[], int limite){
        for(int i=0;i<limite;i++){
            System.out.println("Datos en casilla "+(i+1)+" : "+sueldo[i]);
        }
    }
    
    public static void ramdomArreglo(int s[], int limite){
        for(int i=0;i<limite;i++){
            //int M = limite,m = 0;
            int aleatorio = (int)Math.floor(Math.random()*100);
            s[i] = aleatorio;
        }
    }
    
    public static void consultarDato(int s[]){
        boolean band = false;
        int pos = -1, i =0;
        int dato;
        Scanner in = new Scanner (System.in);
        System.out.print("Ingrese el dato a buscar: ");
        dato = in.nextInt();
        while(i < s.length && band == false){
            if(s[i] == dato){
                pos = i;
                band = true;
            }
            i++;
        }
        if(band == true){
            System.out.println("\nEl dato "+dato+" fue encontrado en la posicion "+pos);
        }
        else{
            System.out.println("\nEl dato no fue encontrado");
        }
    }
    
    public static void quiebreControl(int s[]){
        int anterior = s[0], contador = 0, i=0;
        while(i<s.length){
            if(anterior == s[i]){
                contador++;
            }
            else{
                System.out.println("El numero "+anterior+" se repitio "+contador+" veces.");
                 anterior = s[i];
                 contador = 1;
            }
            i++;
        }
    }
    
    public static void menu(int s[], int LIMITE){
        int opc;
        Scanner in = new Scanner(System.in);
        do{
        System.out.println("\t\t\tMenu Principal\n");
        System.out.println("1) Cargar vector: ");
        System.out.println("2) Ordenar vector: ");
        System.out.println("3) Mostrar vector: ");
        System.out.println("4) Buscar un elemento en el arreglo");
        System.out.println("5) Quiebre de control");
        System.out.println("7) Salir: ");
        System.out.print("Digite una opcion: ");
        opc = in.nextInt();
        
        switch(opc){
            case 1: ramdomArreglo(s,LIMITE); break;
            case 2: ordenarArreglo(s,LIMITE); break;
            case 3: mostrarArreglo(s,LIMITE);System.out.println(); break;
            case 4: consultarDato(s); System.out.println(); break;
            case 5: quiebreControl(s); System.out.println(); break;
            case 7: break;
            default: System.out.println("Opcion no reconocida."); break;
        }
        }while(opc !=7);
    }
    
    public static void min(String[] args){
        final int MAX = 20;
        int sueldos[] = new int[MAX];
        menu(sueldos,MAX);
        //ramdomArreglo(sueldos,MAX);
        //ingresarArreglo(sueldos,MAX);
        //ordenarArreglo(sueldos,MAX);
        //mostrarArreglo(sueldos,MAX);
    }
    
    
}
