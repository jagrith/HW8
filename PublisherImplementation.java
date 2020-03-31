package hw8;
import java.util.ArrayList;
import java.util.List;

public class PublisherImplementation implements Publisher{
	public PublisherImplementation()
	{}
	
	private List<Observer> subscribers = new ArrayList<Observer>();

	public void registerObserver(Observer O) {
		 subscribers.add(O);
		
	}
	
	
	public void notifyObserver(Observer O) {
		
	}


	public void removeObserver(Observer O) {
		subscribers.remove(0);
	}


	
	private Event generateevent(int i)
	{   
	    int data = (int)(Math.random() * 5000 + 1);	
		Event e = new Event(i, data);
		return e;
	}
		
	public void runsimulation()
	{
		PublisherImplementation pub =new PublisherImplementation();
		Observer Odds= new SubscriberOdds();
		Observer Evens = new SubscriberEvens();
		Observer Threes = new SubscriberThrees();
		
		pub.registerObserver(Odds);
		pub.registerObserver(Evens);
		pub.registerObserver(Threes);		
		for(int i=1;i<201;i++)
		{
	
			if(i==40 || i==80 || i==120 || i==160 || i==200)
			 {
					if(!pub.subscribers.contains(Odds))
					{
						pub.registerObserver(Odds);
			        }			
					if(!pub.subscribers.contains(Threes))
					{
						pub.registerObserver(Threes);
					}
			    }
		}		
	}

}