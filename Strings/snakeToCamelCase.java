//program to convert snake case string to camel cse string
/*public class snakeToCamelCase {

        public static void main(String[] args) {
            String s1="She_is_very_beautiful";
            String s2="";
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)=='_'|| i==s1.length()-1)
                {
                    if(i==s1.length()-1)
                    
                        s2=s2+s1.charAt(i);
                    
                        s2=(char)(s2.charAt(0)-32)+s2.substring(1);
                    
                    System.out.println(s2+" ");
                    s2=" ";
                    continue;
                }
                s2=s2+s1.charAt(i);
                }
            }
    }*/

    public class snakeToCamelCase {

        public static void main(String[] args) {
            String s1="She_is_very_beautiful";
            String words[]=s1.split("_");
            String s2=" ";
            for(int i=0;i<words.length;i++)
            
                s2=s2+(char)(words[i].charAt(0)-32)+words[i].substring(1)+" ";
                System.out.println(s1);

            
        }
    }



    

