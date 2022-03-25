//program to shift string towards right--->means shifting n characters towards left side
/*public class rightShift {
    public static void main(String[] args) {
        String s1="abcXYZ";
        int n=2;
        for(int i=n;i<s1.length();i++)
        {
            s1=s1.substring( s1.length()-n)+s1.substring(0,s1.length()-n);
        }
        System.out.println(s1);
    }
}*/

/*public class rightShift {
    public static void main(String[] args) {
        String s1="abcXYZ";
        int n=2;
        int t=s1.length()-n;
        for(int i=n;i<s1.length();i++)
        {
            s1=s1.substring(t)+s1.substring(0,t);
        }
        System.out.println(s1);
    }
}*/
public class rightShift {
    public static void main(String[] args) {
        String s1="abcXYZ";
        int n=2;
        s1=s1.substring( s1.length()-n)+s1.substring(0,s1.length()-n);
        System.out.println(s1);
    }
}
