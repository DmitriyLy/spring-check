package net.dmly.refference.container.annotation.qualifier.impl;

import net.dmly.refference.container.annotation.qualifier.DataProvider;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class MainDataProvider implements DataProvider {
    @Override
    public String provide() {
        return StringUtils.EMPTY + "MainDataProvider#provide";
    }
}
