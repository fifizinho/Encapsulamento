package ObjetoTema;

import TemaClasse.temaClasse;

public class objetoTema {

	public static void main(String[] args) {
		
		temaClasse tema1 = new temaClasse (1,"cainan", 1000, "AZUL");
		
		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCorToalha());

	}

}
