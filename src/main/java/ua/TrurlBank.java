package ua;

public class TrurlBank {
    public int sumQuads(int n) {
        int result = 0;

        while(n > 0) {
            result += n * n;
            n--;
        }

        return result;
    }

    public int countSumOfDigits(int number){
       int result = 0;

       String strNumber = Integer.toString(number);

       int length = strNumber.length();
       while (length>0){
           result+=Character.getNumericValue(strNumber.charAt(length-1));
           length--;
       }

       return result;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
    }
}