package com.librarymanagement.adminservice.manager;

import com.librarymanagement.adminservice.dao.AdminDAOInterface;
import com.librarymanagement.adminservice.dao.BookDAOInterface;
import com.librarymanagement.adminservice.dao.UserDAOInterface;
import com.librarymanagement.adminservice.entity.Books;
import com.librarymanagement.adminservice.entity.UserDetails;
import com.librarymanagement.adminservice.utils.BookInput;
import com.librarymanagement.adminservice.utils.StringRandom;
import com.librarymanagement.adminservice.utils.UserInput;
import org.springframework.beans.factory.annotation.Autowired;

public class ManagerImpl implements ManagerInterface{

    private AdminDAOInterface adminDAOInterface;
    private BookDAOInterface bookDAOInterface;
    private UserDAOInterface userDAOInterface;

    @Autowired
    public ManagerImpl(AdminDAOInterface adminDAOInterface, BookDAOInterface bookDAOInterface, UserDAOInterface userDAOInterface) {
        this.adminDAOInterface = adminDAOInterface;
        this.bookDAOInterface = bookDAOInterface;
        this.userDAOInterface = userDAOInterface;
    }

    @Override
    public void createUser(UserInput userInput) {

        UserDetails theUserDetails = new UserDetails(
                StringRandom.get(),
                userInput.getFirstName(),
                userInput.getLastName(),
                userInput.getPhone(),
                userInput.getEmail(),
                userInput.getPassword()
        );
        userDAOInterface.saveUserDetails(theUserDetails);
    }

    @Override
    public void createBook(BookInput bookInput) {

        Books books = new Books(
                bookInput.getBookName(),
                bookInput.getAuthorName(),
                bookInput.getPublisherName(),
                bookInput.getIsbn(),
                bookInput.getYearOfPub(),
                bookInput.getGenre()
        );

        bookDAOInterface.saveBookDetails(books);
    }


}
