package net.dmly.refference.lifecycle.applicationcontextaware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PreDestroy;

public class ApplicationContextAwareLocalImpl implements ApplicationContextAware, BeanNameAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(String.format("ApplicationContextAwareLocalImpl#setApplicationContext >\n applicationContext: %s", applicationContext));
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(String.format("ApplicationContextAwareLocalImpl#setBeanName > name: %s", name));
    }

    @PreDestroy
    private void destroy() {
        System.out.println("ApplicationContextAwareLocalImpl#destroy");
    }
}
