package _19010310003_Hakan_Soysal;
import java.util.Scanner;

public class _19010310003_main {
	static boolean choose = true;
	
	public static void microOperationParser(String input) {
		String microOperation = input;
		String array[] = microOperation.split(" ");
		Scanner scannerObject = new Scanner(System.in);
		
		_19010310003_registers registerClass = new _19010310003_registers(array);
		System.out.println("Devam etmek istiyor musunuz? (E/H): ");
		switch(scannerObject.nextLine()) {
		case"E":
			choose = true;
			break;
		case "e":
			choose = true;
			break;
		case "h":
			choose = false;
			break;
		case "H":
			choose = false;
			break;
		default:
			choose = false;
		}
	}

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		
		while(choose) {
			System.out.println("Lütfen mikro işlemi giriniz.");
			String microOperation = scannerObject.nextLine();
			
			if(!microOperation.equals(null)) {
				microOperationParser(microOperation);
			}
				
		}
		
		
		
		
		
		
		
		
		
		
	}

}
