import java.util.Observable;
import java.util.Observer;

public class NewsChannel implements Observer {
    @Override
    public void update(Observable o, Object news) {
        this.setNews((String) news);
    }

    private void setNews(String news) {
    }

}
