package com.ead.authuser.services;

import com.ead.authuser.models.UserModel;
import com.ead.authuser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserServices {

      List<UserModel> findAll();

      Optional<UserModel> findById(UUID userId);

      void delete(UserModel userModel);

      void save(UserModel userModel);

      boolean existsByUsername(String userName);

      boolean existsByEmail(String email);
      Page<UserModel> findAll(Specification<UserModel> spec, Pageable pageable);
}
