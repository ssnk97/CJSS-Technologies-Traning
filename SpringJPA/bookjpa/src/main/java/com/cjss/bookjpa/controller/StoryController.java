package com.cjss.bookjpa.controller;

import com.cjss.bookjpa.entity.Story;
import com.cjss.bookjpa.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/story")
public class StoryController {
    @Autowired
    StoryRepository storyRepository;
    @ResponseBody
    @RequestMapping(value = "/stories")
    public List<Story> getBookDetails() {
        List<Story> storyresponse = (List<Story>) storyRepository.findAll();
        return storyresponse;
    }
}
