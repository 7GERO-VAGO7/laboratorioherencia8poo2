package vehiculo;

public class automovil {

	class Automovil extends Vehiculo {
	    private int numeroPuertas;

	    public Automovil(String marca, String modelo, int año, int numeroPuertas) {
	        super(marca, modelo, año);
	        this.numeroPuertas = numeroPuertas;
	    }

	    public int getNumeroPuertas() {
	        return numeroPuertas;
	    }

	    public void abrirMaletero() {
	        System.out.println("Abriendo el maletero del automóvil.");
	    }
	}
}


