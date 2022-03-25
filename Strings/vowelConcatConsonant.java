//program to find vowels present in 1st string and consonant from 2nd string and concating vowels and consonants
/*class vowelConcatConsonant
{
    public static void main(String[] args) {
        String s1="SagAr",s2="AnuJa",s3=" ";

      for(int i=0;i<s1.length();i++)
      {char x=s1.charAt(i);
          if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||
             x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
             s3=s3+s1.charAt(i);
      }

      for(int i=0;i<s2.length();i++) 
      {char x=s2.charAt(i);
        if(!(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||
           x=='A'||x=='E'||x=='I'||x=='O'||x=='U'))
           s3=s3+s2.charAt(i);
    }
    System.out.println(s3);

    }
}
*/
//another methor
/*to avoid comparing with uppercase letters first convert strings into
 lower case using toLowercase()*/

 class vowelConcatConsonant
{
    public static void main(String[] args) {
        String s1="SagAr",s2="AnuJa",s3=" ";

      for(int i=0;i<s1.length();i++)
      {char x=Character.toLowerCase(s1.charAt(i));
          if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
             s3=s3+s1.charAt(i);
      }

      for(int i=0;i<s2.length();i++) 
      {char x=Character.toLowerCase(s2.charAt(i));
        if(!(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'))
           s3=s3+s2.charAt(i);
    }
    System.out.println(s3);

    }
}
