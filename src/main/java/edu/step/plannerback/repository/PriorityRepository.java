package edu.step.plannerback.repository;

import edu.step.plannerback.model.Priority;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;


@Repository
public interface PriorityRepository extends MongoRepository<Priority, BigInteger> {
}
