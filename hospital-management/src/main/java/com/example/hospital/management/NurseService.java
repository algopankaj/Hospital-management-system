package com.example.hospital.management;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class NurseService {

    NurseRepository nurseRepository=new NurseRepository();
    public String addNurse(Nurse nurse){

        if(nurse.getNurseId()<0){
            return "Enter a valid nurseI !";
        }
        if(nurse.getName().equals(null)){
            return "Nurse can't be added !";
        }

        String ans=nurseRepository.addNurse(nurse);
        return ans;
    }

    public List<Nurse> getList(Integer age) {
        List<Nurse> nurses = nurseRepository.getAllNurse();
        List<Nurse>finalList=new ArrayList<>();
        for(Nurse nurse1 : nurses){
            if(nurse1.getAge()>age){
                finalList.add(nurse1);
            }
        }
        return finalList;
    }

    public List<Nurse>callService(String qualification){
        List<Nurse>finalList=new ArrayList<>();
        List<Nurse>ans=nurseRepository.getAllNurse();
        for(Nurse ans1:ans){
            if(ans1.getQualification().equals(qualification)){
                finalList.add(ans1);
            }
        }
        return finalList;
    }

}
