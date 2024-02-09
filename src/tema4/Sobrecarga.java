package tema4;

public class Sobrecarga {
	public static void main(String[] args) {
		
	}

	public static int suma(int numero1, int numero2) {
		return numero1+numero2;
	}
	
	public static int suma (int numero1, int numero2, int numero3) {
		return numero1 + numero2 + numero3;
	}
	public static double suma (double numero1, double numero2, double numero3) {
		return numero1 + numero2 + numero3;
	}
	public static int sumaEntero (double numero1, double numero2, double numero3) {
		return(int) (numero1 + numero2 + numero3);
	}
	
}
