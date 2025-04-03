import java.util.HashMap;

public class TestTrackList {
    public static void main(String[] args) {
        TrackList music = new TrackList();
        HashMap<String, String> trackList = music.createTrackList();
        music.displayTracks(trackList);
    }
}