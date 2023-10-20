package vehiculo;


public class motocicleta {
	class Motocicleta extends Vehiculo {
	    private boolean tieneSidecar;

	    public Motocicleta(String marca, String modelo, int año, boolean tieneSidecar) {
	        super(marca, modelo, año);
	        this.tieneSidecar = tieneSidecar;
	    }

	    public boolean tieneSidecar() {
	        return tieneSidecar;
	    }

	    
	    }

	   
	public void hacerCaballito() {
	        System.out.println("La motocicleta está haciendo un caballito.");
	    }
	}

