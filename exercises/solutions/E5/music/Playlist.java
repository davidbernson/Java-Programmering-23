package exercises.solutions.E5.music;

public class Playlist {
    String name;
    int maxItems;
    private Song[] songs;
    int count;
    
    public Playlist(String name, int maxItems) {
        this.name = name;
        this.songs = new Song[maxItems];
        this.count = 0;
    }

    public void addSong(Song song) {
        if (count == songs.length) {
            System.out.println("Error: Maximum number of items reached");
            return;
        }
        
        songs[count] = song;
        count++;
    }

    public void printSongs() {
        System.out.println("Songs in playlist:");
        for (int item = 0; item < songs.length; item++) {
            System.out.println(songs[item].getTitle());
        }
    }

    public double computeTotalDuration() {
        double duration = 0;
        for (int item = 0; item < songs.length; item++) {
            duration += songs[item].getDuration();
        }
        return duration;
    }

    public Song[] getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }
}
