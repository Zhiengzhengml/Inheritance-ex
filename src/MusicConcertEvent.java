public class MusicConcertEvent{
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private double musiceventCost;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private int totalParticipants;
    private int totalEventDays;
    private CalculateEventCostClass calculateEventCostObject;

    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, int totalParticipants, int totalEventDays,double merchandiseCost){
        this.calculateEventCostObject=new CalculateEventCostClass();
        this.eventID=eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventPointOfContact = eventPointOfContact;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
        this.merchandiseCost=merchandiseCost;
    }
    
    public void calculateEventCost(){
        musiceventCost = calculateEventCostObject.calculateEventCost()+(getMerchandiseCost()*getTotalParticipants())*getTotalEventDays();
    }


    public void setMerchandiseRequired(boolean merchandiseRequired){
        this.merchandiseRequired=merchandiseRequired;
    }
    public boolean isMerchandiseRequired(){
        return merchandiseRequired;
    }
    public void setMerchandiseCost(double merchandiseCost){
        this.merchandiseCost=merchandiseCost;
    }
    public double getMerchandiseCost(){
        return merchandiseCost;
    }
    public double getMusiceventCost() {
        return musiceventCost;
    }
    public void setMusiceventCost(double musiceventCost) {
        this.musiceventCost = musiceventCost;
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
    public CalculateEventCostClass getCalculateEventCostObject() {
        return calculateEventCostObject;
    }
    public void setCalculateEventCostObject(CalculateEventCostClass calculateEventCostObject) {
        this.calculateEventCostObject = calculateEventCostObject;
    }
 
    @Override
    public String toString() {
        return "Music Concert Event details:"+"\n"+
        "Event ID:"+eventID+"\n"+
        "Event Name:" + eventName+"\n"+
        "Event location:" + eventLocation+"\n"+
        "Total participants:" + totalParticipants+"\n"+
        "Total event days:" + totalEventDays+"\n"+
        "Total Music Concert event cost:" + musiceventCost+"\n";
    }





}