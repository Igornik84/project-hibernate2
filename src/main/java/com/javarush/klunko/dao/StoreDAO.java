package com.javarush.klunko.dao;

import com.javarush.klunko.domein.Store;
import org.hibernate.SessionFactory;

public class StoreDAO extends GenericDAO<Store>{
    public StoreDAO(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}
