package com.jasontyzzer.fanbarserver.controller;

import com.jasontyzzer.fanbarserver.model.Pin;
import com.jasontyzzer.fanbarserver.repository.PinRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pins", produces = MediaType.APPLICATION_JSON_VALUE)
public class PinController {

    @Autowired
    private PinRepository pinrepo;

    @GetMapping
    public List<Pin> listAllPins(){
        return pinrepo.findAll();
    }

    @PostMapping
    public Pin addPin(@RequestBody Pin newPin) throws URISyntaxException {
        return pinrepo.save(newPin);
    }
}
