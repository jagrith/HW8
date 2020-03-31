package hw8;

public interface Publisher {

	public void registerObserver(Observer O);
	public void removeObserver(Observer O);
	public void notifyObserver(Observer O);
	
}
