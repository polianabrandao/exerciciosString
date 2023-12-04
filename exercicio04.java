package loopings;
import java.util.Scanner;
import java.util.StringTokenizer;
public class exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		
		String frase = input.nextLine();
		
		StringTokenizer texto = new StringTokenizer(frase);
		System.out.println(texto.countTokens());
	}

}
