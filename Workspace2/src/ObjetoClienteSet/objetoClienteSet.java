package ObjetoClienteSet;

import ClienteClasseSet.clienteClasseSet;

public class objetoClienteSet {
	public static void main(String[] args) {
	clienteClasseSet cliente2 = new clienteClasseSet ();
	
	cliente2.setId(2);
	cliente2.setNome("fernanda");
	cliente2.setRg("134534534");
	cliente2.setCpf("23512524");
	cliente2.setTelefone("20945073404");
	
	System.out.println(cliente2.getTelefone());
	System.out.println(cliente2.getId());
	System.out.println(cliente2.getNome());
	System.out.println(cliente2.getRg());
	System.out.println(cliente2.getCpf());
	
}
}
