package exercises.solutions.E5.music;

public class Song {
    private String title;
    private String album;
    private String artist;
    private double duration;

    public Song(String title, String album, String artist, double duration) {
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.duration = duration;
        }
    
    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }
}
