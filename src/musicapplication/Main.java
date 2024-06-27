package musicapplication;

public class Main {

    public static void main(String[] args) {
        var music = new Music();
        music.setTitle("Song 1");

        var artist = new Artist();
        artist.setFirstName("John");
        artist.setLastName("Doe");
        music.setArtist(artist);

        var register = new MusicRegister();
        register.register(music);
    }
}
