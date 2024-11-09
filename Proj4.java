import java.util.*;
class Proj4{
    Scanner sc=new Scanner(System.in);
    int base, power; double sum;
    void input(){
        System.out.println("Enter base :");
        base=sc.nextInt();
    }
    void series1(){
       sum=base;
       for(int i=2;i<power;i++){
           int f=1;
           for(int j=1;j<=i+1;j++)
               f*=j;
           sum=sum+Math.pow(base, i)/f;
       }
       System.out.println("Sum of series:"+sum);
    }
    void series2(){
        int a=0, b=1, c=0;
        for(int i=1;i<=power;i++){
            c=a+b;
            b=a; a=c;
            if(i%3!=0)
            sum+=Math.pow(base, i)/c;
            else sum-=Math.pow(base, i)/c;}
            System.out.println("Sum of series:"+sum);
        
    }
    public static void main(String[] args) {
        Proj4 obj = new Proj4(); Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for series 1 and 2 for series 2:");
        int ch=sc.nextInt();
        switch(ch){
            case 1: obj.input();
            obj.power=6;
            obj.series1();
            break;
            case 2: obj.input();
             System.out.println("Enter power :");
             obj.power=sc.nextInt();
            obj.series2();
            break;
            default: System.out.println("Invalid choice");
        }
    }
}