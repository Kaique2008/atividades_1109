package ClasseAbstrata;

public class Lobo extends Animais {
	
	public Lobo(String raca, String sexo, String nome) {
		super(raca, sexo, nome);
	}

	@Override
	public void dormir() {
		System.out.println("O lobo está dormindo");
	}

	@Override
	public void caminhar() {
		System.out.println("O lobo está caminhando");
	}

	@Override
	public void correr() {
		System.out.println("O lobo está correndo");
	}

	@Override
	public void emitirSom() {
		System.out.println("O lobo está uivando");
	}

	}

