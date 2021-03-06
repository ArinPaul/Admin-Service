package com.librarymanagement.adminservice.manager;

import com.librarymanagement.adminservice.utils.BookInput;
import com.librarymanagement.adminservice.utils.UserInput;

public interface ManagerInterface {
    public void createUser(UserInput userInput);
    public void createBook(BookInput bookInput);
}
