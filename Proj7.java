import java.util.*;
class Proj7
    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a sentence:");
            String s = sc.nextLine();
            String x = "AEIOUaeiou";
            String a = "", b = "", u = "";
            for(int i = 0; i<s.length(); i++)
                {   char ch = s.charAt(i);
                    if(ch!=' '&&ch!='.'&&ch!='?'&&ch!='!')
                        {
                            if(x.indexOf(ch)!=-1)
                                a = a + ch;
                            else
                                b = b + ch;
                        }
                    else    
                        { 
                            if(i==s.length()-1)
                                u = u + " " + a + b + ch;
                            else
                                u = u + " " + a + b;
                            a = b = "";
                        }
                }
            s = u.trim();
            System.out.println(s);
        }
    }