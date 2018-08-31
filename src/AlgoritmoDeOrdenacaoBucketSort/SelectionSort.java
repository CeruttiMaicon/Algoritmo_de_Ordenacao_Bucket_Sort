package AlgoritmoDeOrdenacaoBucketSort;

public class SelectionSort {
	
	public int recebeVetor(int[] vetor){
		int min, i, j, aux;
		int tamVetor = vetor.length;
		int contador = 0;
		
		for ( i = 0; i < tamVetor - 1; i++ ) {
			min = i;
			for ( j = i + 1; j < tamVetor; j++) {
				contador++;
				if ( vetor[j] < vetor[min] ) {
					min = j;
				}			
			}
			contador++;
			if ( vetor[i] != vetor[min] ){
				contador++;
				aux = vetor[i];
				vetor[i] = vetor[min];
				vetor[min] = aux;
			}
		}
		return contador;
	}	
}
