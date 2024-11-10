import java.util.*;
class Time
    {
        int hh, mm;
        Time()
            {
            hh=mm=0;
        }
                
            
        void readtime()
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number of hours:");
                this.hh = sc.nextInt();
                System.out.println("Enter number of minutes");
                this.mm = sc.nextInt();
            }
            Time addtime(Time X)
                {
                    int x = X.hh*60 + X.mm;
                    int y = this.hh*60 + this.mm;
                    int z = x + y;
                    int h1 = z/60;
                    z = z%60;
                    int m1 = z;
                    Time O = new Time();
                    O.hh = h1; 
                    O.mm = m1;
                    return O;
                }
            Tim difftime(Time X)
                {
                    int x = X.hh*60 + X.mm;
                    int y = this.hh*60 + this.mm;
                    int z = (int)(Math.abs(x-y));
                    int h1 = z/60;
                    z = z%60;
                    int m1 = z;
                    Time O = new Time();
                    O.hh = h1;
                    O.mm = m1;
                    return O;
                }
            void disptime(){
                System.out.println(this.hh + " hours " + this.mm + " minutes ");
            }
             public static void main(String[] args) {
                
            
                
                    Time A = new Time();
                    A.readtime(); A.disptime();
                    Time b = new Time();
                    b.readtime(); b.disptime();
                    System.out.println("Sum:");
                    Time S = A.addtime(b);
                    S.disptime();
                    System.out.println("Difference:");
                    Time D = A.difftime(b);
                    D.disptime();
                }
            
    }
