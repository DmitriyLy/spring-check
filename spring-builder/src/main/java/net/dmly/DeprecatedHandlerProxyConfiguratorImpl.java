package net.dmly;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

public class DeprecatedHandlerProxyConfiguratorImpl implements ProxyConfigurator {
    @Override
    public Object replaceWithProxyInNeeded(Object t, Class implClass) {

        if (implClass.isAnnotationPresent(Deprecated.class)) {

            if (implClass.getAnnotatedInterfaces().length == 0) {
                return Enhancer.create(implClass, (net.sf.cglib.proxy.InvocationHandler) (proxy, method, args) -> {
                    System.out.println("************* WTF !");
                    return method.invoke(t, args);
                });
            }

            return Proxy.newProxyInstance(implClass.getClassLoader(), implClass.getInterfaces(), (proxy, method, args) -> {
                System.out.println("************* WTF !");
                return method.invoke(t, args);
            });
        } else {
            return t;
        }
    }
}
