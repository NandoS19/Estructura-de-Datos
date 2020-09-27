
package EstructuraDeDatos;


public class D1_a3 {
    
    enum Piedras{
        CALIZA(1200),MARMOL(1423.55),PIZARRA(1325),CUARZITA(1466.22);
        private double peso;

        private Piedras(double peso) {
            this.peso = peso;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }
        
        public static void mostrarDatos(){
            
            for(Piedras pe: Piedras.values()){
                System.out.println("El peso de "+pe+" es: "+pe.getPeso());
            }
            
            //System.out.println("El peso de la caliza es: "+Piedras.CALIZA.getPeso());
            //System.out.println("El peso del marmol es: "+Piedras.MARMOL.getPeso());
            //System.out.println("El peso de la pizarra es: "+Piedras.PIZARRA.getPeso());
            //System.out.println("El peso de la cuarzita es: "+Piedras.CUARZITA.getPeso());
        }
        
        public static void man(String[] args){
            mostrarDatos();
        } 
    }
    
}
