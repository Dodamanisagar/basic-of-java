//program to convert given sting into upper-case string
public class convertToUppercaseString {
    public static void main(String[] args) {
        String s1="Sagar";
        String s2=" ";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)>=90 && s1.charAt(i)<=122)
            s2=s2+(char)(s1.charAt(i)-32);/*type casting is needed because after substracting 32 it will 
                                    converted into integer but we need result in char(string)*/
            else
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);
    }
    
}
