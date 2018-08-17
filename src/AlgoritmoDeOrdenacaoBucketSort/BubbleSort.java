package AlgoritmoDeOrdenacaoBucketSort;

public class BubbleSort {
	
	public int recebeVetor (int[] vetor){
		
		int i, j, aux;
		int tamVetor = vetor.length;
		int contador = 0;
		
		for ( i = 0; i < tamVetor - 1; i++ ) {
			contador++;
			for ( j = i + 1; j < tamVetor; j++ ) {
				contador++;
				if ( vetor[i] > vetor[j] ) {
					contador++;
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}				
			}
		}	
		return contador;		
	}

}
