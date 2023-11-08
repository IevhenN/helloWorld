public class ATM {

    public int countBanknotes(int sum){
        int [] banknotes = new int[] {500,200,100,50,20,10,5,2,1};

        int count = 0;
        int i = 0;

        while (i<banknotes.length){
            count+=(sum/banknotes[i]);
            sum=sum-(sum/banknotes[i]*banknotes[i]);

            if (sum==0) return count;
            i++;
        }

        return count;
    }

    public static void main(String[] args) {
        ATM bank = new ATM();

        System.out.println(bank.countBanknotes(500));
    }
}
