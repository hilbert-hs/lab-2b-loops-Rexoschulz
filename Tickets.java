import java.util.Scanner;
public class Tickets{
public static void main(String[] args) {
  // write your code here
  Scanner scan = new Scanner(System.in);
  double box = 75.0;
  double pavilion = 30.0;
  double lawn = 21.0;
  double total = 0.00;
  String ticket = scan.nextLine();
  while (!ticket.equals("Q")){
    if(!ticket.equals("Q") && !ticket.equals("B") && !ticket.equals("P") && !ticket.equals("L")){
      while(!ticket.equals("Q") && !ticket.equals("B") && !ticket.equals("P") && !ticket.equals("L")){
        System.out.println("")
        ticket = scan.nextLine();
      }
    }
    if(ticket.equals("B")){
      total = box + 1.50;
    }else if(ticket.equals("P")){
      total = pavilion + 1.50;
    }else if(ticket.equals("L")){
      total = lawn + 1.50;
    }
    ticket = scan.nextLine();
  }
  System.out.println("Your total is $" + total);
  scan.close();
}
}
// write any helper methods here
