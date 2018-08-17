package AlgoritmoDeOrdenacaoBucketSort;

public class BubbleSort2 {
	
	public int recebeVetor (int[] vetor){
		
		int i, aux;
		int tamVetor = vetor.length;
		int contador = 0;
		boolean lol = true;
		
		while(lol){
			lol = false;
			for (  i =0; i < tamVetor - 1; i++ ) {
				contador++;
				if ( vetor[i] > vetor[i + 1] ) {
					contador++;
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					lol = true;
				}		
			}
		}
		return contador;		
	}
}
