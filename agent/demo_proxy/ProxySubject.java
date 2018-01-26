package demo_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxySubject implements InvocationHandler {

    public AbstractSubject abstractSubject;

    public ProxySubject(AbstractSubject abstractSubject) {
        this.abstractSubject = abstractSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(abstractSubject, args);
        return null;
    }

}
