package com.example.hospital.management;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class NurseRepository {

    HashMap<Integer,Nurse>nurseDb=new HashMap<>();
    public String addNurse(Nurse nurse){
        int key=nurse.getNurseId();
        nurseDb.put(key,nurse);
        return "String added successfully !";
    }

    public List<Nurse> getAllNurse(){
        return nurseDb.values().stream().toList();
    }


}
