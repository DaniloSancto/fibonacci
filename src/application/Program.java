package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Set<Long> set = new HashSet<>();

		System.out.print("Digite o valor: ");
		int value = sc.nextInt();

		// carregando apenas 35 valores da sequencia por que mais que isso demora para carregar mesmo utilizando HashSet para buscar		
		for (int i = 0; i < 35; i++) {
			set.add(fibonacci(i));
		}
		
		//codigo para ver quais valores possíveis
		//		set.forEach(System.out::println);

		if (set.stream().anyMatch(n -> n == value)) {
			System.out.println("O número " + value + " pertence a sequência de Fibonacci!");
		}
		else {
			System.out.println("O número " + value + " NÃO pertence a sequência de Fibonacci!");
		}

		sc.close();
	}

	static long fibonacci(int n) {
		return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
	}

}
