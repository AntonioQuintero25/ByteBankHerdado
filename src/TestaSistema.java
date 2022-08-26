
public class TestaSistema {
	public static void main(String[] args) {
		Gerente antonio = new Gerente();
		antonio.setSenha(2222);
		
		SistemaInterno system = new SistemaInterno();
		
		system.autentica(antonio);
	}
}
