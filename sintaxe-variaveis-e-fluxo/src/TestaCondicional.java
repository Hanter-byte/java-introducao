
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Ol�");
		int idade = 17;
		int quantidadePesssoas = 3;

		if (idade >= 18) {

			System.out.println("Voc� tem mais de 18 anos");

		} else {
			
			if (quantidadePesssoas > 1) {
				
				System.out.println("Voc� pode entrar");
				
			} else {
				
				System.out.println("Voc� n�o � maior de idade");

			}
		}
	}
}