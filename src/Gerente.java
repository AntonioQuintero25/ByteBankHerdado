
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando m�todo de bonifica��o de GERENTE");
		return super.getSalario(); // super indica que este atributo vem da classe m�e
	}
	
	@Override
	public void setSenha(int novaSenha) {
		this.autenticador.setSenha(novaSenha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
