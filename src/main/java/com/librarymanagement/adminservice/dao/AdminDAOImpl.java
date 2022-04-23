package com.librarymanagement.adminservice.dao;

import com.librarymanagement.adminservice.entity.AdministratorDetails;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class AdminDAOImpl implements AdminDAOInterface{

    private EntityManager entityManager;

    @Autowired
    public AdminDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void saveAdminDetails(AdministratorDetails administratorDetails) {

        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(administratorDetails);
    }
}
