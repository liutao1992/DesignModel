package Observer;

/**
 * @author liutao
 */
public interface Observer {

    /**
     * 所有观察者都必须实现update方法,以实现观察老接口。
     * 当气象观测值发生变化时，主题会把这些状态值当做方法的参数传给观察者
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure);
}
