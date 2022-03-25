//program to shift string towards left side----->means shifting the starting (nth character) characters towards right side
public class LeftShift {
    public static void main(String[] args) {
        String s1="abcXYZ";
        int n=2;
        for(int i=n;i<s1.length();i++)
        {
            s1=s1.charAt(s1.length()-1)+s1.substring(0,s1.length()-1);
            // s1=s1.substring(s1.length()-1)+s1.substring(0,s1.length()-1);
        }
        System.out.println(s1);
    }
    
}

/*public class LeftShift {
    public static void main(String[] args) {
        String s1="abcXYZ";
        int n=2;
        for(int i=n;i<s1.length();i++)
        {
        
            s1=s1.substring(n)+s1.substring(0,n);
        }
        System.out.println(s1);
    }
    
}

/*public class LeftShift {
    public static void main(String[] args) {
        String s1="abcXYZ";
        int n=2;
        int t=s1.length()-1;
        
        for(int i=n;i<s1.length();i++)
        {
            s1=s1.charAt(t)+s1.substring(0,t);
            // s1=s1.substring(t)+s1.substring(0,t);
        }
        System.out.println(s1);
    }
    
}*/

