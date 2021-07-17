package net.dmly.refference.container.java_based_config.bean_annotation.service.impl;

import net.dmly.refference.container.java_based_config.bean_annotation.service.GpsService;
import org.springframework.stereotype.Component;

@Component
public class GpsServiceImpl implements GpsService {
    @Override
    public String provideLocation() {
        System.out.println("GpsServiceImpl#provideLocation()");
        return "GpsServiceImpl#provideLocation()";
    }
}
