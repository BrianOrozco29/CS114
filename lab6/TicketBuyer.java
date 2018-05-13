package lab6;

/**
 * Customer represents a waiting customer.
 *
 */
public class TicketBuyer
{
    private static int arrivalTime;
	private static int departureTime;

    /**
     * Creates a new customer with the specified arrival time.
     * @param arrives the arrival time
     */
    public TicketBuyer(int arrives)
    {
        arrivalTime = arrives;
        departureTime = 0;
    }

    /**
     * Returns the arrival time of this customer.
     * @return the arrival time
     */
    public static int getArrivalTime()
    {
        return arrivalTime;
    }

    /**
     * Sets the departure time for this customer.
     * @param departs the departure time
     **/
    public static void setDepartureTime(int departs)
    {
        departureTime = departs;
    }
   
    /**
     * Returns the departure time of this customer.
     * @return the departure time
     */
    public int getDepartureTime()
    {
        return departureTime;
    }

    /**
     * Computes and returns the total time spent by this customer.
     * @return the total customer time
     */
    public static int totalTime()
    {
        return departureTime - arrivalTime;
    }
}

