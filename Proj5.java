import java.util.*;
class Proj5
    {
        String reverse(String s) {
            String t = "";
            s = s.trim();
            for(int i = 0; i<s.length(); i++)
                {
                    char ch = s.charAt(i);
                    t = ch + t;
                }
            return t;
        }
            public static void main(String args[])
            {   
                Proj5 obj = new Proj5();
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of the String Array:");
                int x = sc.nextInt();
                String a[] = new String[x];
                for(int i = 0; i<a.length; i++)
                    {
                        System.out.println("Enter ACII in reverse order:");
                        a[i] = sc.next();
                    }
                String t="", m = "";
                for(int i = 0; i<a.length; i++)
                    {
                        t = obj.reverse(a[i]);
                        int no = Integer.parseInt(t);
                        m = m + (char)no;
                    }
                System.out.println(m);
            }
    }
