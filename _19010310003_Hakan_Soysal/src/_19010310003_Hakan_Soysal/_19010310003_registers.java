package _19010310003_Hakan_Soysal;

public class _19010310003_registers {
	
	String register[];
	static String addressRegisterM[] = {"000000000000"};
	static String programCounterM[] = {"000000000000"};
	static String dataRegisterM[] = {"0000000000000010"};
	static String accumulatorM[] = {"0000000000000000"};
	static String instructionRegisterM[] = {"0000000000000000"};
	static String temporaryRegisterM[] = {"0000000000000000"};
	static int memoryM[] = new int[4095];
	
	public String[] IntToBinary(int[] array, int digit){
		String[] binarys = new String[array.length];
		for(int i = 0; i<array.length; i++){binarys[i] = "";
		for(int j = 1; j < digit; j++){ if(array[i] / 2 >= 0){
		if(array[i] % 2 == 0)binarys[i] = "0" + binarys[i];
		else binarys[i] = "1" + binarys[i];
		array[i] = array[i] / 2;
		}
		}
		}
		return binarys;
		}
	
	public int returnSignal(String register) {
		if(register.equals("AR")) {
			return 1;
		}
		else if(register.equals("PC")) {
			return 2;
		}
		else if(register.equals("DR")) {
			return 3;
		}
		else if(register.equals("AC")) {
			return 4;
		}
		else if(register.equals("IR")) {
			return 5;
		}
		else if(register.equals("TR")) {
			return 6;
		}
		else if(register.equals("M")) {
			return 7;
		}
		
		return 0;
	}
	
	public int whichRegister(int signal) {
		
		if(signal == 1) {
			return Integer.parseInt(addressRegisterM[0]);
		}
		else if(signal == 2) {
			return Integer.parseInt(programCounterM[0]);
		}
		else if(signal == 3) {
			return Integer.parseInt(dataRegisterM[0]);
		}
		else if(signal == 4) {
			return Integer.parseInt(accumulatorM[0]);
		}
		else if(signal == 5) {
			return Integer.parseInt(instructionRegisterM[0]);
		}
		else if(signal == 6) {
			Integer.parseInt(temporaryRegisterM[0]);
		}
		else if(signal == 7) {
			return memoryM[0];
		}
		
		return 0;
	}
	
	public _19010310003_registers(String parsedString[]) {
		register = parsedString;
		
		
		if(memoryM.length <= 0) {
			for(int i = 0; i < 4096; i++) {
				memoryM[i] = i;
			}
		}
		
		if(!register.equals(null)) {
			
			if(register[0].equals("AR")) {
				if(register.length >= 4 ) {
					int binarys[] = new int[5];
					int toplam = Integer.parseInt(register[4]) + Integer.parseInt(addressRegisterM[0],2);
					binarys[0] = toplam;
					addressRegisterM = IntToBinary(binarys,12);
					System.out.println("AR yazacının INR girişi aktif edildi. AR yazacının güncel değeri: " + addressRegisterM[0]);
				}
				else {
					int binarys[] = new int[5];
					int signal = returnSignal(register[2]);
					System.out.println("X"+signal+" sinyali 1 yapıldı.");
					_19010310003_encoder encoderClass = new _19010310003_encoder(signal);
					binarys[0] = whichRegister(signal);
					addressRegisterM = IntToBinary(binarys,12);
					System.out.println("Veri yolundaki değer: " + addressRegisterM[0]); 
					System.out.println("AR yazacının LD girişi aktif edildi. AR yazacının güncel değeri: " + addressRegisterM[0]);
				}
			}
			else if(register[0].equals("PC")) {
				if(register.length >= 4) {
					int binarys[] = new int[5];
					int toplam = Integer.parseInt(register[4]) + Integer.parseInt(programCounterM[0],2);
					binarys[0] = toplam;
					programCounterM = IntToBinary(binarys,12);
					System.out.println("PC yazacının INR girişi aktif edildi. PC yazacının güncel değeri: " + programCounterM[0]);
				}
				else {
					int binarys[] = new int[5];
					int signal = returnSignal(register[2]);
					System.out.println("X"+signal+" sinyali 1 yapıldı.");
					_19010310003_encoder encoderClass = new _19010310003_encoder(signal);
					binarys[0] = whichRegister(signal);
					programCounterM = IntToBinary(binarys,12);
					System.out.println("Veri yolundaki değer: " + programCounterM[0]);
					System.out.println("PC yazacının LD girişi aktif edildi. PC yazacının güncel değeri: " + programCounterM[0]);
				}
			}
			else if(register[0].equals("DR")) {
				if(register.length >= 4) {
					int binarys[] = new int[5];
					int toplam = Integer.parseInt(register[4]) + Integer.parseInt(dataRegisterM[0],2);
					binarys[0] = toplam;
					dataRegisterM = IntToBinary(binarys,12);
					System.out.println("DR yazacının INR girişi aktif edildi. DR yazacının güncel değeri: " + dataRegisterM[0]);
				}
				else {
					int binarys[] = new int[5];
					int signal = returnSignal(register[2]);
					System.out.println("X"+signal+" sinyali 1 yapıldı.");
					_19010310003_encoder encoderClass = new _19010310003_encoder(signal);
					binarys[0] = whichRegister(signal);
					dataRegisterM = IntToBinary(binarys,12);
					System.out.println("Veri yolundaki değer: " + dataRegisterM[0]);
					System.out.println("DR yazacının LD girişi aktif edildi. DR yazacının güncel değeri: " + dataRegisterM[0]);
				}
			}
			else if(register[0].equals("AC")) {
				if(register.length >= 4) {
					
				}
				else {
					
				}
			}
			
			
		}
	}
	
	

}
