package com.example.hospital.management;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class PatientController {

    HashMap<Integer,Patient>patientDb=new HashMap<>();

    @PostMapping("/addPatient")
    public String addPatient(@RequestBody Patient patient1){
        int key=patient1.getPatientId();
        patientDb.put(key,patient1);
        return "Patient added successfully !";
    }

   @GetMapping("/getPatientInfo")
    public Patient getInfo(@RequestParam("patientId")Integer patientId){
     Patient p1=  patientDb.get(patientId);

     return p1;
   }
  @GetMapping("/getAllPatient")
    public List<Patient> getALl(){
        List<Patient>all=new ArrayList<>();
        for(Patient patient :patientDb.values()){
            all.add(patient);
        }
        return all;
  }
  @GetMapping("/getPatientByName")
    public Patient getting(@RequestParam("name") String name){
        for(Patient patient:patientDb.values()){
            if(patient.getName().equals(name)){
                return patient;
            }
        }
    return null;
  }
  @GetMapping("/getPatientsListGreaterThanAge")
    public List<Patient> ager(@RequestParam("age") Integer age){
        List<Patient>lists=new ArrayList<>();
        for(Patient patient :patientDb.values()){
            if(patient.getAge()>age){
                lists.add(patient);
            }
        }
       return lists;
  }


}
