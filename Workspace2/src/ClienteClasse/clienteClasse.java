package ClienteClasse;

public class clienteClasse {
	private int id;
	private String nome;
	private String telefone;
	private String rg;
	private String cpf;
	public clienteClasse(int id, String nome, String telefone, String rg, String cpf) {
		
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
