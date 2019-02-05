package arcade;

public class CenturyFromYear {
    
    int centuryFromYear(int year) { 
        int q = year/100;
        int r = year%100;
        if(r>0) q++;
        return q;
    }
    
}
