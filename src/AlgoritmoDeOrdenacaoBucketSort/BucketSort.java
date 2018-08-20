package AlgoritmoDeOrdenacaoBucketSort;

public class BucketSort {

	public static int recebeVetor(int[] vetor) {
		int maxVal = 0;
		int contador = 0;
		
		for(int i = 0; i < vetor.length; i++ ){
			contador++;
			if (vetor[i] > maxVal){
				maxVal = vetor[i] ;
				contador++;
			}
		}
		
		int[] bucket = new int[maxVal + 1];

		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
			contador++;
		}

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
