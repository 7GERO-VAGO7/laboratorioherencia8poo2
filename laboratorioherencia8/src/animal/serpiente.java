package animal;

public class serpiente extends animal {

	public serpiente(String nombre, double edad) {
		super(nombre, edad, color);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void comer() {
		System.out.println("la serpiente no esta comiendo");
	}

	@Override
	public void moverse() {
		System.out.println("la serpiente se esta moviendo");
	}

	@Override
	public void dormir() {
		System.out.println("la serpiente aun no se quiere dormir");
	}

	@Override
	public void saltar() {
		// TODO Auto-generated method stub
		super.saltar();
	}


	

}
