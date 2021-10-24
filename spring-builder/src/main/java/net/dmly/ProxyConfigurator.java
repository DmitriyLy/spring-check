package net.dmly;

public interface ProxyConfigurator {
    Object replaceWithProxyInNeeded(Object t, Class implClass);
}
