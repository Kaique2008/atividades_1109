package ClasseAbstrata;

public class PrincipalAnimal {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Buldog", "Macho", "Bolt");
		dog.dormir();
		dog.caminhar();
		dog.correr();
		dog.emitirSom();
		
		System.out.println("-------------------------");
		
		Lobo alfa = new Lobo("cinzento", "Macho", "Rex");
		alfa.dormir();
		alfa.caminhar();
		alfa.correr();
		alfa.emitirSom();
		
		System.out.println("-------------------------");
		
		Tigre persa = new Tigre("Persa", "Macho", "Tobe");
		persa.dormir();
		persa.caminhar();
		persa.correr();
		persa.emitirSom();
		
		System.out.println("-------------------------");
		
		Leao Rei = new Leao("Leao", "Macho", "Simba");
		Rei.dormir();
		Rei.caminhar();
		Rei.correr();
		Rei.emitirSom();
		
		

	}

}
