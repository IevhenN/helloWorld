public class TriangleDrawer {
    public String drawTriangle(int side){
        String result = "";

        while (side>0) {
            int i = 0;
            while (i<side){
                result+="*";
                i++;
            }
            result+="\n";
           side--;
        }
        return result;
    }

    public static void main(String[] args) {
        TriangleDrawer drawer = new TriangleDrawer();

        System.out.println(drawer.drawTriangle(3));
    }
}
