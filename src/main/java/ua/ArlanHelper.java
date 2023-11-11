package ua;

public class ArlanHelper {
    //Test output
    public String drawQuad(int n){

        String result = "";

        int i=0;
            while (i<n) {
                if (i!=0) result+="\n";
                int j=0;
                while (j<n){
                    result+="*";
                j++;
            }
            i++;
        }
    return result;
    }

    public String drawRect(int width, int height, char c){

        String result = "";

        int i=0;
        while (i<height) {
            if (i!=0) result+="\n";
            int j=0;
            while (j<width){
                result+=c;
                j++;
            }
            i++;
        }
        return result;
    }

    public String drawLine(int length){
        String result = "";

        int i=0;
        while (i<length) {
            result+=(i%2==0)?"*":"#";
            i++;
        }
        return result;
    }

    public String drawPattern(char[] pattern, int repeatCount){
        String result = "";

        int j = 0;
        while (j<repeatCount) {
            int i = 0;
            int length = pattern.length;
            while (i < length) {
                result += pattern[i];
                i++;
            }
            j++;
        }
        return result;
    }
    public static void main(String[] args) {

        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //*
        //**
        System.out.println(helper.drawRect(2,3,'*'));
    }
}