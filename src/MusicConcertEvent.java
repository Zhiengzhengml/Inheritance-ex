public class MusicConcertEvent extends Event implements CalculateEventCostInterface {
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private double musiceventCost;

    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, int totalParticipants, int totalEventDays,double merchandiseCost){
        super(eventID,eventName,eventLocation,eventPointOfContact,totalParticipants,totalEventDays);
        this.merchandiseCost=merchandiseCost;
    }
    
    @Override
    public void calculateEventCost(){
        musiceventCost = getEventCost()+(getMerchandiseCost()*getTotalParticipants())*getTotalEventDays();
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

    @Override
    public String toString() {
        return "Music Concert Event details:"+"\n"+
        "Event ID:"+getEventID()+"\n"+
        "Event Name:" + getEventName()+"\n"+
        "Event location:" + getEventLocation()+"\n"+
        "Total participants:" + getTotalParticipants()+"\n"+
        "Total Music Concert event cost:" + musiceventCost;
    }
 
}