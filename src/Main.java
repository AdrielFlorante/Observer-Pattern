public class Main {
    public static void main(String[] args) {
        // Create the NewsAgency instance
        NewsAgency newsAgency = new NewsAgency();

        // Create subscribers
        Subscriber subscriber1 = new UserSubscriber("Rune");
        Subscriber subscriber2 = new UserSubscriber("Alice");
        Subscriber subscriber3 = new UserSubscriber("Bob");

        // Subscribe users to the news agency
        newsAgency.addSubscriber(subscriber1);
        newsAgency.addSubscriber(subscriber2);

        // Publish breaking news
        newsAgency.publishNews("Big Tech Stocks are Rising!");

        // Unsubscribe one user
        newsAgency.removeSubscriber(subscriber1);

        // Publish more news
        newsAgency.publishNews("News Flash: Will My Parents Love Me For Who I Am?!");

        // Add a new subscriber
        newsAgency.addSubscriber(subscriber3);

        // Publish another news
        newsAgency.publishNews("Sports: Jake Paul Beats Mike Tyson In Exhibition Match!");
    }
}
