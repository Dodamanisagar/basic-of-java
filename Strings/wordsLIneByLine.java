//program to print words of the string line by line
/*public class wordsLIneByLine {
    public static void main(String[] args) {
        String s1="java programming language is easy to learn";
        String words[]=s1.split( " ");
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]);
        }
    }
}*/

// public class wordsLIneByLine {
//     public static void main(String[] args) {
//         String s1="java programming language is easy to learn";
//         for(int i=0;i<s1.length();i++)
//         {
//             if(s1.charAt(i)==' ')
//             {
//                 System.out.println();
//                 continue;
//             }
//             System.out.print(s1.charAt(i));

//         }
//     }
// }

public class wordsLIneByLine {
        public static void main(String[] args) {
            String s1="java programming language is easy to learn";
            String s2="";
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)==' '|| i==s1.length()-1)
                {
                    if(i==s1.length()-1)
                    {
                        s2=s2+s1.charAt(i);
                    }
                    System.out.println(s2);
                    s2=" ";
                    continue;
                }
                s2=s2+s1.charAt(i);
                }
            }
        }