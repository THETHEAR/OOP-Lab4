import java.util.Arrays;
import java.util.Scanner;

public class Lab3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] a;
        int [] b;


        a = new int[size];
        for(int i=0;i < size;i++){
            a[i] = sc.nextInt();
        }

        b = new int[size];

        for(int i=0;i<size;i++){
            b[i] = sc.nextInt();

        }
        int length = a.length + b.length;
        int []c =new int[length];
        int pos = 0 ;
        for (int element : a){
            c[pos] = element ;
            pos++;
        }
        for (int element : b){
            c[pos] = element ;
            pos++;
        }
        Arrays.sort(c);
        float median ;
        if (c.length % 2==0){
            median = ((float)c[c.length/2]+ (float)c[c.length/2-1])/2 ;
        }
        else{
            median = (float) c[c.length/2];
        }
        System.out.printf("%.1f",median);



    }
}