package ObjetoCliente;

import ClienteClasse.clienteClasse;

public class objetoCliente {

	public static void main(String[] args) {
		clienteClasse cliente1 = new clienteClasse(2,"cainan","234123423","234234234","341234233");
		
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getRg());
		System.out.println(cliente1.getTelefone());

	}

}
