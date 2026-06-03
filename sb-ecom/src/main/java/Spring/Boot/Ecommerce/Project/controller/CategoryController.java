package Spring.Boot.Ecommerce.Project.controller;
import Spring.Boot.Ecommerce.Project.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
@RestController

public class CategoryController {



        private List<Category> categories = new ArrayList<>();

        @GetMapping("/api/public/categories")
        public List<Category> getAllCategories() {
            return categories;
        }

    @PostMapping("/api/public/categories")
    public String createCategory(@RequestBody Category category){
        categories.add(category);
        return "Category added successfully";
    }
    }

