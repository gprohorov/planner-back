package edu.step.plannerback.dao.priority.impls;

import edu.step.plannerback.dao.priority.interfaces.IPriorityDAO;
import edu.step.plannerback.model.Priority;
import edu.step.plannerback.repository.PriorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Qualifier("Mongo")
@Component
public class PriorityDAOMongoImpl implements IPriorityDAO {

    @Autowired
    PriorityRepository repository;
/*

    private List<Priority> list = new ArrayList<Priority>(
            Arrays.asList(
                    new Priority("High", "red"),
                    new Priority("Low", "blue")
            )
    );

    @PostConstruct
    void init(){
        repository.saveAll(list);
        System.out.println(repository.findAll().toString());
    }

*/

    @Override
    public Priority create(Priority priority) {
        return null;
    }

    @Override
    public Priority get(BigInteger id) {
        return null;
    }

    @Override
    public Priority delete(BigInteger id) {
        return null;
    }

    @Override
    public Priority update(Priority priority) {
        return null;
    }

    @Override
    public List<Priority> getAll() {
        return repository.findAll();
    }
}
