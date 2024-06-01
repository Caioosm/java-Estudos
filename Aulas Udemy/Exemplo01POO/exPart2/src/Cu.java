import java.util.Locale;
import java.util.Scanner;

public class Cu {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		int num = sc.nextInt();
		int soma = 0;
		while (num != 0){
			soma += num; 
		}

		System.out.println("Soma: " + soma);
		
		sc.close();
	}
}