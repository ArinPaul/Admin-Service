package com.librarymanagement.adminservice.dao;

import com.librarymanagement.adminservice.entity.UserDetails;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class UserDAOImpl implements UserDAOInterface{

    private EntityManager entityManager;

    @Autowired
    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void saveUserDetails(UserDetails userDetails) {

        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(userDetails);
    }
}
