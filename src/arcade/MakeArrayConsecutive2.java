package arcade;

public class MakeArrayConsecutive2 {
    
    int makeArrayConsecutive2(int[] statues) {

        quickSort(statues, 0, statues.length-1);
        int aux = statues[0];
        int count = 0;
        for(int i = 1;i<statues.length;i++) {
            if(statues[i] != aux+1) {
                    count+= statues[i]-(aux+1);
            }
            aux = statues[i];
        }


        return count;
    }
	
    void quickSort(int []statues, int inicio, int fim) {
        if(inicio < fim) {
            int posicaoPivo = separar(statues, inicio, fim);
            quickSort(statues, inicio, posicaoPivo - 1);
            quickSort(statues, posicaoPivo +1, fim);
        }
    }
	
    int separar(int []statues, int inicio, int fim) {
        
        int pivo = statues[inicio];
        int i = inicio+1, f = fim;
        while(i <= f) {
            if(statues[i] <= pivo)
                i++;
            else if(pivo < statues[f])
                f--;
            else {
                int troca = statues[i];
                statues[i] = statues[f];
                statues[f] = troca;
                i++;
                f--;
            }
        }

        statues[inicio] = statues[f];
        statues[f] = pivo;
        return f;
		
    }

    
}
