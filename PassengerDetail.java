package railway_reservation_system;

public class PassengerDetail {
	
	 int id = 1;
	 String name;
	 int age;
	 String berthPreference;
	 String alloted;
	 int passengerId;
	 int number;//seat number
	    public PassengerDetail(String name,int age,String berthPreference)
	    {
	        this.name = name;
	        this.age = age;
	        this.berthPreference = berthPreference;
	        this.passengerId = id++;
	        alloted = "";
	        number = -1;
	    }
	

}
