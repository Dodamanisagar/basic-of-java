//program to revers a first half of the given string
/*public class reverseHalfString {
    public static void main(String[] args) {
        String s1="sagarRdodamani";
        String s2=" ";
        int n=s1.length()/2;
        for(int i=n-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2+s1.substring(n));
    }
    
}*/


public class reverseHalfString {
    public static void main(String[] args) {
        String s1="sagarRdodamani";
        String s2=" ";
        int n=s1.length()/2;
        String s3=s1.substring(0, n);
        String s4=s1.substring( n);
        for(int i=s3.length()-1;i>=0;i--)
        {
            s2=s2+s3.charAt(i);
        }
        System.out.println(s2+s4);
    }
    
}


