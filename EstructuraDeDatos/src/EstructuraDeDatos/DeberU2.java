
package EstructuraDeDatos;

import java.util.Scanner;


public class DeberU2 {

    
    public static void ordenarArreglo(int age[], int nPersonas){
        int aux;
        for(int i=0;i<nPersonas;i++){
            for(int j=0;j<nPersonas-i-1;j++){
                if(age[j+1]<age[j]){
                    aux = age[j+1];
                    age[j+1] = age[j];
                    age[j] = aux;
                }
            }
        }
        
    }
    
    public static void ingresarArreglo(int age[], int nPersonas){
        Scanner in = new Scanner(System.in);
        for(int i=0;i<nPersonas;i++){
            System.out.print((i+1)+") Ingrese los sueldos: ");
            age[i] = in.nextInt();
        }
        System.out.println();
    }
    
    public static void mostrarArreglo(int age[], int nPersonas){
        for(int i=0;i<nPersonas;i++){
            System.out.println("Datos en casilla "+(i+1)+" : "+age[i]);
        }
    }
    
    public static void ramdomArreglo(int age[], int nPersonas){
        for(int i=0;i<nPersonas;i++){
            //int M = limite,m = 0;
            int aleatorio = (int)Math.floor(Math.random()*100);
            age[i] = aleatorio;
        }
    }
    
    public static void consultarDato(int age[]){
        boolean band = false;
        int pos = -1, i =0;
        int dato;
        Scanner in = new Scanner (System.in);
        System.out.print("Ingrese el dato a buscar: ");
        dato = in.nextInt();
        while(i < age.length && band == false){
            if(age[i] == dato){
                pos = i;
                band = true;
            }
            i++;
        }
        if(band == true){
            System.out.println("\nEl dato "+dato+" fue encontrado en la posicion "+(pos+1));
        }
        else{
            System.out.println("\nEl dato no fue encontrado");
        }
    }
    
    public static void quiebreControl(int age[]){
        int anterior = age[0], contador = 0, i=0;
        while(i<age.length){
            if(anterior == age[i]){
                contador++;
            }
            else{
                System.out.println("El numero "+anterior+" se repitio "+contador+" veces.");
                 anterior = age[i];
                 contador = 1;
            }
            i++;
        }
    }
    
    public static void menu(int age[], int nPersonas){
        int opc;
        Scanner in = new Scanner(System.in);
        do{
        System.out.println("\t\t\tMenu Principal\n");
        System.out.println("1) Cargar vector: ");
        System.out.println("2) Ordenar vector: ");
        System.out.println("3) Mostrar vector: ");
        System.out.println("4) Buscar un elemento en el arreglo");
        System.out.println("5) Quiebre de control");
        System.out.println("6) Salir: ");
        System.out.print("Digite una opcion: ");
        opc = in.nextInt();
        
        switch(opc){
            case 1: ramdomArreglo(age,nPersonas); break;
            case 2: ordenarArreglo(age,nPersonas); break;
            case 3: mostrarArreglo(age,nPersonas);System.out.println(); break;
            case 4: consultarDato(age); System.out.println(); break;
            case 5: quiebreControl(age); System.out.println(); break;
            case 6: break;
            default: System.out.println("Opcion no reconocida."); break;
        }
        }while(opc !=6);
    }
    
    public static void man(String[] args) {
        final int personas = 20;
        int edades[] = new int[personas];
        menu(edades,personas);
    }
    
}
