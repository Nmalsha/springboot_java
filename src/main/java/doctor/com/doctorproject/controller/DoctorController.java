package doctor.com.doctorproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    @ResponseBody
    @GetMapping("/doctor/1")
    public String getDoctor1() {
        return "William Hartnell";
    }
    
    @ResponseBody
    @GetMapping("/doctor/10")
    public String getDoctor10() {
        return "David Tennant";
    }

    @ResponseBody
    @GetMapping("/doctor/13")
    public String getDoctor13() {
        return "Jodie Whittaker";
    }
}