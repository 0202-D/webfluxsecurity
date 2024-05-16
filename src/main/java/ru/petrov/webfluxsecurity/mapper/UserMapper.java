package ru.petrov.webfluxsecurity.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import ru.petrov.webfluxsecurity.dto.UserDto;
import ru.petrov.webfluxsecurity.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto map(UserEntity user);

    @InheritInverseConfiguration
    UserEntity map(UserDto user);
}
