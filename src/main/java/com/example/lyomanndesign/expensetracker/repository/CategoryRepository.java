package com.example.lyomanndesign.expensetracker.repository;

import com.example.lyomanndesign.expensetracker.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);

}
