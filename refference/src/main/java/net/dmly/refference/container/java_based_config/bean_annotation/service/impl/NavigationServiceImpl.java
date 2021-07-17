package net.dmly.refference.container.java_based_config.bean_annotation.service.impl;

import net.dmly.refference.container.java_based_config.bean_annotation.service.GpsService;
import net.dmly.refference.container.java_based_config.bean_annotation.service.NavigationService;

public class NavigationServiceImpl implements NavigationService {

    private final GpsService gpsService;

    public NavigationServiceImpl(GpsService gpsService) {
        this.gpsService = gpsService;
    }

    @Override
    public String navigate() {
        gpsService.provideLocation();
        System.out.println("NavigationServiceImpl#navigate()");
        return null;
    }
}
