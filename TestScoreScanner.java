import java.util.Scanner;
public class TestScoresScanner {
   public static void main (String[] args) {
   int test1;
   int test2;
   int test3;
   int total, average;
   String firstName;
   String middleInitial;
   String Lastname;
   
   Scanner Inas_KB = new Scanner(System.in);
   
   System.out.println("What is your first name ?");
   firstName = Inas_KB.nextLine();
   
   System.out.println("What is your middle initial ?");
   middleInitial = Inas_KB.nextLine();
   
   System.out.println("What is your last name ?");
   Lastname = Inas_KB.nextline();