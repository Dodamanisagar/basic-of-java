/*program to find product of total number of special characters and 
index of first special character*/
/*public class NoOfSpecialCharmultiplyIndexofFirstSpecialChar {
    public static void main(String[] args) {
        String s1="sh@r#i-Q?";
        int count=0,product;
        for(int i=0;i<s1.length();i++)
        {
             char x=s1.charAt(i);
             if(!((x>='0'&& x<='9') || (x>='a'&& x<='z') || (x>='A'&& x<='Z')))
             count++;
        }
        product=count*s1.indexOf('@');//hard coding, not good practice
        System.out.println(product);
     }
}
*/


public class NoOfSpecialCharmultiplyIndexofFirstSpecialChar {
    public static void main(String[] args) {
        String s1="sh@r#i-Q?";
        int count=0;
        //to find total number of special charecters
        for(int i=0;i<s1.length();i++)
        {
             char x=s1.charAt(i);
             if(!((x>='0'&& x<='9') || (x>='a'&& x<='z') || (x>='A'&& x<='Z')))
             count++;
        }
        //to find first special character
        int i;
        for( i=0;i<s1.length();i++)
        {
            char x=s1.charAt(i);
             if(!((x>='0'&& x<='9') ||(x>='a'&& x<='z') || (x>='A'&& x<='Z')))
             break;

        }
        System.out.println(count*i);
     }
}
