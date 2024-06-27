package musicapplication;

public class MusicDB {
    public void save(Music music) {
        System.out.println("Saving music in a PostGreSQL database");
        System.out.println("Music Title : " + music.getTitle());
        System.out.println("Music Title : " + music.getArtist().getFullName());
        System.out.println("Music saved in DB !");
    }
}
