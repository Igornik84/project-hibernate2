package com.javarush.klunko.dao;

import com.javarush.klunko.domein.Category;
import org.hibernate.SessionFactory;

public class CategoryDAO extends GenericDAO<Category>{
    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
