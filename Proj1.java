import java.util.*;
class Proj1
    {
        void number()
            {
                Scanner sc = new Scanner(System.in);
                long no = sc.nextLong();
                int d = 0, s =  0, x = 0, t = 0, c = 0;
                while(no>0)
                    {
                        d = (int)no%10;
                        s = s*10+d;
                        no/=10;
                        c++;
                    }
                int a[] = new int[c];
                while(s>0)
                    {
                        d = s%10;
                        int fl = 0;
                        for(int i = 0; i<x; i++)
                            
                            if(a[i]==d) 
                                {
                                    fl = 1;
                                    break;
                                }
                            if(fl==0)
                                a[x++] = d;
                                s/=10;
                            }
                            for(int i = 0; i<x; i++)
                                t = t*10 + a[i];
                            System.out.println(t);
                    }
            void palin()
                    {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter a sentence");
                        String s = sc.nextLine(); int c = 0;
                        s = s.trim(); s = s + " "; String t = "", m = "";
                        for(int i = 0; i<s.length();i++)
                            {
                                char ch = s.charAt(i);
                                if(ch!=' '){ m = m + ch;
                                    t = ch + t; }
                                else
                                    {
                                        if (t.equals(m)) {
                                            System.out.println(m);
                                            c++;
                                        }
                                        t="";
                                        m="";
                                    }
                            }
                        System.out.println("Number of palindromic words: " + c);
                    }
            
        public static void main(String[] args) {
            Proj1 obj = new Proj1();
            obj.number();
            obj.palin();
        }
    }