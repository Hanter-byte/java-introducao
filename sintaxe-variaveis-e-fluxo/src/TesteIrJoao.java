
public class TesteIrJoao {

	public static void main(String[] args) {
		
		double salario = 5300.0;
		
		if (salario <= 2800.0) {
			System.out.println("O IR é de 7.5%, você pagara R$142");
		}else {
			if (salario >= 2800.01 && salario <=3751.0 ) {
				System.out.println("O IR é de 15%, você pagara R$350");
			}else {
				if (salario >= 4664.00) {
					System.out.println("O IR é de 22.5%, você pagara R$636");
				}
			}
		}
	}
}