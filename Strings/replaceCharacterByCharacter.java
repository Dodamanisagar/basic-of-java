//program to replace a character by character in a given string
public class replaceCharacterByCharacter {
    public static void main(String[] args) {
        String s1="Ramayan";
        String s2=" ";
        char key='a';
        char x='@';
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==key)
            s2=s2+x;
            else
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);
    }
    
}
