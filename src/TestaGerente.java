
public class TestaGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente();
		g1.setNome("Antonio");
		g1.setCpf("123.456.789-90");
		g1.setSalario(3000.80);
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());
	}

}
