public class ArrayReverse {
    public static void main(String[] args){
        int[] number = {1,2,3,4,5,6,7,8,9,10};
        int[] number2 = new int[number.length];

        int j = number.length; 
        for (int i = 0; i < number.length; i++) { 
            number2[j - 1] = number[i]; 
            j = j - 1; 
        } 

        for (int k = 0; k < number2.length; k++) { 
            System.out.println(number2[k]); 
        } 
    }
}