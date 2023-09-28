package ObjetoTemaSet;

import TemaClasseSet.temaClasseSet;

public class objetoTemaSet {

	public static void main(String[] args) {
		temaClasseSet tema2 = new temaClasseSet ();
		
		tema2.setId(2);
		tema2.setNome("fernanda");
		tema2.setCorToalha("pink");
		tema2.setValorAluguel(100.000);
		
		System.out.println(tema2.getCorToalha());
		System.out.println(tema2.getId());
		System.out.println(tema2.getNome());
		System.out.println(tema2.getValorAluguel());
	}

}
