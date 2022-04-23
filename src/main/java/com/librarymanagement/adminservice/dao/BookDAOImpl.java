package com.librarymanagement.adminservice.dao;

import com.librarymanagement.adminservice.entity.Books;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class BookDAOImpl implements BookDAOInterface{

    private EntityManager entityManager;

    @Autowired
    public BookDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void saveBookDetails(Books books) {

        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(books);
    }
}
