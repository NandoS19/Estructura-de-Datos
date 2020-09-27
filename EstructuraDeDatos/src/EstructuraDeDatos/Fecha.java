
package EstructuraDeDatos;


public class Fecha {
    
    private  int dia;
    private  int mes;
    private  int anio;
    
    public Fecha(){}
    
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
    
    
    private boolean esBisiesto(){
        return (anio %4 ==0 && anio %100 != 0 || anio %400==0);
    }

    public boolean fechaCorrecta(){
        boolean diaCorrecto,mesCorrecto,anioCorrecto;
        anioCorrecto = anio>0;
        mesCorrecto = mes >=1 && mes <=12;
        switch(mes){
            case 2:
                if(esBisiesto()){
                    diaCorrecto = dia >=1 && dia <=29;
                }
                else{
                    diaCorrecto = dia >=1 && dia <=28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11: diaCorrecto = dia >=1 && dia <=30; break;
            default: diaCorrecto = dia >=1 && dia <=31; break;
        }
        return diaCorrecto && mesCorrecto &&anioCorrecto;
    }
    
}
