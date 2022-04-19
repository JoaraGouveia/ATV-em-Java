package Herança;

public class Gato extends Animal {
	
	private String correr;
	
	
	public Gato (String nome, int idade, String correr, String som) {
		
		super(nome,idade,som);
		this.correr = correr;
		
		
	}


	public String getCorrer() {
		return correr;
	}


	public void setCorrer(String correr) {
		this.correr = correr;
	
	}

	public void impimirGato()
	{
		System.out.println("\n Animal: "+getNome()+"\nIdade: "+getIdade()+"\n Som: "+getSom()+"\nCorrer: "+getCorrer());
	}
	
}