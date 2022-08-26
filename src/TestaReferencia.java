
public class TestaReferencia {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		String nome = g1.getNome();
		g1.setSalario(5000.0);
		
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(1500);
		
		Designer de = new Designer();
		de.setSalario(2000.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(de);
		
		System.out.println(nome);
		System.out.println(controle.getSoma());

	}

}
