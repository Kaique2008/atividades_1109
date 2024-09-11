package ClasseAbstrata;

public abstract class Animais {
	
	private String raca;
	private String sexo;
	private String nome;
	
	public Animais(String raca, String sexo, String nome) {
		this.raca = raca;
		this.sexo = sexo;
		this.nome = nome;
	}
	
	//Gerar Getters e Setters
	
	public abstract void dormir();
	
	public abstract void caminhar();
	
	public abstract void correr();
	
	public abstract void emitirSom();
}

	
	
	
	


