
public class Lab3_2 {
  
    static void fuc(){
        int []a = {25,2,8,16,35,4};
        int max1 = -999;
        int max2 = -999;
        for(int i=0 ; i<6 ; i++){
            if(a[i]>max1){
                max1 = a[i];

        for(int f=0;f<6;f++){
            if((a[f]>max2)&&(a[f]<max1)){
                max2 = a[f];
        }
    }
    }
    }
    System.out.println(max1+max2);
    }

    public static void main(String[] args) {

    fuc();
  
}
    }