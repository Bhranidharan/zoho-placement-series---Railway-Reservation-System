package railway_reservation_system;
import java.util.*;
public class Main {
	
	public static void bookTicket(PassengerDetail p) {
		
		BookTicket ticket = new BookTicket();
		
		if(ticket.availableWaitingList == 0) {
			System.out.println("No Tickets Available");
		}
		
		if((ticket.availableLowerBerths > 0 && p.berthPreference.equals("l")) || 
				(ticket.availableMiddleBerths > 0 && p.berthPreference.equals("m")) || 
				(ticket.availableUpperBerths > 0 && p.berthPreference.equals("u"))) {
			if(p.berthPreference.equals("l")) {
				
				ticket.bookTicket(p, ticket.low.get(0), "l");
				ticket.low.remove(0);
				ticket.availableLowerBerths--;
				
			}else if(p.berthPreference.equals("m")) {
				
				ticket.bookTicket(p, ticket.mid.get(0), "m");
				ticket.mid.remove(0);
				ticket.availableMiddleBerths--;
				
			}else if(p.berthPreference.equals("u")) {
				
				ticket.bookTicket(p, ticket.up.get(0), "u");
				ticket.up.remove(0);
				ticket.availableUpperBerths--;
				
			}
		}else if(ticket.availableUpperBerths > 0)
        {
			
            
            System.out.println(p.berthPreference+"Upper Berth Given");
            //call booking function in the TicketBooker class
            ticket.bookTicket(p,(ticket.up.get(0)),"u");
            //remove the booked position from available positions and also decrease available seats of that
            // particular type
            ticket.up.remove(0);
            ticket.availableUpperBerths--;
            
        }
		else if(ticket.availableMiddleBerths > 0)
        {
            
            System.out.println("Middle Berth Given");
            //call booking function in the TicketBooker class
            ticket.bookTicket(p,(ticket.mid.get(0)),"u");
            //remove the booked position from available positions and also decrease available seats of that
            // particular type
            ticket.mid.remove(0);
            ticket.availableMiddleBerths--;
            
        }else if(ticket.availableLowerBerths > 0)
        {
            
            System.out.println("Lower Berth Given");
            //call booking function in the TicketBooker class
            ticket.bookTicket(p,(ticket.low.get(0)),"u");
            //remove the booked position from available positions and also decrease available seats of that
            // particular type
            ticket.low.remove(0);
            ticket.availableLowerBerths--;
            
        }else if(ticket.availableRacTickets > 0)
        {
            
            System.out.println("RAC Given");
            //call booking function in the TicketBooker class
            ticket.bookRacTicket(p,(ticket.racPos.get(0)),"rac");
            //remove the booked position from available positions and also decrease available seats of that
            // particular type
            ticket.racPos.remove(0);
            ticket.availableRacTickets--;
            
        }else if(ticket.availableWaitingList > 0)
        {
            
            System.out.println("Upper Berth Given");
            //call booking function in the TicketBooker class
            ticket.bookWlTicket(p,(ticket.wlPos.get(0)),"u");
            //remove the booked position from available positions and also decrease available seats of that
            // particular type
            ticket.wlPos.remove(0);
            ticket.availableWaitingList--;
            
        }
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner an = new Scanner(System.in);
		
		System.out.print("1.) Book Ticket \n 2.) Delete Ticket \n 3.) View Ticket \n 4.) Available Ticket \n 5.) Exit  ");
		
		int opt = an.nextInt();
		
		boolean loop = true;
		
		while(loop) {
			switch(opt){
			
			case 1:{
				String name = an.next();
				int age = an.nextInt();
				an.next();
				String pb = an.nextLine();
				PassengerDetail p = new PassengerDetail(name, age, pb);
				
				bookTicket(p);
				break;
				
			}
				
				
			}
		}

	}

}
