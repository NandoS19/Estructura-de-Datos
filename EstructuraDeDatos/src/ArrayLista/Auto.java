
package ArrayLista;


public class Auto {
    private long numeroSerial;
    private String marca;
    private String modelo;
    private String color;
    private String placa;
    private int anio;

    public Auto(long numeroSerial, String marca, String modelo, String color, String placa, int anio) {
        this.numeroSerial = numeroSerial;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.anio = anio;
    }

    

    public long getNumeroSerial() {
        return numeroSerial;
    }

    public void setNumeroSerial(long numeroSerial) {
        this.numeroSerial = numeroSerial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    @Override
    public String toString(){
        StringBuilder sb  = new StringBuilder();
        sb.append("\nNumero Serial: "); sb.append(numeroSerial);
        sb.append("\nMarca: "); sb.append(marca);
        sb.append("\nModelo: "); sb.append(modelo);
        sb.append("\nColor: "); sb.append(color);
        sb.append("\nPlaca: "); sb.append(placa);
        sb.append("\nAnio: "); sb.append(anio);
        return sb.toString();
    }
}
