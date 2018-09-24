package com.ikirsanov.springsecurityapp.dao;

import com.ikirsanov.springsecurityapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {

}
