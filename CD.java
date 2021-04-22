import java.util.ArrayList;
/**
 * A Digital verion of an album
 * @author Brady Ruth
 */
public class CD implements DigitalAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;

    public CD(String track1, String track2, String track3, String track4, String track5) {
        this.songs.add(track1);
        this.songs.add(track2);
        this.songs.add(track3);
        this.songs.add(track4);
        this.songs.add(track5);
        this.currentIndex = 0;
    }
    /**
     * Creates a String displaying the first song of the CD and advances the song by 1
     * @return the first song in the album
     */
    public String playFromBeginning() {
        currentIndex++;
        return "Playing song 1: "+songs.get(0);
    }
    /**
     * Creates a String displaying the desired song on the CD
     * @return A String kdisplaying the song number being passed in
     */
    public String playSong(int song) {
        currentIndex = song+1;
        if (song < 1 || song > 5) {
            return "Not a valid song number";
        }
        return "Playing song "+song+": "+songs.get(currentIndex);
    }
    /**
     * Creates a String displaying the current song on the CD and advances the song by 1
     * @return the current song on the CD
     */
    public String nextSong() {
        if (currentIndex > 4) {  // The last song has been passed
            currentIndex = 0;
        }
        currentIndex++;
        return "Playing song "+(currentIndex)+": "+songs.get(currentIndex-1);
    }
    /**
     * Creates a String displaying the previous song on the CD and rewinds the song by 1
     * @return the previous song on the CD
     */
    public String prevSong() {
        if (currentIndex < 0) {
            currentIndex = 0;  // If attempting to rewind past the first song, set to first song
        }
        currentIndex--;
        return "Skipping back and playing song "+(currentIndex)+": "+songs.get(currentIndex-1);
    }

    /**
     * Creates a String displaying "Pausing"
     * @return "Pausing"
     */
    public String pause() {
        return "Pausing";
    }
    /**
     * Resets the current index to 0 and creates a String to display that the CD is stopped
     * @return "Stopping CD and ejecting"
     */
    public String stop() {
        currentIndex = 0;  // Return to the beginning of the CD
        return "Stopping CD and ejecting";
    }
    
}
