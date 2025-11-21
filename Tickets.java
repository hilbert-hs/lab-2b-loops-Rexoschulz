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
  int totalB = 0;
  int totalP = 0;
  int totalL = 0;
  double total = 0.00;
  System.out.println("What kinda ticket do you want.");
  String ticket = scan.nextLine();
  while (!ticket.toLowerCase().equals("q")){
    if(!ticket.toLowerCase().equals("q") && !ticket.toLowerCase().equals("b") && !ticket.toLowerCase().equals("p") && !ticket.toLowerCase().equals("l")){
      while(!ticket.toLowerCase().equals("q") && !ticket.toLowerCase().equals("b") && !ticket.toLowerCase().equals("p") && !ticket.toLowerCase().equals("l")){
        System.out.println("That is not a ticket type. Try again.");
        ticket = scan.nextLine();
      }
    }
    if(ticket.toLowerCase().equals("b")){
      total = box + 1.50;
      numBox += box;
      totalB += 1;
    }else if(ticket.toLowerCase().equals("p")){
      total = pavilion + 1.50;
      numPavilion += pavilion;
      totalP += 1;
    }else if(ticket.toLowerCase().equals("l")){
      total = lawn + 1.50;
      numLawn += lawn;
      totalL += 1;
    }
    fee += 1.50;
    System.out.println("What kinda ticket do you want.");
    ticket = scan.nextLine();
  }
  System.out.println("You have " + totalB + " box tickets. " + "Your total for box tickets is $" + numBox + "0.");
  System.out.println("You have " + totalP + " pavilion tickets. " + "Your total for pavilion tickets is $" + numPavilion + "0.");
  System.out.println("You have " + totalL + " lawn tickets. " + "Your total for lawn tickets is $" + numLawn + "0.");
  System.out.println("Your convenience fee is $" + fee + "0.");
  System.out.println("Your total is $" + total + "0");
  scan.close();
}
}
// write any helper methods here
