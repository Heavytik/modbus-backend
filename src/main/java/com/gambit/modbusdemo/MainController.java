package com.gambit.modbusdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @CrossOrigin(origins = "https://amazing-elion-9a43e9.netlify.app/")
    @PostMapping(
            value = "/api",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String postAction(@RequestBody FileText fileText) {
        ConverterService converter = new ConverterService(fileText);
        return converter.getEntities().toString();
    }
}