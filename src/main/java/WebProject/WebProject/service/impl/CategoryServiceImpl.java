package WebProject.WebProject.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import WebProject.WebProject.entity.Category;
import WebProject.WebProject.repository.CategoryRepository;
import WebProject.WebProject.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	 CategoryRepository categoryRepository;
	
	@Override
	public Category saveCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		return categoryRepository.getById(id);
	}

	@Override
	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void deleteCategoryId(int id) {
		// TODO Auto-generated method stub
		Optional<Category> categoryOptional = categoryRepository.findById(id);

        if (categoryOptional.isPresent()) {
            // Nếu danh mục tồn tại, thực hiện xóa
            categoryRepository.deleteById(id);
        } else {
            // Nếu danh mục không tồn tại, bạn có thể thực hiện xử lý hoặc throw một Exception
            System.out.println("Category is empty!");
        }
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

}
