package SimpleProjects;

public class Pattern1 {
    public static void kentang(){
        int x, y, z;
        for(x = 7; x >= 1; x--){
            for(y=7; y > x; y--){
                System.out.print("");
            }
            for(z=1;z<=x;z++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
