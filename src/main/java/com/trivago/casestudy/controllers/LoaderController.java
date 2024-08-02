package com.trivago.casestudy.controllers;

import com.trivago.casestudy.services.FileDataLoaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoaderController {

    private final FileDataLoaderService fileDataLoaderService;

    @Autowired
    public LoaderController(FileDataLoaderService fileDataLoaderService) {
        this.fileDataLoaderService = fileDataLoaderService;
    }

    @PostMapping("load/")
    public void loadResource(@RequestBody String resource) {
        fileDataLoaderService.loadResource(resource);
    }
}
