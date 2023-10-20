package animal;

public class gatito extends animal {

    public gatito(String nombre, double edad,String color) {
        super(nombre, edad, color);
    }

    @Override
    public void comer() {
    	// TODO Auto-generated method stub
        System.out.println("el gatito está comiendo");
    }

    @Override
    public void moverse() {
    	// TODO Auto-generated method stub
        System.out.println("el gatito se está moviendo");
    }

    @Override
    public void dormir() {
    	// TODO Auto-generated method stub
        System.out.println("el gatito está durmiendo");
    }

	@Override
	public void saltar() {
		// TODO Auto-generated method stub
		super.saltar();
	}
    
    
}

