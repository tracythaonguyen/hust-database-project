package hust.globalict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hust.globalict.repository.CategoryRepository;

@Controller
public class CategoryController {
	@Autowired
    private CategoryRepository categoryRepo;
}
