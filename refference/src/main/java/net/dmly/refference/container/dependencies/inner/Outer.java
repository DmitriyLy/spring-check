package net.dmly.refference.container.dependencies.inner;

import org.springframework.beans.factory.InitializingBean;

public class Outer implements InitializingBean {
    private Inner inner;

    public void setInner(Inner inner) {
        this.inner = inner;
    }

    private void destroy() {
        System.out.println("Outer bean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(String.format("Outer > inner: %s", inner));
    }
}
