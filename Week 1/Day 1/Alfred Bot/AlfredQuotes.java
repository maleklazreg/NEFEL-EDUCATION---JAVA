import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "placeholder for guest greeting return string";
    }
    
    public String dateAnnouncement() {
        Date today = new Date();
        return "placeholder for date announcement return string" + today;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")){
            return "I'm better than Alexis!";
        }
        else if (conversation.contains("Alferd")) {
            return "yes sirn i'm here!";
        }
        else {
            return "i'll be back soon!";
        }
    }

    public String guestGreenting(String name, String timeOfDay) {
        return "good" + timeOfDay + " " + name + "!";
    }

    public String shout(String words) {
        return words.toUpperCase() + "!!!";
    }
    

}

