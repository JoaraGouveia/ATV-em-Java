package Herança;

public class Vaca extends Animal {
	
	private String correr;
	
	
	public Vaca (String nome, int idade, String correr, String som) {
		
		super(nome,idade,som);
		this.correr = correr;
		
		
	}


	public String getCorrer() {
		return correr;
	}


	public void setCorrer(String correr) {
		this.correr = correr;
	
	}

	public void impimirVaca()
	{
		System.out.println("\n Animal: "+getNome()+"\nIdade: "+getIdade()+"\n Som: "+getSom()+"\nCorrer: "+getCorrer());
	}
	
}