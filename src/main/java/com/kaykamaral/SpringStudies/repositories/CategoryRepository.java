package com.kaykamaral.SpringStudies.repositories;

import com.kaykamaral.SpringStudies.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {



}