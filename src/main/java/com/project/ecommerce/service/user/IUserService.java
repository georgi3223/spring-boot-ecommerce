package com.project.ecommerce.service.user;

import com.project.ecommerce.dto.UserDto;
import com.project.ecommerce.model.User;
import com.project.ecommerce.request.CreateUserRequest;
import com.project.ecommerce.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}
