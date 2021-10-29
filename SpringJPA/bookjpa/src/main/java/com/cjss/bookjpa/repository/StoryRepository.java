package com.cjss.bookjpa.repository;

import com.cjss.bookjpa.entity.Story;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story, String> {

}
