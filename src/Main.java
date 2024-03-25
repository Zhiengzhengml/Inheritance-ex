import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        ConferenceEvent conferenceEvent = new ConferenceEvent("001", "aa", "AA", "zz", 50, 3, 5, 6, 7);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);
        MusicConcertEvent musicconcertEvent = new MusicConcertEvent("002","bb","BB","mm",200,2,50);
        musicconcertEvent.calculateEventCost();
        System.out.println(musicconcertEvent);
        String startDate = "2024-03-23";
        String endDate = "2024-03-25";
        LocalDate eventStartDate = LocalDate.parse(startDate);
        LocalDate eventEndDate = LocalDate.parse(endDate);
        PastEvent pastEvent = new PastEvent("003","cc","CC","ll",50,3,eventStartDate,eventEndDate,"Paid",true);
        pastEvent.setPaymentDetails("Paid",true);
        System.out.println(pastEvent);
    }
}