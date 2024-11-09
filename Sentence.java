import java.util.*;
class Sentence
    {
        String WD, sen, arr[];
        Sentence()
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a sentence:");
                this.sen = sc.nextLine();
                this.sen = sen.trim();
                sen = sen + " ";
                int c = 0;
                for(int i = 0; i<sen.length(); i++)
                    {
                        if(sen.charAt(i)==' ')
                            c++;
                    }
                arr = new String[c];
            }
        void extract()
            {
                WD = ""; int x = 0;
                for(int i = 0;i<sen.length();i++)
                    {
                        char ch = sen.charAt(i);
                        if(ch!=' ')
                            WD = WD +ch;
                        else    
                            {
                                arr[x++] = WD; WD = "";
                            }
                    }
            }
        void sort()
            {
                for(int i = 0; i<arr.length-1; i++)
                    {
                        for(int j = 0; j<arr.length-i-1; j++)
                            {
                                if(arr[j].compareTo(arr[j+1])>0)
                                    {
                                        String t = arr[j];
                                        arr[j] = arr[j+1];
                                        arr[j+1] = t;
                                    }
                            }
                    }
            }
        void search(String x)
            {
                int l = 0, u = arr.length-1, fl = 0;
                while(l<=u)
                    {
                        int mid = (l+u)/2;
                        if(arr[mid].compareTo(x)>0)
                            u = mid -1;
                        else if(arr[mid].compareTo(x)<0)
                            l = mid +1;
                        else
                            {
                                System.out.println("Word is present in sentence " + " at the position"  + (mid+1)); fl = 1; break;

                            }
                    }
                if(fl==0)
                    System.out.println("Word is not present");
            }
        void create()
            {
                Scanner sc = new Scanner(System.in);
                Sentence ob = new Sentence();
                System.out.println("Extended sentence:");
                ob.extract(); ob.sort();
                System.out.println("Enter word to search:");
                String m = sc.next();
                ob.search(m);
            }
    }

        
