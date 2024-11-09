import java.util.*;
class Tim
    {
        int hh, mm;
        Tim()
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
            Tim addtime(Tim X)
                {
                    int x = X.hh*60 + X.mm;
                    int y = this.hh*60 + this.mm;
                    int z = x + y;
                    int h1 = z/60;
                    z = z%60;
                    int m1 = z;
                    Tim O = new Tim();
                    O.hh = h1; 
                    O.mm = m1;
                    return O;
                }
            Tim difftime(Tim X)
                {
                    int x = X.hh*60 + X.mm;
                    int y = this.hh*60 + this.mm;
                    int z = (int)(Math.abs(x-y));
                    int h1 = z/60;
                    z = z%60;
                    int m1 = z;
                    Tim O = new Tim();
                    O.hh = h1;
                    O.mm = m1;
                    return O;
                }
            void disptime(){
                System.out.println(this.hh + " hours " + this.mm + " minutes ");
            }
             public static void main(String[] args) {
                
            
                
                    Tim A = new Tim();
                    A.readtime(); A.disptime();
                    Tim b = new Tim();
                    b.readtime(); b.disptime();
                    System.out.println("Sum:");
                    Tim S = A.addtime(b);
                    S.disptime();
                    System.out.println("Difference:");
                    Tim D = A.difftime(b);
                    D.disptime();
                }
            
    }