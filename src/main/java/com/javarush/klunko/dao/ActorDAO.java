package com.javarush.klunko.dao;

import com.javarush.klunko.domein.Actor;
import org.hibernate.SessionFactory;

public class ActorDAO extends GenericDAO<Actor> {
    public ActorDAO(SessionFactory sessionFactory){
        super(Actor.class, sessionFactory);
    }
}
