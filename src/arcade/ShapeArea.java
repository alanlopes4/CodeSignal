package arcade;

public class ShapeArea {
    
    int shapeArea(int n) {

        int res = 0;
        int aux = 1;
        if(n==1)
            return 1;
        else
            for(int i=1;i<=n;i++) {
                    if(i!=n) 
                            res += 2*aux;
                    else
                            res += aux;
                    aux +=2;
            }

        return res;
    
    }
    
}
