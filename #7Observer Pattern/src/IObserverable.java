public interface IObserverable {
    public void add(IObserver iObserver);
    public void remove(IObserver iObserver);
    public void notifyObservers();
    public String getName();
}
