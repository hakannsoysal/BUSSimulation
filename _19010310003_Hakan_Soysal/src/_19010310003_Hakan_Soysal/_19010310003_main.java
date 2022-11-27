package _19010310003_Hakan_Soysal;
import java.util.Scanner;

public class _19010310003_main {
	
	public static void microOperationParser(String input) {
		String microOperation = input;
		String array[] = microOperation.split(" ");
	
		_19010310003_registers registerClass = new _19010310003_registers(array);
			
	}

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		
		while(true) {
			System.out.println("Lütfen mikro işlemi giriniz.");
			String microOperation = scannerObject.nextLine();
			
			if(!microOperation.equals(null)) {
				microOperationParser(microOperation);
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
