package Figura;

//1. Aplicamos herencia

public class Rectangulo extends Figura {

	//Parametros
		double base;
		double altura;
		
		
		//Constructor
		Rectangulo(double base, double altura){
			this.base = base;
			this.altura = altura;
		}//constructor
		

		//Metodos
	@Override
	public double calcularArea() {
		double formulaRectangulo = base * altura;
		return formulaRectangulo;
	}//metodo calcularArea

}//class Rectangulo
