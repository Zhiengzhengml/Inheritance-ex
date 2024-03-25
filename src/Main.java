public class Main {
    public static void main(String[] args){
        ConferenceEvent conferenceEvent = new ConferenceEvent("001", "aa", "Pars", "zz", 50, 2, 5, 6, 7);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);
        MusicConcertEvent musicconcertEvent = new MusicConcertEvent("002","Music","school","xx",200,2,50);
        musicconcertEvent.calculateEventCost();
        System.out.println(musicconcertEvent);
    }
}