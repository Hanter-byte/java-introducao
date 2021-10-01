
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Olá");
		int idade = 18;
		int quantidadePesssoas = 1;
		// "||" para fazer duas verificações, tendo apenas uma correta
		if (idade >= 18 || quantidadePesssoas >= 2) {
			System.out.println("Você pode entrar");
		} else {
			System.out.println("Você não pode entrar");
		}
		int numero = 3;
		int valor = 4;
		// "&&" para fazer duas verificações, as duas precisam estar corretas
		if (numero > 2 && valor < 3) {
			System.out.println("As duas verificações estão corretas");
		} else {
			System.out.println("Uma os mais verificações não estavam corretas.");
		}
		//"Verdadeiro ou falso
		boolean acompanhado = true;
		if (acompanhado == false) {
			System.out.println("Acompanhado");
		}else {
			System.out.println("Desacompanhado");
		}
		int idades = 68;
		boolean ehIdoso = idades >= 65;
		System.out.println(ehIdoso);

	}
}
