package com.tomato.repository;

import com.tomato.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {

   List<Course> findByCategory(String categoty);

   List<Course> findByCategoryOrderByName(String categoty);

   //checks if a course with provided name exists
   boolean existsByName(String name);

   //returns the count of courses for the provided category
   int countByCategory(String categoty);

   // find all courses that start with provided course name
   List<Course> findByNameStartsWith(String name);

   // find all courses by category and returns stream
  // Stream<Course> streamByCategory(String category);
}
