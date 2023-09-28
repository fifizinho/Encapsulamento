package ObjetoItemTema;

import ItemTemaClasse.itemTemaClasse;

public class objetoItemTema {

	public static void main(String[] args) {
		itemTemaClasse itemTema1 = new itemTemaClasse(2,"cainan","nao tem descricao");
		
		System.out.println(itemTema1.getDescricao());
		System.out.println(itemTema1.getId());
		System.out.println(itemTema1.getNome());
	}

}
