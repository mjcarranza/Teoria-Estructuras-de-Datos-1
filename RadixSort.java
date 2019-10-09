
public class RadixSort {
	// variables.
	int[] Array, aux, aux2;
	Quicksort ordenar = new Quicksort();
	
	//constructor and initialization of some variables.
	public RadixSort(int[] Array) {
		this.Array = Array;
		int[] aux = new int[Array.length];
		int[] aux2 = new int[Array.length];
		// calling Residuo method.
		Residuo(Array, aux, 0);
	}
	
	//Residuo method.
	public void Residuo(int[]Array, int[] aux, int cont) {
		for(int i=0; i<Array.length; i++) {
			aux[i] = (int) ((Array[i]/Math.pow(10, cont))%10);
			System.out.println(aux[i]);
		}
		// sorting aux`s elements
		aux = ordenar.sort(aux);
		
		Radix(Array, aux, cont);
	}
	
	public void Radix (int [] Array, int[] aux, int cont) {
		aux2 = new int[Array.length];
		for(int i=0; i<aux.length; i++) {
			for(int j=0; j<aux.length; j++) {
				
				if(aux[i]==(int) ((Array[j]/Math.pow(10, cont))%10)) {
					aux2 [i] = Array[j];
					j = Array.length;
				}
			}
			
		}
		
		if (cont == 1) {
			for (int i=0; i<aux2.length; i++) {
				System.out.print(aux2 [i] + " ");
			}
		}else {
			Residuo(aux2, aux, cont+1);
		}
	}
	
	public boolean Ordenado (int[] aux2) {
		for (int i=0; i<aux2.length; i++) {
			if (aux2[i] != 0) {
				return false;
			}
		}
		return true;//////////////////////////////////////////////////////////////// fix return (position)
	}
	
	public static void main(String[] args) {
		// call methods
		int [] array = new int[5];
		array[0] = 28;
		array[1] = 73;
		array[2] = 91;
		array[3] = 15;
		array[4] = 30;
		RadixSort sort = new RadixSort(array);
		
	}
}

// add QuickSort class


//subir a wiki en github///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





