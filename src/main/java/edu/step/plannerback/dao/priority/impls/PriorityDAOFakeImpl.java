package edu.step.plannerback.dao.priority.impls;

import edu.step.plannerback.dao.priority.interfaces.IPriorityDAO;
import edu.step.plannerback.datasource.DataSourceFake;
import edu.step.plannerback.model.Priority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.List;

@Qualifier("Fake")
@Component
public class PriorityDAOFakeImpl implements IPriorityDAO {

    @Autowired
    DataSourceFake dataSource;

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
        return dataSource.list;
    }
}
