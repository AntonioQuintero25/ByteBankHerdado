
public class TestaFuncionario {
	public static void main(String[] args) {
		Gerente antonio = new Gerente();
		antonio.setNome("Antonio");
		antonio.setCpf("765.987.890-87");
		antonio.setSalario(2200.90);
		
		System.out.println(antonio.getNome());
		System.out.println(antonio.getCpf());
		System.out.println(antonio.getSalario());
		System.out.println(antonio.getBonificacao());
		System.out.println(antonio.getSalario());
		
	}
}
