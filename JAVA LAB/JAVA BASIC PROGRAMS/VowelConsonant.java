import java.util.Scanner;
public class VowelConsonant 
{
public static void main(String args[])
{
System.out.println("Enter a character :");
Scanner sc = new Scanner(System.in);
char ch = sc.next().charAt(0);
if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
{
System.out.println("Vowel");
}
else
{
System.out.println("Consonant");
}
}
}