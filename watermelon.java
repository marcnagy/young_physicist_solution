import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        if(x<=2 || x%2==1)System.out.println("NO");
        else System.out.println("YES");
    }
}
