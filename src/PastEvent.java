import java.time.LocalDate;
public class PastEvent {
    public static final double eventCost=10_000;

    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private String paymentDetails;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private int totalParticipants;
    private int totalEventDays;
    
    public PastEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact,int totalParticipants, int totalEventDays, LocalDate eventStartDate, LocalDate eventEndDate,
        String paymentStatus, boolean requiresExtension) {
        this.eventID=eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventPointOfContact = eventPointOfContact;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
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
    public String getEventID() {
        return eventID;
    }
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public String getEventLocation() {
        return eventLocation;
    }
    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }
    public String getEventPointOfContact() {
        return eventPointOfContact;
    }
    public void setEventPointOfContact(String eventPointOfContact) {
        this.eventPointOfContact = eventPointOfContact;
    }
    public int getTotalParticipants() {
        return totalParticipants;
    }
    public void setTotalParticipants(int totalParticipants) {
        this.totalParticipants = totalParticipants;
    }
    public int getTotalEventDays() {
        return totalEventDays;
    }
    public void setTotalEventDays(int totalEventDays) {
        this.totalEventDays = totalEventDays;
    }
    @Override
    public String toString() {
        return "Past event details:"+"\n"+
        "Event ID:" +eventID+"\n"+
        "Event Name:" + eventName+"\n"+
        "Event location:" + eventLocation+"\n"+
        "Total participants:" + totalParticipants+"\n"+
        "Total event days:" + totalEventDays+"\n"+
        "Past event start Date:" + eventStartDate + "\n"+
        "Past event end Date:" + eventEndDate + "\n"+
        "PaymentDetails=" + paymentDetails+"\n";
    }

    
    

}
