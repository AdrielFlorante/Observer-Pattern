import java.util.ArrayList;
import java.util.List;

// NewsAgency acts as the Subject
public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    // Add a subscriber to the list
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // Remove a subscriber from the list
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // Notify all subscribers about the breaking news
    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    // Publish breaking news
    public void publishNews(String news) {
        System.out.println("NewsAgency: Breaking news published - " + news);
        notifySubscribers(news);
    }
}
