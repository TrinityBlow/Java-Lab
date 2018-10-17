package ejercicio2;



public class TestVeterinaria {
		
	
	public static void main(String[] args) {
		
//		Veterinaria<Animal> vet1 = new Veterinaria<Gato>(); auque gato extienda animal no se puede generar instancia de otros tipos
		
//		Veterinaria<Gato> vet2 = new Veterinaria<Animal>(); mismo problema
		
//		Veterinaria<?> vet3 = new Veterinaria<Gato>(); 
//		vet3.setAnimal(new Gato()); 
	
		Veterinaria vet4 = new Veterinaria();
		vet4.setAnimal(new Perro());
		System.out.println(vet4.getAnimal());
		
//		Veterinaria vet5 = new Veterinaria<?>();
		
		Veterinaria <? extends Animal> vet6 = new Veterinaria<Gato>();

	}

}

