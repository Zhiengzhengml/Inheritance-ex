public class ConferenceEvent extends Event implements CalculateEventCostInterface{
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    private double conferenceEventCost;

    public ConferenceEvent(String eventID,String eventName,String eventLocation,String eventPointOfContact,int totalParticipants,int totalEventDays,double breakfastCost,double lunchCost,double dinnerCost) { 
        super(eventID,eventName,eventLocation,eventPointOfContact,totalParticipants,totalEventDays);
        this.breakfastCost=breakfastCost;
        this.lunchCost=lunchCost;
        this.dinnerCost=dinnerCost;
    }
    @Override
    public void calculateEventCost(){  
        conferenceEventCost = getEventCost()+(getBreakfastCost()+getLunchCost()+ getDinnerCost())*getTotalParticipants()*getTotalEventDays();
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

    @Override
    public String toString() {
        return "Conference Event details:"+"\n"+
        "Event ID:"+getEventID()+"\n"+
        "Event Name:" + getEventName()+"\n"+
        "Event location:" + getEventLocation()+"\n"+
        "Total participants:" + getTotalParticipants()+"\n"+
        "Total Conference cost:" + conferenceEventCost;

    }
    
    
}
