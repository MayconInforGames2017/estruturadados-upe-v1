package buscaBinaria;

public class BuscaBinariaInterativa {

	public static void main(String[] args) {
		int []S = {1, 6, 7, 12, 15, 20, 22, 25, 27, 31, 37, 39, 44};
		
		int indice = binario(S, 39);
		
		System.out.println(indice);
	}

	private static int binario(int[] s, int x) {
		int meio;
		int inicio, fim;
		inicio = 0;
		fim = s.length-1;
		
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (s[meio] == x) 
				return meio;
			else if (s[meio] < x) inicio = meio + 1; 
			else if (s[meio] > x) fim = meio - 1; 
		}
		return -1;
	}
	
}
