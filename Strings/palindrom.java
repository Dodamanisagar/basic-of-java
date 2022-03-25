//program to check whether string is palindrom or not
public class palindrom {
    public static void main(String[] args) {
        String s1="madam";
        String s2="";//dont give space otherwise it will wrong
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        if(s1.equals(s2))
        System.out.println("palindrom");
        else
        System.out.println("not palindrom");
    }
    
}
