
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	
	public abstract double getBonificacao(); 
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String novoCpf) {
		this.cpf = novoCpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double novoSalario) {
		this.salario = novoSalario;
	}
}
