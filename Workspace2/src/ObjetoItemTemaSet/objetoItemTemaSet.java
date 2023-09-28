package ObjetoItemTemaSet;

import ItemTemaClasseSet.itemTemaClasseSet;

public class objetoItemTemaSet {

	public static void main(String[] args) {
		itemTemaClasseSet itemTema2 = new itemTemaClasseSet ();
		
		itemTema2.setId(2);
		itemTema2.setNome("fernanda");
		itemTema2.setDescricao("nao tem");
		
		System.out.println(itemTema2.getNome());
		System.out.println(itemTema2.getId());
		System.out.println(itemTema2.getDescricao());
	}

}
