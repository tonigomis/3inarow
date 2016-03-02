import java.io.*;
import java.lang.*;
public class Prova{
    public static void main(String args[])throws IOException {
        InputStreamReader reader =new InputStreamReader(System.in);
        BufferedReader input =new BufferedReader(reader);
        String Alphabet[] =new String[5];
        Alphabet[0]=" * ******************************* ************ ** * ** ******************************** ** **** ** ******";
        Alphabet[1]="* ** ** * ** * * * * * * * * * * * ** * ** ** ** ** ** * * ** ** * * * ";
        Alphabet[2]="*********** * **** *** * ***** * * ** * * ** *** ******* * *********** * * ** ** * * * * * ";
        Alphabet[3]="* ** ** * ** * * **** * * * * * * * ** ** ** * *** * * * * * * * ** ** * * * * ";
        Alphabet[4]="* ********************** *** ** ********* * ******* ** ******* ****** * ***** * ***** * * ** * * *****";
        String s1;
        char ch,s;
        int x;
        System.out.println("Please enter the String");
        s1=input.readLine();
        s1=s1.toUpperCase();
        for(int j=0;j<5;j++)
        {
            System.out.println();
            for(int k=0;k<s1.length();k++)
            {
                ch=s1.charAt(k);
                x=ch-65;
                System.out.print(" ");
                for(int a=(x*5);a<(x*5)+5;a++)
                {
                    s=Alphabet[j].charAt(a);
                    System.out.print(s);
                }
                System.out.print(" ");
            }
        }
    }
}