//161066021143
package flight;
//3.1
public class Ticket
{
    //3.2
    private String ticketID;
    private String name;
    private Flight departingFlight;
    private Flight returningFlight;

    //3.3
    public Ticket(String ticketID, String name, Flight departingFlight
    ,Flight returningFlight)
    {
        this.ticketID = ticketID;
        this.name = name;
        this.departingFlight = departingFlight;
        this.returningFlight = returningFlight;
    }
    //3.4
    public String getName()
    {
        return name;
    }

    //3.5
    public Flight getDepartingFlight()
    {
        return departingFlight;
    }

    public Flight getReturningFlight()
    {
        return returningFlight;
    }
    //3.6
    public double getTotalCost()
    {
        return departingFlight.getCost() + returningFlight.getCost();
    }
    //3.7
    public String toString()
    {
        return ticketID + "\t" + name + "\t" + getTotalCost() + "\n"
        + departingFlight + "\n" + returningFlight + "\n";
    }
    
    
    
}
