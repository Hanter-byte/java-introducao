
public class TestaEscopo {

	public static void main(String[] args) {
		
		int acompanhado = 2;
		System.out.println(acompanhado);
		if (acompanhado >= 2) {
			System.out.println("Dois acompanhantes");
			acompanhado = 3;
			System.out.println(acompanhado);
		}else {
			System.out.println("Um os nem uma acompanhante");
		}
		System.out.println(acompanhado);
		}
	}
	
