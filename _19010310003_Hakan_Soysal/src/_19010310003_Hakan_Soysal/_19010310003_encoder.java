package _19010310003_Hakan_Soysal;

public class _19010310003_encoder {

	
	public _19010310003_encoder(int signal) {
		if(signal == 1) {
			System.out.println("Mux'ların s2 s1 s0 seçim hatlarına 0 0 1 değeri uygulandı ve AR yazacının değeri veri yoluna aktarıldı.");
		}
		else if(signal == 2) {
			System.out.println("Mux'ların s2 s1 s0 seçim hatlarına 0 1 0 değeri uygulandı ve PC yazacının değeri veri yoluna aktarıldı.");
		}
		else if(signal == 3) {
			System.out.println("Mux'ların s2 s1 s0 seçim hatlarına 0 1 1 değeri uygulandı ve DR yazacının değeri veri yoluna aktarıldı.");
		}
		else if(signal == 4) {
			System.out.println("Mux'ların s2 s1 s0 seçim hatlarına 1 0 0 değeri uygulandı ve AC yazacının değeri veri yoluna aktarıldı.");
		}
		else if(signal == 5) {
			System.out.println("Mux'ların s2 s1 s0 seçim hatlarına 1 0 1 değeri uygulandı ve IR yazacının değeri veri yoluna aktarıldı.");
		}
		else if(signal == 6) {
			System.out.println("Mux'ların s2 s1 s0 seçim hatlarına 1 1 0 değeri uygulandı ve TR yazacının değeri veri yoluna aktarıldı.");
		}
		else if(signal == 7) {
			System.out.println("Mux'ların s2 s1 s0 seçim hatlarına 1 1 1 değeri uygulandı ve bellekten okunan değer veri yoluna aktarıldı.");
		}
	}
}
