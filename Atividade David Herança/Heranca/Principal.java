package Heranca;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa ("David Kauan", "(11)4234-4244");
		System.out.println("Pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());
		
		PessoaFisica pessoaFisica = new PessoaFisica ("David Kauan", "(11)4234-4244", "123.456.789-00", "300.456.989-X");
		System.out.println("\nPessoa Física:");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " +  pessoaFisica.getCpf());
		System.out.println("RG: " + pessoaFisica.getRg());
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica ("Empresa SENAI", "(11) 9967-4587", "12.345.678/9001-23");
		System.out.println("\nPessoa Jurídica:");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println("CNPJ: " +  pessoaJuridica.getCnpj());
		

	}

}
