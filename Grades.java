import java.util.Scanner;
public class Grades {
public static void main(String[] args) {
  //  write your code here
  Scanner scan = new Scanner(System.in);
  System.out.println("How many grades are you putting in.");
  int count = scan.nextInt();
  int sum = 0;
  int num = 0;
  
  for (int i = 0; i < count; i++){
    num = scan.nextInt();
    sum += num;
    
  }
  int average = sum / count;
  System.out.println("The average grade is " + average + ".");
  scan.close();
}
}
// write any helper methods here
