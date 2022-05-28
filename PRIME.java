import java.util.*;
public class PRIME {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("Enter the number = ");
        int x= a.nextInt();
        if(x%2==0){
            System.out.print("Number is prime");
        }else{
            System.out.print("Number is not prime");
        }
    }
}