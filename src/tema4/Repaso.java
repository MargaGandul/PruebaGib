package tema4;

public class Repaso {
	
	/*
	 * 
  1-Realizar una funcion que cuente el numero de digitos
  de un numero entero y lo  imprima por pantalla.
	
	*/
	
	public static void main(String[] args) {
		
		
	System.out.println(digitos(666));

	}
	
	//12345
	
	public static int digitos(int numero){
		int result=0;
		
		while(numero >0 ) {
			numero = numero /10;
			result ++;
			
		}
		
		return result;
		
	};
	
	/* 
	2-Realiza un algoritmo que devuelva verdadero si el numero que se pasa como parámetro es capicuá y falso en caso contrario.
	NOTA: Es posible usar otras funciones de la librería que hemos creado en clase pero debemos implementarlas y comentarlas.
	
	*/
		public static int voltea(int numero) {
			int volteado=0;
			
			while (numero>0) {
				int digito = numero % 10;
				numero = numero/10;
				
				volteado= volteado* 10;
				volteado = volteado+ digito;
				
				
			}
			return volteado;
		}
		
		public static boolean capicua (int numero) {

			return numero== voltea(numero);
			
		}
	
}
