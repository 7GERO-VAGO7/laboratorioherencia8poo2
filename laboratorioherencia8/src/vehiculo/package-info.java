package vehiculo;

// Clase base "Vehiculo"
class Vehiculo {
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    
   
public String getModelo() {
        return modelo;
    }

    public int getAño() {
        
       
return año;
    }

    public void arrancar() {
        System.out.println("El vehículo está arrancando.");
    }

    public void detener() {
        System.out.println("El vehículo se ha detenido.");
    }
}
