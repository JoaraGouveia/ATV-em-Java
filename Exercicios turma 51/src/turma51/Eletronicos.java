package turma51;

public class Eletronicos {
	
	private String nome;
	private int anoFabri;
	private String Marca;
	private String Modelo;
	private int Valor;
	
	
	
	public Eletronicos(String nome, int anoFabri, String marca, String modelo,int valor) {
		super();
		
		this.nome = nome;
		this.anoFabri = anoFabri;
		this.Marca = marca;
		this.Modelo = modelo;
		this.Valor = valor;
				
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getAnoFabri() {
		return anoFabri;
	}



	public void setAnoFabri(int anoFabri) {
		this.anoFabri = anoFabri;
	}



	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		this.Marca = marca;
	}
	
	
	public String getModelo() {
		return Modelo;
	}
	
	
	public void setModelo() {
		this.Modelo = modelo;
	}
	
	public int getValor() {
		return Valor;
	}
	
	public void setValor() {
		this.Valor = valor;
	}
	
	
	public void InfoProdutoElet() {
		
		System.out.println("Nome do Produto: "+nome);
		System.out.println("\nFabricação do produto: "+anoFabri);
		System.out.println("\nMarca do Produto: "+Marca);
		System.out.println("\nModelo do Produto: "+Modelo);
		System.out.println("\nValor do Produto: "+Valor);
		
		
	}
	
	
	
	

}