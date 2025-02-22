import java.util.Scanner;

public class String1010 {

    // Function to calculate the minimum number of operations for each test case
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] c=null;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int counter=0;
            c=sc.next().toCharArray();
            for(int j=0;j<c.length;j++){
                if (c[j]=='1')counter++;
            }
            System.out.println(counter);
        }
}
}
