import java.util.*;
class proj2{
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number within 2047:");
        int n=sc.nextInt();
        if(n<=2047){
            decitobi(n);
            decitooctal(n);
            decitohex(n);
        }
        else System.out.print("Invalid input");
    }
    void decitobi(int n){
        int a[]=new int[10], x=0, s=0;
        while(n>0){
            a[x++]=n%2;
            n/=2;
        }
        x=a.length-1;
        for(;x>=0;)
        s=s*10+a[x--];
        System.out.println("Binary:"+s);
    }
    void decitooctal(int n){
        int b[]=new int[5], x=0, s=0;
        while(n>0){
            b[x++]=n%8;
            n/=8;
        }
        x=b.length-1;
        for(;x>=0;)
        s=s*10+b[x--];
        System.out.println("Octal:"+s);
    }
    void decitohex(int n){
       String c[]=new String[3], s="";
       int x=0;
       while(n>0){
           int d=n%16;
           if(d<10) c[x++]=Integer.toString(d);
           else c[x++]=Character.toString((char)(d+55));
           n/=16;
       }
       x--;
       for(;x>=0;)
        s=s+c[x--];
        System.out.println("Hexadecimal:"+s);
    }
    public static void main(String[] args) {
        proj2 obj = new proj2(); obj.accept();
    }
}