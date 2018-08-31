package AlgoritmoDeOrdenacaoBucketSort;

public class InsertionSort {

	public int recebeVetor (int[] vetor){
		
		int tamVetor = vetor.length;
		int contador = 0;
		int pivo;
		
		for (int i = 1; i < tamVetor; i++){
			//Estabelecendo o pivo do algoritmo
			pivo = vetor[i];
			contador++;
			for(int j = i - 1; j >= 0; j--) {
				contador++;
				if (vetor[j] > pivo ) {
					
					vetor[j+1] = vetor[j];
					vetor[j] = pivo;
					contador++;
				}else{
					break;
				}
			}
		}	
		return contador;
	}
}