package loopings;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] array1 = new int[5], array2 = new int[5], soma = new int[5];
		
		for (int x = 0; x < 5; x++) {
			System.out.println("Digite um numero: ");
			array1[x] = entrada.nextInt();
		}
		System.out.print("Array 1: ");
		for (int z : array1) {
			System.out.print(z + " ");
		}
		
		System.out.println(" ");
		
		for (int x = 0; x < 5; x++) {
			array2[x] = array1[x] * 2;
		}
		
		System.out.print("Array 2: ");
		
		for (int z : array2) {
			System.out.print(z + " ");
		}
		
		//Somar o primeiro pelo segundo:
		for (int x = 0; x < 5; x++) {
			soma[x] = array1[x] + array2[x];
		}
		System.out.print("\n");
		
		System.out.print("Soma dos arrays: ");
		for (int z : soma) {
			System.out.print(z + " ");
		}
	}

}
