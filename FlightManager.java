//161066021143
package flight;
//4.1

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FlightManager
{
    //4.2
    Ticket[] tArr = new Ticket[500];
    int count=0;
    
    //4.3
    public FlightManager() 
    {
            try
            { 
                Scanner fIn = new Scanner(new File("tickets.txt")); 
                while (fIn.hasNextLine())              
                {                 
                    String line = fIn.nextLine();   
                    Scanner ticketTokens = new Scanner(line).useDelimiter("#");
                    line = fIn.nextLine();                 
                    Scanner thereTokens = new Scanner(line).useDelimiter("#");
                    line = fIn.nextLine();                 
                    Scanner backTokens = new Scanner(line).useDelimiter("#");
                    Flight thereFlight  = new Flight(thereTokens.next(),
                            thereTokens.next(), thereTokens.next(),
                            thereTokens.next(), thereTokens.next(),
                            thereTokens.nextDouble()); 
                    Flight backFlight  = new Flight(backTokens.next(),
                            backTokens.next(), backTokens.next(),
                            backTokens.next(), backTokens.next(),
                            backTokens.nextDouble());     
                    tArr[count]   = new Ticket(ticketTokens.next(),
                            ticketTokens.next(), thereFlight, backFlight);
                    count++;
                }                          
                fIn.close();
            }         
            catch (IOException e)
            {             
                System.out.println("File not found!");
            } 
    }
    //4.4
    public String allTickets()
    {
        String build = "";
        for(int i = 0; i < count; i++)
        {
            build += tArr[i].toString();
        }
        return build;
    }
    //4.5
    public void sort()
    {
        for(int i = 0; i < count -1; i++)
        {
            for(int j = i+1; j < count; j++)
            {
                if(tArr[i].getDepartingFlight().getDepartureTime()
                .compareTo(tArr[j].getDepartingFlight().getDepartureTime())>0)
                {
                    Ticket temp = tArr[i];
                    tArr[i] = tArr[j];
                    tArr[j] = temp;
                }
                    
            }
        }
    }
    //6.2
    public String frequentFlyer()
    {         
        int maxTime = 0;
        String maxName = "";
        String checkedNames = "";
        for(int i = 0; i < count; i++)
        {             
            int time = 0;
            String currentName = tArr[i].getName();
            if (checkedNames.indexOf(currentName) < 0)
            {                 
                for(int j = 0; j < count; j++)
                {                     
                    if (tArr[j].getName().equals(currentName))
                    {                         
                        time = time +  tArr[j].getDepartingFlight()
                        .getDuration() + tArr[j].getReturningFlight()
                        .getDuration(); 
                    }                 
                }             
            }                         
            checkedNames = checkedNames + currentName;
            if (time > maxTime)
            {                 
                maxTime = time;
                maxName = currentName;
            }         
        }                  
        return maxName + " " + maxTime;
    }  
}
