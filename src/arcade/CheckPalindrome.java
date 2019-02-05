package arcade;

public class CheckPalindrome {
    
    boolean checkPalindrome(String inputString) {

        int size = inputString.length();
        int lastChar = size - 1;
        if(size%2 == 0)
                size = size/2;
        else
                size = (size-1)/2;

        for(int i = 0;i<size; i++) {
                if(inputString.charAt(i) != inputString.charAt(lastChar))
                        return false;
                lastChar--;
        }

        return true;
    }

    
}
