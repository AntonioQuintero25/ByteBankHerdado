
public class AutenticacaoUtil {

	private int senha;
	
	public void setSenha(int novaSenha) {
		this.senha = novaSenha;
		
	}

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
}
