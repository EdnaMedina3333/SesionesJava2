package Figura;

//Clase concreta, implementa métodos de una interface llamada Calculable
public class Esfera implements Calculable{

	//Atributos
	double radio;
	double pi;
	
	
	
	@Override
	public double calcularArea() {
		// Area 4 * π * r2
		double area = (4 * pi) (radio * radio);
		return area;
	}

	@Override
	public double calcularVolumen() {
		// Volumen (4/3) · π · r3
		return 0;
	}

	@Override
	public double calcularPeimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}//cierre class Esfera
