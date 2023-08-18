package exercises.solutions.E5;

import exercises.solutions.E5.music.*;

public class MusicApp {
    public static void main(String[] args) {
        Song song1 = new Song("15 minuter från Eslöv", "Östen sjunger Ruben Nilson", "Östen Warnerbring", 178);
        Song song2 = new Song("Rhyme of the Ancient Mariner", "Powerslave", "Iron Maiden", 811);
        Song song3 = new Song("Mr. November", "Alligator", "The National", 294);
        Song song4 = new Song("Toxic", "In The Zone", "Britney Spears", 202);
        Song song5 = new Song("You Are Always On My Mind", "Introspective", "Pet Shop Boys", 217);

        Playlist mySongs = new Playlist("My Favourite songs", 5);

        System.out.println(mySongs.getSongs().length);

        mySongs.addSong(song1);
        mySongs.addSong(song2);
        mySongs.addSong(song3);
        mySongs.addSong(song4);
        mySongs.addSong(song5);
        
        mySongs.printSongs();

        System.out.println("The total duration of songs in " + mySongs.getName() + " is " + mySongs.computeTotalDuration() + " seconds.");
    }
}
