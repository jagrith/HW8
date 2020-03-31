package hw8;

public interface Observer {

	public boolean notifyObserver(Event E);
	public void unregisterMe(PublisherImplementation p);
}
