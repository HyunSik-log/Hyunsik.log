import java.util.Scanner;

class gugu {
    public static void gugudan(int start, int end) {
        for (int a = start; a < end + 1; a++) {
            for (int i = 1; i < 10; i++) {
                System.out.println(a + "x" + i + "=" + a * i);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        gugudan(start,end);
        
     
     
 } 
}