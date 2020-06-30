package com.revature.rms.auth.repos;

import com.revature.rms.auth.documents.AppUser;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveMongoRepository<AppUser, String> {
}
