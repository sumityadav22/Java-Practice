import java.time.LocalDate; // for displaying Date
import java.time.LocalTime; // for displaying Time
import java.time.LocalDateTime; // for displaying Date and Time together


public class javaTimeClass
{
  public static void main(String[] args) 
  {
  	/* Note: We use .now() method for displaying time and date */
    LocalDate dtaeobject = LocalDate.now(); // Create a date object
    System.out.println("Current Date is: "+(dtaeobject));

    LocalTime timeobject = LocalTime.now(); // Create a date object
    System.out.println("Current Time Is: "+timeobject);

    LocalDateTime ldt = LocalDateTime.now();
	System.out.println("Current Date and Time : "+ldt);
	System.out.println("Please Note The 'T' in the output above is used to separate the date from the time");

  }
}