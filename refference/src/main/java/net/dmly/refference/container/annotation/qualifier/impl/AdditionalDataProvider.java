package net.dmly.refference.container.annotation.qualifier.impl;

import net.dmly.refference.container.annotation.qualifier.DataProvider;
import org.springframework.stereotype.Component;

@Component
public class AdditionalDataProvider implements DataProvider {
    @Override
    public String provide() {
        return "AdditionalDataProvider#provide";
    }
}
