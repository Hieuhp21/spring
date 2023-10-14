package com.example.de2.respository;

import com.example.de2.models.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRespoitory {
    List<Category> getAll();
    Category findById(int  categoryId);
}
