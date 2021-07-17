package net.dmly.refference.container.java_based_config.bean_annotation;

import net.dmly.refference.container.java_based_config.bean_annotation.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanAnnotationController {
    private final TransferService transferService;
    private NavigationService navigationService;

    @Autowired
    public BeanAnnotationController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostConstruct
    public void init() {
        navigationService.navigate();
        transferService.transfer();
        System.out.println("BeanAnnotationController");
    }

    @Autowired
    public void setNavigationService(NavigationService navigationService) {
        this.navigationService = navigationService;
    }
}
