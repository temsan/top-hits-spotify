package ru.biryukov.tophitsspotify.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("API for analyzing Spotify top hits")
@RequestMapping("/")
public class ApiController {

    @GetMapping
    public ResponseEntity getDeciles(@RequestParam(value = "colname", defaultValue = "energy") String colname,
                                     @RequestParam(value = "year", defaultValue = "0") int year) {
        try {
            return ResponseEntity.ok(String.format("It works!\ncolname=%s\nyear=%d", colname, year));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(String.format("Неверный запрос:\n%s", e.getMessage()));
        }
    }
}
