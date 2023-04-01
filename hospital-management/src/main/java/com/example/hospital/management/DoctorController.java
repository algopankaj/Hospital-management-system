package com.example.hospital.management;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;
import java.util.HashMap;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    HashMap<Integer, Doctor>doctorDb=new HashMap<>();
    @PostMapping("/add")
    public String addingDoc(@RequestBody Doctor doctor1){
        int id=doctor1.getDoctorId();
        doctorDb.put(id,doctor1);
        return "Doctor has been added Successfully !";
    }

}
