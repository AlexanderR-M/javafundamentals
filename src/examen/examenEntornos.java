package examen;

public class examenEntornos {
	
	public static void main(String[] args) {
		int[] numeros = {1,2,3,4};
		esCreciente(numeros);
		

	}
	public static boolean esCreciente(int[] numeros) {
		   boolean creciente = true;

		   


		   for (int i = 0; i < numeros.length; i++) {
		       if (numeros[i] > numeros[i + 1]) {
		           creciente = false;
		       }
		   }

		   return creciente;
		}


}
