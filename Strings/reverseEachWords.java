// //program to reverse the each words of a given string
// public class reverseEachWords {
//     public static void main(String[] args) {
//         String s1="java programming language is easy to learn";
//         String s2=" ";
//         for(int i=0;i<s1.length();i++)
//         {
//             if(s1.charAt(i)==' '|| i==s1.length()-1)
//             {
//                 if(i==s1.length()-1)
//                  {
//                      s2=s2+s1.charAt(i);
//                  }
//                  String s3="";
//                  for(int j=s2.length()-1;j>0;j--)
//                  {
//                     s3=s3+s2.charAt(j);
//                  }
//                     System.out.print(s3+" ");//sopln prints line by line
//                     s2=" ";
//                     continue;
//                 }

//             s2=s2+s1.charAt(i);
//         }
        
//     }
    
// }

public class reverseEachWords {
        public static void main(String[] args) {
             String s1="java programming language is easy to learn";
             String s2="";
             String words[]=s1.split(" ");
             for(int i=0 ;i<words.length;i++)
             {
                 s2=s2+new StringBuffer(words[i]).reverse()+" ";
              }
              System.out.println(s2);

            }

            }

