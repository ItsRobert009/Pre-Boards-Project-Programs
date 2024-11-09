import java.util.*;
class Word {
    String a[], b[];
    void input()
        {   
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int no = sc.nextInt();
            a = new String[no];
            b = new String[no];
            for(int i = 0; i<no; i++)
                {
                    System.out.println("Enter a word:"); 
                    a[i] = sc.next();
                }        
        }
    String convert(String p)
        {
            String x = "AEIOUaeiou";
            if(x.indexOf(p.charAt(0))!=-1)
                return p;
            int no = 0;
            for(int i = 0; i<p.length(); i++)
                {
                    if(x.indexOf(p.charAt(i))!=-1)
                        {
                            no = i;
                            break;
                        }
                }
            String s = p.substring(no) + p.substring(0, no) + "ay";
            return s;
        }
    void change()
        {
            for(int i = 0; i<a.length; i++)
                {
                    this.b[i] = this.convert(this.a[i]);
                }
        }
    void display()
        {
            for(int i = 0; i<a.length; i++)
                {
                    System.out.print(a[i] + " ");
                }
            for(int i = 0; i<b.length; i++)
                {
                    System.out.print(b[i] + " ");
                }
        }
    public static void main(String[] args) {
        
            Word ob = new Word();
            ob.input();
            ob.change();
            ob.display();
        }
}
