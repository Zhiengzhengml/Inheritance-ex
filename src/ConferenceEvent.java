public class ConferenceEvent {
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    private double conferenceEventCost;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private int totalParticipants;
    private int totalEventDays;
    private CalculateEventCostClass calculateEventCostObject;

    public ConferenceEvent(String eventID,String eventName,String eventLocation,String eventPointOfContact,int totalParticipants,int totalEventDays,double breakfastCost,double lunchCost,double dinnerCost) { 
        this.calculateEventCostObject=new CalculateEventCostClass();
        this.eventID=eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventPointOfContact = eventPointOfContact;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
        this.breakfastCost=breakfastCost;
        this.lunchCost=lunchCost;
        this.dinnerCost=dinnerCost;
    }

    public void calculateEventCost(){  
        conferenceEventCost = calculateEventCostObject.calculateEventCost()+(getBreakfastCost()+getLunchCost()+ getDinnerCost())*getTotalParticipants()*getTotalEventDays();
    }



    public boolean isBreakfastRequired() {
        return breakfastRequired;
    }
    public void setBreakfastRequired(boolean breakfastRequired) {
        this.breakfastRequired = breakfastRequired;
    }
    public double getBreakfastCost() {
        return breakfastCost;
    }
    public void setBreakfastCost(double breakfastCost) {
        this.breakfastCost = breakfastCost;
    }
    public boolean isLunchRequired() {
        return lunchRequired;
    }
    public void setLunchRequired(boolean lunchRequired) {
        this.lunchRequired = lunchRequired;
    }
    public double getLunchCost() {
        return lunchCost;
    }
    public void setLunchCost(double lunchCost) {
        this.lunchCost = lunchCost;
    }
    public boolean isDinnerRequired() {
        return dinnerRequired;
    }
    public void setDinnerRequired(boolean dinnerRequired) {
        this.dinnerRequired = dinnerRequired;
    }
    public double getDinnerCost() {
        return dinnerCost;
    }
    public void setDinnerCost(double dinnerCost) {
        this.dinnerCost = dinnerCost;
    }

    public double getConferenceEventCost() {
        return conferenceEventCost;
    }
    public void setConferenceEventCost(double conferenceEventCost) {
        this.conferenceEventCost = conferenceEventCost;
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
        return "Conference Event details:"+"\n"+
        "Event ID:"+eventID+"\n"+
        "Event Name:" + eventName+"\n"+
        "Event location:" + eventLocation+"\n"+
        "Total participants:" + totalParticipants+"\n"+
        "Total event days:" + totalEventDays+"\n"+
        "Total Conference cost:" + conferenceEventCost +"\n";
    }
    
}
