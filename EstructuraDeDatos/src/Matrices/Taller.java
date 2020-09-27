
package Matrices;


public class Taller {

   
    public static void cargarDatos(int t[][], int fila,int col){
        for(int i=0;i<fila;i++){
            for(int j=0;j<col;j++){
                t[i][j] = 0;
            }
            //System.out.println();
        }
    }
    
    public static void Impares(int t[][], int fila,int col){
       int mod = 4;
       for(int i=fila;i>=0;i--){
            for(int j=col;j>=0;j--){
               t[mod][mod] = 1;
            }
            mod--;
        }
    }
    
    public static void mostrarDatos(int t[][], int fila,int col){
        for(int i=0;i<fila;i++){
            for(int j=0;j<col;j++){
                System.out.print(t[i][j]+ "  ");
            }
            System.out.println();
        }
    }
    
    public static void Pares(int t[][], int fila,int col){
        int mod=0;
        for(int i=0;i<fila;i++){
            for(int j=0;j<col;j++){
                t[mod][mod] = 2;
            }
           mod++;
            //System.out.println();
        }
    }
    
    public static void man(String[] args) {
        final int nFilas =5;
        final int nCol = 5;
        int taller[][] = new int [nFilas][nCol];
        cargarDatos(taller, nFilas, nCol);
        //Pares(taller, nFilas, nCol);
        //Impares(taller, nFilas, nCol);
        mostrarDatos(taller, nFilas, nCol);
    }
    
}
