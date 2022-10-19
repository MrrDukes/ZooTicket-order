import java.util.ArrayList;
import java.util.Scanner;

public class Zootickets {
    public static void main(String[]args) {

        ArrayList<Ticket> tickets = new ArrayList<Ticket>();
        Scanner scanner =new Scanner(System.in);

        boolean Buyingtickets = true;
        double ticketTotal = 0;
        while (Buyingtickets==true){
            System.out.println("what kind of tickets do you want to buy? ");
            System.out.println("we got the Child: Regular: Senior: ");

            System.out.println("Children 12 and under get $2 off the regular price, seniors 65 and over get $1 off the regular price, and everyone else pays regular price");
            String input = scanner.next();

            Ticket ticket = new Ticket();
            if (input.equals("Child")) {
                ticket.ticketPrice= 8;
                ticket.type = "Child";
                ticketTotal = ticketTotal + 8;
                tickets.add(ticket);
            }       else if (input.equals("Senior")) {
                ticket.ticketPrice = 9;
                ticket.type = "Senior";
                ticketTotal = ticketTotal + 9;
                tickets.add(ticket);
            }
            else if(input.equals("Regular")) {
                ticket.ticketPrice = 10;
                ticket.type = "Regular";
                ticketTotal = ticketTotal + 10;
                tickets.add(ticket);
            }
            System.out.println("Are you done buying tickets?");
            String response = scanner.next();
            if ( response.equals("yes")) {
                Buyingtickets = false;

            }//end if
        }//end while loop

    }//end class
}//end main

