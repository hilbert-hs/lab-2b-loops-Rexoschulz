import java.util.Scanner;
public class Tickets{
public static void main(String[] args) {
  // write your code here
  Scanner scan = new Scanner(System.in);
  double box = 75.0;
  double pavilion = 30.0;
  double lawn = 21.0;
  double numBox = 0.0;
  double numPavilion = 0.0;
  double numLawn = 0.0;
  double fee = 0.0;
  double total = 0.00;
  System.out.println("What kinda ticket do you want.");
  String ticket = scan.nextLine();
  while (!ticket.equals("Q")){
    if(!ticket.equals("Q") && !ticket.equals("B") && !ticket.equals("P") && !ticket.equals("L")){
      while(!ticket.equals("Q") && !ticket.equals("B") && !ticket.equals("P") && !ticket.equals("L")){
        System.out.println("That is not a ticket type. Try again.");
        ticket = scan.nextLine();
      }
    }
    if(ticket.equals("B")){
      total = box + 1.50;
      numBox += box;
    }else if(ticket.equals("P")){
      total = pavilion + 1.50;
      numPavilion += pavilion;
    }else if(ticket.equals("L")){
      total = lawn + 1.50;
      numLawn += lawn;
    }
    fee += 1.50;
    System.out.println("What kinda ticket do you want.");
    ticket = scan.nextLine();
  }
  System.out.println("Your total for box tickets is $" + numBox + "0.");
  System.out.println("Your total for pavilion tickets is $" + numPavilion + "0.");
  System.out.println("Your total for lawn tickets is $" + numLawn + "0.");
  System.out.println("Your convenience fee is $" + fee + "0.");
  System.out.println("Your total is $" + total + "0");
  scan.close();
}
}
// write any helper methods here
