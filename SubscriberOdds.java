package hw8;

public class SubscriberOdds implements Observer {
	public boolean notifyObserver(Event E) {return false;}
	public void unregisterMe(PublisherImplementation p) {}
}
