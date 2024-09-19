package com.anncodes.dreamshops.repository.category;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anncodes.dreamshops.model.Category;
import java.util.List;


public interface CategoryRepository extends JpaRepository<Category, Long> {

 Category findByName(String name);

boolean existsByName(String name);
}
