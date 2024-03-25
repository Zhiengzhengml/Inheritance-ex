import java.time.LocalDate;
public class PastEvent extends Event {
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    public static final double eventCost=10_000;
    private String paymentDetails;
    
    public PastEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact,
            int totalParticipants, int totalEventDays, LocalDate eventStartDate, LocalDate eventEndDate,
            String paymentStatus, boolean requiresExtension) {
        super(eventID, eventName, eventLocation, eventPointOfContact, totalParticipants, totalEventDays);
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.paymentStatus = paymentStatus;
        this.requiresExtension = requiresExtension;
    }

    public LocalDate getEventStartDate() {
        return eventStartDate;
    }
    public void setEventStartDate(LocalDate eventStartDate) {
        this.eventStartDate = eventStartDate;
    }
    public LocalDate getEventEndDate() {
        return eventEndDate;
    }
    public void setEventEndDate(LocalDate eventEndDate) {
        this.eventEndDate = eventEndDate;
    }
    public String getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public boolean isRequiresExtension() {
        return requiresExtension;
    }
    public void setRequiresExtension(boolean requiresExtension) {
        this.requiresExtension = requiresExtension;
    }
    public static double getEventcost() {
        return eventCost;
    }
    public String getPaymentDetails() {
        return paymentDetails;
    }
    public void setPaymentDetails(String paymentStatus,boolean requiresExtension) {
        this.paymentDetails = "The event cost was " +  eventCost + " and the payment status is " + paymentStatus + 
        "\n" + "The Customer requires extension?: " + requiresExtension;
    }

    @Override
    public String toString() {
        return "Past event details:"+"\n"+
        "Event ID:" +getEventID()+"\n"+
        "Event Name:" + getEventName()+"\n"+
        "Event location:" + getEventLocation()+"\n"+
        "Total participants:" + getTotalParticipants()+"\n"+
        "Past event start Date:" + eventStartDate + "\n"+
        "Past event end Date:" + eventEndDate + "\n"+
        "PaymentDetails=" + paymentDetails;
    }

   
    

}
