package edu.step.plannerback.controller.rest;



import edu.step.plannerback.model.Priority;
import edu.step.plannerback.service.priority.impls.PriorityServiceImpl;
import edu.step.plannerback.service.priority.interfaces.IPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/priority")
@RestController
@CrossOrigin("*")
public class PriorityController {

    @Autowired
    PriorityServiceImpl service;
    //IPriorityService service;

    @RequestMapping("/list")
    public List<Priority> getAll(){
        return service.getAll();
    }


}
