package edu.step.plannerback.dao.priority.interfaces;

import edu.step.plannerback.model.Priority;

import java.math.BigInteger;
import java.util.List;

public interface IPriorityDAO {
    Priority create(Priority priority);
    Priority get(BigInteger id);
    Priority delete(BigInteger id);
    Priority update(Priority priority);
    List<Priority> getAll();


}
