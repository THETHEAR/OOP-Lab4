import java.util.Scanner;

public class Lab3_1 {
    
    static void hrs_money(int hrs){
        int money = hrs*120;
        System.out.println(money);
    }

    static void OT_money(int hrs){
        int OT = hrs-40;
        int OTmoney =+ OT*20;
        int money = ((hrs-OT)*120)+OTmoney; 
        System.out.println(money);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int hrs = sc.nextInt();
        if(hrs<=40){
            hrs_money(hrs);
        }
        else if(hrs>40){
            OT_money(hrs);
        }

    }
}