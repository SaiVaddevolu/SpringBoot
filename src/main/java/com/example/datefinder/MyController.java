package com.example.datefinder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {
    
    @GetMapping("/")

    public String getdatefinder(){
        LocalDate now = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate Newdate = now.plusDays(100);
        String str = Newdate.format(format1);
        return str;
    }
}
