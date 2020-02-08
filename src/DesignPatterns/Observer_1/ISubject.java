package DesignPatterns.Observer_1;

public interface ISubject {
	void register(IObserver o);

	void unregister(IObserver o);

	void notifyObservers(int updatedValue);
}
