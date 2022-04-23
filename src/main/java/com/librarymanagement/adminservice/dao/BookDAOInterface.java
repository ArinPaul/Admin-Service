package com.librarymanagement.adminservice.dao;

import com.librarymanagement.adminservice.entity.Books;
import org.springframework.transaction.annotation.Transactional;

public interface BookDAOInterface {

    public void saveBookDetails(Books books);

}
