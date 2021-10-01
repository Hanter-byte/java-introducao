
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Olá");
		int idade = 17;
		int quantidadePesssoas = 3;

		if (idade >= 18) {

			System.out.println("Você tem mais de 18 anos");

		} else {
			
			if (quantidadePesssoas > 1) {
				
				System.out.println("Você pode entrar");
				
			} else {
				
				System.out.println("Você não é maior de idade");

			}
		}
	}
}