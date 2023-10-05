package Loja;

public class Principal {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo ("Porsche", "Porsche 911", 2022, "Preto");
		System.out.println("Veículo: ");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());
		
		Automovel automovel = new Automovel ("Porsche", "Porsche 911", 2022, "Preto", 2, "V8 Canadense");
		System.out.println("\nAutomóvel: ");
		System.out.println("Marca: " + automovel.getMarca());
		System.out.println("Modelo: " + automovel.getModelo());
		System.out.println("Ano: " + automovel.getAno());
		System.out.println("Cor: " + automovel.getCor());
		System.out.println("Número de Portas: " + automovel.getNumeroPortas());
		System.out.println("Motor: " + automovel.getMotor());
		
		Moto moto = new Moto ("Honda", "Huracan", 2021, "Azul", 1000);
		System.out.println("\nVeículo: ");
		System.out.println("Marca: " + moto.getMarca());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Cilindrada: " + moto.getCilindrada());
		
		
		
	}

}
