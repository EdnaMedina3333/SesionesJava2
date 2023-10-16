package Animal;

public class Perro extends Animal {//Herencia de la clase superior Animal


		//Polimorfear o sobreescribir  el método heredado
	
		@Override //con la anotación @Override le decimos a JAVA que el método hacerSonido será sobreescrito
		public void hacerSonido () {
			System.out.println("El perrito ladra y hace guau");
		}//método hacerSonido heredado de Animal
		
		
		
		public static void main (String [] args) {
			
			//Aquí no hay polimorfismo ya que instancio un animal generico y utilizo su método hacerSonido
			Animal Generico = new Animal (); //genera un animal generico (abstracto)
			Generico.hacerSonido(); //antes de la ejecucion
			
			//Generar instancia de mi perrito
			//Sí hay polimorfismo, porque es el equivalente a decir "instancio a un animal que es un perrito"
			//Referenciar primero la clase general y luego la instancia particular permite el polimorfismo
			Animal Chilaquil = new Perro();
			Chilaquil.hacerSonido();//polimorfismo en tiempo de ejecucion
			
		} //cierre del main

	

}//cierre de class Perro
