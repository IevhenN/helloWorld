public class CheapStocks {
    public String getCheapStocks(String[] stocks){

        String result ="";

        for (String stock:stocks){
            String[] strSplit = stock.split(" ");
            if (Integer.parseInt(strSplit[1])<200){
                result=result+(result==""?"":" ")+strSplit[0];
            }

        }

        return result;
    }
    public static void main(String[] args) {
        CheapStocks stocks = new CheapStocks();
        System.out.println(stocks.getCheapStocks(new String[] {"hiz 156", "Irku 98", "Ma 799", "Rype 66", "hov 40", "ogof 71", "Yxno 635", "Satip 173", "Vo 15", "Kui 105", "neci 746", "ly 166", "Armuy 56"}));
    }
}
