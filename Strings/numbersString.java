// program to find the sum of the numbers present in a given string
public class numbersString {
    public static void main(String[] args) {
        String s1="sagar123gmailcom";
        int sum=0;
        for(int i=0;i<s1.length();i++)
        {
            char x=s1.charAt(i);
            if(x>='0' && x<='9')
            sum=sum+x-48;

        }
        System.out.println(sum);
    }
    
}
