package animal;


public class animal {
	
public void comer(){
	System.out.println("el animal esta comiendo");
	
}

public void moverse () {
	System.out.println("el animal se esta moviendo");
	
}

public void dormir() {
	System.out.println("el animal esta durmiendo");
	
}

public void saltar() {
	System.out.println("el animal esta saltando");
	
}

public String nombre;

public double edad;

public static String color;

public animal(String nombre,double edad, String color) {
	this.nombre=nombre;
	this.edad=edad;
	animal.color=color;
	
	}

}
	