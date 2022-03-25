//program to raverse half string and shift rest half string towards right side with n characters
public class halfReserseHalfShift {
    public static void main(String[] args) {
        String s1="sagarDodamani";
        int n=s1.length()/2;
        String s2=s1.substring( 0, n-1);
        String s3=s1.substring(n-1,s1.length());
        // System.out.println(s2);
        // System.out.println(s3);
        String s4="";
        for(int i=s2.length()-1;i>=0;i--)
        {
            s4=s4+s2.charAt(i);
        }
        System.out.println(s4);
        int n1=2;
        s3=s3.substring( s3.length()-n1)+s3.substring(0,s3.length()-n1);
        // System.out.println(s3);
        System.out.println(s4+s3);
    }
    
}
