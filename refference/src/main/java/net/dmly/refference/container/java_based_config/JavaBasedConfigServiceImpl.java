package net.dmly.refference.container.java_based_config;

import org.springframework.stereotype.Service;

@Service
public class JavaBasedConfigServiceImpl implements JavaBasedConfigService {

    @Override
    public void doStuff() {
        System.out.println("Stuff was made");
    }
}
