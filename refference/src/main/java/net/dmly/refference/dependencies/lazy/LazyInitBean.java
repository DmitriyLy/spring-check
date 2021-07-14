package net.dmly.refference.dependencies.lazy;


import org.springframework.beans.factory.InitializingBean;

public class LazyInitBean implements InitializingBean {
    private final String value;

    public LazyInitBean(String value) {
        this.value = value;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(String.format("LazyInitBean > value: %s", value));
    }
}
