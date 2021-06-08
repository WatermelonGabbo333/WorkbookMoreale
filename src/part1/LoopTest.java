package part1;

public class LoopTest {
    public static void main(String[] args) {
        int i,j,n;
        n=1;
        for (i=1;i<6;i++){
            for (j=1;j<i;j++) {
                System.out.print(n + " ");
                n++;
            }
        System.out.println();
        }
    }
}
