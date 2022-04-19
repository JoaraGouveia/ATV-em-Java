package turma51;

 class Cliente {
	
	
	
	private String nome;
	private int idade;
	private String email;
	private long cpf;
	private String endereco;
	
	
	
	
	
	
	public Cliente(String nome, int idade, String email, long cpf, String endereco) {
	super();
	this.nome = nome;
	this.idade = idade;
	this.email = email;
	this.cpf = cpf;
	this.endereco = endereco;
	}

	

	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public int getIdade() {
		return idade;
	}




	public void setIdade(int idade) {
		this.idade = idade;
	}




	public void getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public long getCpf() {
		return cpf;
	}




	public void setCpf(long cpf) {
		this.cpf = cpf;
	}




	public String getEndereco() {
		return endereco;
	}




	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
		
		public void info_cliente() {
			
			
			
		
		System.out.println("Nome: "+nome);
		System.out.println("\nIdade: "+idade);
		System.out.println("\nEmail: "+ email);
		System.out.println("\nCpf: "+cpf);
		System.out.println("\nEndereço: "+endereco);
		
		
	
	}

	

	
	
	
	

}