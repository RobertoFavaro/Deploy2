package co.develhope.deploy2.controllers;

import co.develhope.deploy2.services.RandomIntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/random-int")
public class RandomIntController {
    //    @Autowired
//    private Environment environment;
    @Autowired
    private RandomIntService randomIntService;

    @GetMapping
    public ResponseEntity<Integer> getSum() {
        return ResponseEntity.ok(randomIntService.getSum());
    }
}