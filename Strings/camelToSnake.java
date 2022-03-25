public class camelToSnake {
    public static void main(String[] args) {
        String s1="She Is very Beautiful";
        String words[]=s1.split(" ");
        String s2=" ";
        for(int i=0;i<words.length;i++)
        {
            s2=s2+(char)(words[i].charAt(0)+32)+words[i].substring(1)+"_";
            if(i!=words.length-1)
            s2=s2+"_";
            }
            System.out.println(s1);
    }
    
}
