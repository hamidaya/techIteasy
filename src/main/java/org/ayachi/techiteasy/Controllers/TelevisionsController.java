package org.ayachi.techiteasy.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/televisions")
@RestController


public class TelevisionsController {
    @GetMapping("")
    public ResponseEntity<String> getTelevisions() {

        return ResponseEntity.ok("televisions");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getTelevision(@PathVariable Integer id) {
        System.out.println(id.toString());
        return ResponseEntity.ok("television id = " + id);
    }

    //
    @PostMapping()
    public ResponseEntity<Void> addTelevision(@RequestBody String television) {
        System.out.println(television);
        return ResponseEntity.created(null).build();

    }
}


