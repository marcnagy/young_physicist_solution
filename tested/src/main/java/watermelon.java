import java.util.Scanner;

public class watermelon {
    public static String wm(){
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
       if(x<1||x>100)return null;
        if(x<=2 || x%2==1)return ("NO");
        else return ("YES");
    }
    public static void main(String[] args) {
        System.out.println(wm());
    }
}
