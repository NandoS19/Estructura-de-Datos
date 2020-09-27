
package Matrices;


public class Test_Basico {
    
    public static void cargarDatos(int asi[][], int fila, int col){
        
        int numeroAsientos = 1;
        
        for(int i=0;i<fila;i++){
            for(int j=0;j<col;j++){
                asi[i][j] = numeroAsientos++;
            }
        }
    }
    
    public static void mostrarDatos(int asi[][], int fila, int col){
        for(int i=0;i<fila;i++){
            for(int j=0;j<col;j++){
                System.out.print(asi[i][j]+ " "); 
            }
            System.out.println();
        }
    }
    
    public static void man(String[] args) {
        
        final int nFilas =5;
        final int nCol = 5;
        int asientos[][] = new int [nFilas][nCol];
        cargarDatos(asientos, nFilas, nCol);
        mostrarDatos(asientos, nFilas, nCol);
        
    }
    
}
