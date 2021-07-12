package net.dmly.refference.jpetstore.services;

import net.dmly.refference.jpetstore.dao.jpa.JpaAccountDao;
import net.dmly.refference.jpetstore.dao.jpa.JpaItemDao;

import java.util.List;

public class PetStoreServiceImpl implements PetStoreService {
    private JpaAccountDao accountDao;
    private JpaItemDao itemDao;

    public JpaAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(JpaAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public JpaItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(JpaItemDao itemDao) {
        this.itemDao = itemDao;
    }

    @Override
    public List<String> getUsernameList() {
        return List.of("john_doe", "jane_roe");
    }
}
