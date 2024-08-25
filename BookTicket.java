package railway_reservation_system;
import java.util.*;
public class BookTicket {
	
	static int availableLowerBerths = 1;//normally 21
    static int availableMiddleBerths = 1;//normally 21
    static int availableUpperBerths = 1;//normally 21
    static int availableRacTickets = 1;//normally 18
    static int availableWaitingList = 1;//normally 10
    
    static List<Integer> booked = new ArrayList<>();
    static Queue<Integer> rac = new LinkedList<>();
    static Queue<Integer> wl = new LinkedList<>();
    
    static List<Integer> racPos = new ArrayList<>(Arrays.asList(1));
    static List<Integer> wlPos = new ArrayList<>(Arrays.asList(1));
    static List<Integer> low = new ArrayList<>(Arrays.asList(1));
    static List<Integer> mid = new ArrayList<>(Arrays.asList(1));
    static List<Integer> up = new ArrayList<>(Arrays.asList(1));


    static HashMap<Integer, PassengerDetail> pass = new HashMap<>();
    
    public void bookTicket(PassengerDetail p,int pos, String ab) {
    	p.number = pos;
    	p.alloted = ab;
    	
    	pass.put(p.passengerId, p);
    	
    	booked.add(p.passengerId);
    	
    }
    public void bookRacTicket(PassengerDetail p,int pos, String ab) {
    	p.number = pos;
    	p.alloted = ab;
    	
    	pass.put(p.passengerId, p);
    	
    	rac.add(p.passengerId);
    	
    } public void bookWlTicket(PassengerDetail p,int pos, String ab) {
    	p.number = pos;
    	p.alloted = ab;
    	
    	pass.put(p.passengerId, p);
    	
    	wl.add(p.passengerId);
    	
    }
    

}
