package com.cg.onlinesweetmartapplication.service;

import java.util.List;

<<<<<<< HEAD
import com.cg.onlinesweetmartapplication.entity.User;
import com.cg.onlinesweetmartapplication.exceptions.UserNotFoundException;

public interface UserService {

	public User addUser(User user);

	public User updateUser(User user) throws UserNotFoundException;

	public User cancelUser(int userId) throws UserNotFoundException;

	public List<User> showAllUsers();
=======
import com.cg.onlinesweetmartapplication.exceptions.UserNotFoundException;
import com.cg.onlinesweetmartapplication.model.UserDTO;

public interface UserService {

	public UserDTO addUser(UserDTO user);

	public UserDTO updateUser(UserDTO user) throws UserNotFoundException;

	public UserDTO cancelUser(int userId) throws UserNotFoundException;

	public List<UserDTO> showAllUsers();
>>>>>>> branch 'master' of https://github.com/sudheer00925/OnlineSweetMart-1.git
}
