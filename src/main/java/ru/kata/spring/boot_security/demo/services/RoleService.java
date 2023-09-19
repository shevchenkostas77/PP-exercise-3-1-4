package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    Set<Role> findAllByIdIn(List<Long> roleIds);

    List<Role> getAll();
}
