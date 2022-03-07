import java.util.Scanner;

public class yp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x,y,z,xsum=0,ysum=0,zsum=0,n;
        n=sc.nextInt();
        for (int i=0;i<n;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            xsum+=x;
            ysum+=y;
            zsum+=z;
        }
        if(xsum==0 && ysum==0 && zsum==0)
            System.out.println("YES");
        else System.out.println("NO");

    }
}
