import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto");
		String name = sc.next();
		System.out.println("Digite o preço do produto");
		double price = sc.nextDouble();
		System.out.println("Digite a quantidade do produto");
		int quantity = sc.nextInt();
		Product a = new Product(name, price, quantity);
		System.out.println(a);
		
		int quant = 0;
		
		System.out.println("Digite quanto quer adicionar em estoque");
		quant = sc.nextInt();
		a.AddProducts(quant);
		System.out.println(a);
		System.out.println("Digite quanto quer remover em estoque");
		quant = sc.nextInt();
		a.RemoveProducts(quant);
		System.out.println(a);
	}

}