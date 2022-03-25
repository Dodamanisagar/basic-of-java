/*program to find the index value of
 a given character in a string*/
public class indexOfGivenCharacter {
    public static void main(String[] args) {
        String a="programming";
        char x='i';
        boolean flag=false;
        int i;
       for( i=0;i<a.charAt(i);i++)
        {
            if(x==a.charAt(i))
            {
                flag=true;
                break;
            }
        }
        if(flag)
        System.out.println(i);
        else
        System.out.println(-1);
        }
    }
