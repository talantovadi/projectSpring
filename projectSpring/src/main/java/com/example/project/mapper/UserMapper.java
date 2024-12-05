package com.example.project.mapper;

import com.example.project.DTO.user.UserCreateDTO;
import com.example.project.DTO.user.UserResponseDTO;
import com.example.project.DTO.user.UserUpdateDTO;
import com.example.project.entity.User;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponseDTO toUserResponse(User user);


    User toEntity(UserCreateDTO userRequest);
    User toEntityFromUserUpdate(UserUpdateDTO user);



    default Page<UserResponseDTO> toUserResponsePage(Page<User> userPage) {
        return userPage.map(this::toUserResponse);
    }
}

