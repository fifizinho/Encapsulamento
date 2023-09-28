package ObjetoEndereco;

import EnderecoClasse.enderecoClasse;

public class objetoEndereco {

	public static void main(String[] args) {
		
		enderecoClasse endereco1 = new enderecoClasse(2,"cainan",10,"igreja","jardin casa grande ","Sorocaba","Sao Paulo","43243");
		
		System.out.println(endereco1.getLogradouro());
		System.out.println(endereco1.getId());
		System.out.println(endereco1.getNumero());
		System.out.println(endereco1.getComplemento());
		System.out.println(endereco1.getBairro());
		System.out.println(endereco1.getCidade());
		System.out.println(endereco1.getCep());
		System.out.println(endereco1.getUf());

	}

}
