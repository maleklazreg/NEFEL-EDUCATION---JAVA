import java.util.HashMap;

public class TrackList {
    public HashMap<String, String> createTrackList() {
        HashMap<String, String> trackList = new HashMap<>();

        trackList.put("Supermassive Black Hole", 
            "Ooh, baby, don't you know I suffer? Ooh, baby, can you hear me moan?");
        trackList.put("Hysteria", 
            "It's bugging me, grating me, and twisting me around");
        trackList.put("Time Is Running Out", 
            "I think I'm drowning, asphyxiated, I wanna break this spell");
        trackList.put("Starlight", 
            "Far away, this ship is taking me far away");

        return trackList;
    }

    public void displayTracks(HashMap<String, String> trackList) {
        String sampleSong = trackList.get("hysteria");
        System.out.println("Sample song: " + sampleSong);

        System.out.println("Full Track List:");
        for (String title : trackList.keySet()) {
            System.out.println("track: " + title + ", lyrics: " + trackList.get(title));
        }
    }
}