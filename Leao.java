package ClasseAbstrata;

public class Leao extends Animais{
	
	public Leao(String raca, String sexo, String nome) {
		super(raca, sexo, nome);
	}

	@Override
	public void dormir() {
		System.out.println("O leão está dormindo");
	}

	@Override
	public void caminhar() {
		System.out.println("O leão está caminhando");
	}

	@Override
	public void correr() {
		System.out.println("O leão está correndo");
	}

	@Override
	public void emitirSom() {
		System.out.println("O leão está rugindo");
	}

	}

