//program to convert string into lower case string
public class convertToLowercaseString {
    public static void main(String[] args) {
        String s1="SAGAR";
        String s2=" ";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)>='A'&& s1.charAt(i)<='Z')
            s2=s2+(char)(s1.charAt(i)+32);
            else
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);
        
    }
    
}
