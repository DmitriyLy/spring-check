package net.dmly.refference.dependencies.collections;

import org.springframework.beans.factory.InitializingBean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionsContainer implements InitializingBean {
    private Properties adminEmails;
    private List<String> stringList;
    private Map<Integer, String> keyValueMap;
    private Set<Command> commandSet;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(String.format("CollectionsContainer >\n adminEmails: %s;\n stringList: %s;\n" +
                        " keyValueMap: %s;\n commandSet: %s",
                adminEmails, stringList, keyValueMap, commandSet));
    }

    public void setAdminEmails(Properties adminEmails) {
        this.adminEmails = adminEmails;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setKeyValueMap(Map<Integer, String> keyValueMap) {
        this.keyValueMap = keyValueMap;
    }

    public void setCommandSet(Set<Command> commandSet) {
        this.commandSet = commandSet;
    }
}
