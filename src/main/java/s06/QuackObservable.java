package s06;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
