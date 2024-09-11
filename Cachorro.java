package ClasseAbstrata;

public class Cachorro extends Animais {
	

public Cachorro(String raca, String sexo, String nome) {
	super(raca, sexo, nome);
}

@Override
public void dormir() {
	System.out.println("O cachorro está dormindo");
}

@Override
public void caminhar() {
	System.out.println("O cachorro está caminhando");
}

@Override
public void correr() {
	System.out.println("O cachorro está correndo");
}

@Override
public void emitirSom() {
	System.out.println("O cachorro está latindo");
}

}