//program to find the last index of the given charecter if it is present in a string
public class lastIndexOfGivenCharacter {
    public static void main(String[] args) {
        String s1="abrakadabra";
        char x='b';
        boolean flag=false;
        int i;
        for( i=s1.length()-1;i>=0;i--)
        {
            if(x==s1.charAt(i));
            flag=true;
            break;
        }
        if(flag)
        System.out.println(i);
        else
        System.out.println(-1);
    }
    
}
