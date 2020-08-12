
public class Gato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] matriz = { { "1", "|", "2", "|", "3" }, { "-", "-", "-", "-", "-" }, { "4", "|", "5", "|", "6" },
				{ "-", "-", "-", "-", "-" }, { "7", "|", "8", "|", "9" } };

		Imprimir_Gato(matriz);

	}

	public static void Imprimir_Gato(String[][] matriz) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
			System.out.println("Que show que show");
		}
	}

}
