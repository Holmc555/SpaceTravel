package com.spacetravel;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class PlanetCrudService {
    public void save(Planet planet) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(planet);
            transaction.commit();
        }
    }

    public Planet get(String id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Planet.class, id);
        }
    }

    public List<Planet> getAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Planet> query = session.createQuery("from Planet", Planet.class);
            return query.list();
        }
    }

    public void update(Planet planet) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(planet);
            transaction.commit();
        }
    }

    public void delete(Planet planet) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(planet);
            transaction.commit();
        }
    }
}
