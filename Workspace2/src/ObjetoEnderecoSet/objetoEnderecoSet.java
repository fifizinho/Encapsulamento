package ObjetoEnderecoSet;

import EnderecoClasseSet.enderecoClasseSet;

public class objetoEnderecoSet {
	public static void main(String[] args) {
		enderecoClasseSet endereco2 = new enderecoClasseSet ();
		
		endereco2.setId(2);
		endereco2.setLogradouro("fernanda");
		endereco2.setNumero(13);
		endereco2.setComplemento("escola");
		endereco2.setBairro("bairro");
		endereco2.setCidade("itape");
		endereco2.setCep("natal");
		endereco2.setUf("23512524");
		
		System.out.println(endereco2.getNumero());
		System.out.println(endereco2.getId());
		System.out.println(endereco2.getLogradouro());
		System.out.println(endereco2.getComplemento());
		System.out.println(endereco2.getBairro());
		System.out.println(endereco2.getCidade());
		System.out.println(endereco2.getCep());
		System.out.println(endereco2.getUf());
	}
}
