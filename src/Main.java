import java.net.ProxySelector;

public class Main {
    public static void main(String[] args) {

        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("Cristina Ferreira a Presidente da República.");

        System.out.println(observable.getNews());

        observable.deleteObserver(observer);
        observable.countObservers();
    }
}