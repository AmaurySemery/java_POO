package musicapplication;

public class Artist {
    private String lastName;
    private String firstName;
    private String[] listSongs;

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String[] getListSongs() {
        return listSongs;
    }
    public void setListSongs(String[] listSongs) {
        this.listSongs = listSongs;
    }

    
}
