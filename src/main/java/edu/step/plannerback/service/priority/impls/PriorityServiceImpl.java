package edu.step.plannerback.service.priority.impls;

import edu.step.plannerback.dao.priority.interfaces.IPriorityDAO;
import edu.step.plannerback.model.Priority;
import edu.step.plannerback.service.priority.interfaces.IPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriorityServiceImpl implements IPriorityService {

  private IPriorityDAO dao;

   @Autowired
    public PriorityServiceImpl(@Qualifier("Mongo") IPriorityDAO dao) {
        this.dao = dao;
    }


    @Override
    public List<Priority> getAll() {
        return dao.getAll();
    }
}
