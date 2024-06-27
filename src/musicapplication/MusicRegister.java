package musicapplication;

public class MusicRegister {
    public void register(Music music) {
        var encoder = new MusicEncoder();
        encoder.encode(music);
        var db = new MusicDB();
        db.save(music);

        var service = new MessageService();
        service.sendSms(music.getArtist());
    }
}
