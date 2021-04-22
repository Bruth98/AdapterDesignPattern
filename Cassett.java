import java.util.ArrayList;
/**
 * An analog verison of an anlbum
 * @author Brady Ruth
 */
public class Cassett implements AnalogAlbum {

    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;
    
    /**
     * Creates a Cassett with 5 songs, ready to start the first song
     * @param track1
     * @param track2
     * @param track3
     * @param track4
     * @param track5
     */
    public Cassett(String track1, String track2, String track3, String track4, String track5) {
        this.songs.add(track1);
        this.songs.add(track2);
        this.songs.add(track3);
        this.songs.add(track4);
        this.songs.add(track5);
        this.currentIndex = 0;
    }

    /**
     * Creates a String displaying the current song being played on the Cassett then advances the song by 1
     * @return the current song being played on the Cassett
     */
    public String play() {
        if (this.currentIndex == 5) {  // If the currentIndex == 5, then there is no more Songs in the ArrayList
            return "At the end of the cassett you need to rewind";
        }
        currentIndex++;  // Advance the song by 1
        return "Playing song "+(currentIndex)+": "+songs.get(currentIndex-1);  // Since currentIndex has already been advanced, don't need to add a +1 for song num.
                                                                               // Also need to subtract currentIndex by 1 to retrieve correct song from ArrayList
    }

    /**
     * Creates a string displaying the previous song on the Cassett
     * @return Rewinding to song "previous song"
     */
    public String rewind() {
        currentIndex--;  // Rewind the index by 1
        if (currentIndex <= 0) {  // If the index is at the first song
            return "Fully Re-Wound";
        }
        return "Rewinding to song "+(currentIndex+1); 
    }

    /**
     * Creates a string displaying different results based off of what song is currently on the Cassett
     * @return "At the end of the cassett you need to rewind" if the currentIndex = 5
     * @return "Forwarded to end of the cassett" if the currentIndex = 4
     * @return "forwarding to song ..." if currentIndex < 4
     */
    public String ffwd() {
        this.currentIndex++;
        if (currentIndex == 5) {
            return "At the end of the cassett you need to rewind";
        }
        else if (currentIndex == 4) {
            return "Forwarded to the end of the cassett";
        }
        return "Forwarding to song "+(currentIndex+1); 
    }

    /**
     * Creates a String to pause the Cassett
     * @return "Pausing"
     */
    public String pause() {
        return "Pausing";
    }

    /**
     * Creates a String to stop the Cassett
     * @return "Stopping cassett and ejecting"
     */
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }


}
