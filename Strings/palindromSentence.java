public class palindromSentence {
    public static void main(String[] args) {
        String s1="Madam malayalam is difficult level language";
        String words[]=s1.split(" "),s2=" ";
        for(int i=0;i<words.length;i++)
        {
            s2=new StringBuffer(words[i]).reverse()+" ";
            if(words[i].equals( s2))
            System.out.println(words[i]);
        }
    }
    
}
