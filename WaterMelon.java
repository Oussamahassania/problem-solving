import java.util.Scanner;

public class WaterMelon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kg=sc.nextInt();
        if(kg%2==0 && kg!=2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
