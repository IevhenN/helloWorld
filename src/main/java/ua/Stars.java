package ua;

public class Stars {
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString(){
        int ost=count;

        int countX=ost/1000;
        ost=ost%1000;

        int countY=ost/100;
        ost=ost%100;
        int countZ=ost/10;
        ost=ost%10;
        int countS=ost;

        String result = "";

        for (int i=1; i<=countX;i++){
            result+="X";
        }
        for (int i=1; i<=countY;i++){
            result+="Y";
        }
        for (int i=1; i<=countZ;i++){
            result+="Z";
        }
        for (int i=1; i<=countS;i++){
            result+="*";
        }

        return result;
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }

}
