package arcade;

public class AdjacentElementsProduct {
    
    int adjacentElementsProduct(int[] inputArray) {
    
        int size = inputArray.length;
        int res = inputArray[0] * inputArray[1];
        for(int i=1;i< size-1; i++) {
            if((inputArray[i]*inputArray[i+1]) > res)
                res = inputArray[i]*inputArray[i+1];
        }

        return res;
    }
    
}
