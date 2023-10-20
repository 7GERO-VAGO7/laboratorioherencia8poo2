package animal;

public class perrito extends animal {

	public perrito(String nombre, double edad,String color) {
		super(nombre, edad, color);
	}
	
	// con este @Override evidencio la sobre escritura y el polimorfismo ademas de estar ahorrando tiempo generandolos desde el  menu 
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("el perrito esta comiendo");
	}

	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		System.out.println("el perrito se esta moviendo");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("el perrito esta durmiendo");
	}

	@Override
	public void saltar() {
		// TODO Auto-generated method stub
		super.saltar();
	}
	

}
