//161066021143
package flight;
//2.1
public class Flight
{
    //2.2
    private String code,origin,destination,departureTime,arrivalTime;
    private double cost;
    
    //2.3
    public Flight(String code, String origin, String destination, String departureTime, String arrivalTime, double cost)
    {
        this.code = code;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.cost = cost;
    }

    //2.4
    public String getCode()
    {
        return code;
    }

    public String getDepartureTime()
    {
        return departureTime;
    }


    public double getCost()
    {
        return cost;
    }
    //2.5
    public String toString()
    {
        return code + "\t" + origin + " " + departureTime + "\t" + destination 
        + " " + arrivalTime;
    }
     //6.1
    public int getDuration()
    {         
        int endTime = Integer.parseInt(arrivalTime.substring(11,13)) * 60
        + Integer.parseInt(arrivalTime.substring(14, 16));
        
        int startTime = Integer.parseInt(departureTime.substring(11,13)) * 60
        + Integer.parseInt(departureTime.substring(14, 16));
        
        return endTime - startTime;       
    }
}
