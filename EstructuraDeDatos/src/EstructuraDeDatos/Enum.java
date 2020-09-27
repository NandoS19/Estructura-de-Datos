package POO;




public class Enum {
    
    enum Transporte{
        COCHE(60),CAMION(50),AVION(600) ,TREN(70), BARCO(20);
        private int velocidad;

        private Transporte(int velocidad) {
            this.velocidad = velocidad;
        }

        public void setVelocidad(int velocidad) {
            this.velocidad = velocidad;
        }
        
        public int getVelocidad() {
            return velocidad;
        }
        
        public static void mei(){
            Transporte tp;
            System.out.println("La velocidad tipica para el avion es: "+Transporte.AVION.getVelocidad()+ " millas por hora.");
            System.out.println("Todas las velocidades de los transportes ");
            for(Transporte t: Transporte.values()){
                System.out.println(t+ ": velocidad tipica es: "+t.getVelocidad()+ " millas por hora.");
            }
            
        }
        
    }
    
}
