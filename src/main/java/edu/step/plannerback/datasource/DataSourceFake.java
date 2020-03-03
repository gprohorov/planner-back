package edu.step.plannerback.datasource;


import edu.step.plannerback.model.Priority;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataSourceFake {
    public List<Priority> list = new ArrayList<>(
            Arrays.asList(
                    new Priority(BigInteger.valueOf(1), "URGENT", "black"),
                    new Priority(BigInteger.valueOf(2), "super High", "white")
            )
    );

}
