//161066021143
package flight;
//5.1
public class FlightUI
{

    public static void main(String[] args)
    {
       //5.2
       FlightManager fm = new FlightManager();
       //5.3
       fm.sort();
        System.out.println("Tickets sorted:");
        System.out.println("--------------");
        System.out.println(fm.allTickets());
        
         //6.3
        System.out.println();
        System.out.println("Most Frequent Flyer");
        System.out.println("-------------------");
        System.out.println(fm.frequentFlyer()); 
    }
    
}
