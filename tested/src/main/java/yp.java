import java.util.Scanner;
public class yp {
    static String yoPy(){
        Scanner sc= new Scanner(System.in);
        int x,y,z,xsum=0,ysum=0,zsum=0,n;
        n=sc.nextInt();
       if(n<1 ||n>100)return null;
        for (int i=0;i<n;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
     if(Math.min(Math.min(x,y),z)<-100||Math.max(Math.max(x,y),z)>100) return null;
            xsum+=x;
            ysum+=y;
            zsum+=z;
        }
        if(xsum==0 && ysum==0 && zsum==0)
           return ("YES");
        else return ("NO");

    }
    public static void main(String[] args) {

   System.out.println(yoPy());
    }
}
