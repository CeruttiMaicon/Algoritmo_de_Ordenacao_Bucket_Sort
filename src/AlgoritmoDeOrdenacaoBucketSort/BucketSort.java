package AlgoritmoDeOrdenacaoBucketSort;

public class BucketSort {

	public static int recebeVetor(int[] vetor) {
		int maxVal = 0;
		int contador = 0;
		
		//Busca o maior valor dentro do vetor
		for(int i = 0; i < vetor.length; i++ ){
			contador++;
			if (vetor[i] > maxVal){
				maxVal = vetor[i] ;
				contador++;
			}
		}
		
		//cria um vetor auxiliar
		int[] bucket = new int[maxVal + 1];

		for (int i = 0; i < vetor.length; i++) {
			bucket[vetor[i]]++;
			contador++;
		}

		int outPos = 0;
		for (int i = 0; i < bucket.length; i++) {
			contador++;
			for (int j = 0; j < bucket[i]; j++) {
				vetor[outPos++] = i;
				contador++;
			}
		}
		return contador;
	}
}
