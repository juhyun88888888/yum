package com.example.yum;

import com.example.yum.category.Category;
import com.example.yum.category.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class YumApplication {


	public static void main(String[] args) {


		SpringApplication.run(YumApplication.class, args);




	}

}
