import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos terá o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		double media = 0;
		int quantidade = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				media += vect[i];
				quantidade += 1;
		}
		}
		
		if (media == 0) {
			System.out.println("NENHUM NÚMERO PAR");
		}
		else {
		media = media / quantidade;
		System.out.printf("MEDIA DOS PARES = %.1f", media);
		}
		
		sc.close();

	}

}
