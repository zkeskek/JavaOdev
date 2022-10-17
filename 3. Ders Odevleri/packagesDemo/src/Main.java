import java.util.Scanner;

import matematik.DortIslem;
import matematik.Logaritma;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Adınız :");
		String isim = scanner.nextLine();
		System.out.println("Merhaba " + isim);

		DortIslem dortIslem = new DortIslem();

		System.out.println(dortIslem.topla(4, 3));

		Logaritma logaritma=new Logaritma();
		System.out.println(logaritma.logaritmaHesapla());
		
	}

}
