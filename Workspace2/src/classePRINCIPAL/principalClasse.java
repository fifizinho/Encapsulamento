package classePRINCIPAL;

import ClienteClasse.clienteClasse;
import ClienteClasseSet.clienteClasseSet;
import EnderecoClasse.enderecoClasse;
import EnderecoClasseSet.enderecoClasseSet;
import ItemTemaClasse.itemTemaClasse;
import ItemTemaClasseSet.itemTemaClasseSet;
import TemaClasse.temaClasse;
import TemaClasseSet.temaClasseSet;

public class principalClasse {
	public static void main(String[] args) {
	clienteClasse cliente1 = new clienteClasse(2,"cainan","234123423","234234234","341234233");
	clienteClasseSet cliente2 = new clienteClasseSet ();
	enderecoClasse endereco1 = new enderecoClasse(2,"cainan",10,"igreja","jardin casa grande ","Sorocaba","Sao Paulo","43243");
	enderecoClasseSet endereco2 = new enderecoClasseSet ();
	itemTemaClasse itemTema1 = new itemTemaClasse(2,"cainan","nao tem descricao");
	itemTemaClasseSet itemTema2 = new itemTemaClasseSet ();
	temaClasse tema1 = new temaClasse (1,"cainan", 1000, "AZUL");
	temaClasseSet tema2 = new temaClasseSet ();
	
	System.out.println(cliente1.getCpf());
	System.out.println(cliente1.getId());
	System.out.println(cliente1.getNome());
	System.out.println(cliente1.getRg());
	System.out.println(cliente1.getTelefone());
	
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
	
	System.out.println(endereco1.getLogradouro());
	System.out.println(endereco1.getId());
	System.out.println(endereco1.getNumero());
	System.out.println(endereco1.getComplemento());
	System.out.println(endereco1.getBairro());
	System.out.println(endereco1.getCidade());
	System.out.println(endereco1.getCep());
	System.out.println(endereco1.getUf());
	
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
	
	System.out.println(itemTema1.getDescricao());
	System.out.println(itemTema1.getId());
	System.out.println(itemTema1.getNome());
	
	itemTema2.setId(2);
	itemTema2.setNome("fernanda");
	itemTema2.setDescricao("nao tem");
	
	System.out.println(itemTema2.getNome());
	System.out.println(itemTema2.getId());
	System.out.println(itemTema2.getDescricao());
	
	System.out.println(tema1.getId());
	System.out.println(tema1.getNome());
	System.out.println(tema1.getValorAluguel());
	System.out.println(tema1.getCorToalha());
	
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
