package Observer;


/**
 * @author liutao
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    /**
     * 当主题发生变化时，这个方法会被调用,以通知所有观察者
     */
    public void notifyObservers();
}
