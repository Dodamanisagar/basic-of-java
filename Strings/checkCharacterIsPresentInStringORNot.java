//program to check given character is present in string or not
public class checkCharacterIsPresentInStringORNot{
    public static void main(String[] args) {
        String s1="sagar";
        char c='j';
        boolean flag=false;
        for(int i=0;i<s1.length();i++)
        {
            if(c==s1.charAt(i))
            {
                flag=true;
                break;
            }

        }
        if(flag)
        System.out.println("true");
        else
        System.out.println("false");
    }
}