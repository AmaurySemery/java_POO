package musicapplication;

public class MessageService {
    public void sendSms(Artist artist) {
        System.out.println(artist.getFullName() + ", Your song has been saved in our platform !");
        System.out.println("Artist notified !");
    }
}
